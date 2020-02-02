import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    // helper function
    // find the max from data[k]...data[data.length-1]
    public static int findMaxRecursive(int[] data, int k) {
        if (k==(data.length-1)) {
            return data[data.length-1];
        }
        int maxInKToN = findMaxRecursive(data, k+1);
        System.out.printf("findMaxRecursive: comparing %d with %d\n", data[k], maxInKToN);
        return Math.max(data[k], maxInKToN);
    }

    public static int findMaxRecursive(int[] data) {
        return findMaxRecursive(data, 0);
    }

    public static int findMaxIterative(int[] data) {
        int max = data[0];
        for (int i=1; i<data.length; i++) {
            System.out.printf("findMaxIterative: comparing %d with %d\n", max, data[i]);
            if (max<data[i]) {
                max = data[i];
            }
        }
        return max;
    }

    /*
    this is to implement the findMax that does the same comparison
    sequence as the recursion version without actually using recursion
     */
    public static int findMaxUsingStack(int [] data) {
        Stack stack = new ArrayStack(data.length);
        for (int i=0; i<data.length-1; i++) {
            stack.push(data[i]);
        }

        int max = data[data.length-1];
        while (stack.size()!=0) {
            int topVal = stack.peek().getData();
            System.out.printf("findMaxUsingStack: comparing %d with %d\n", topVal, max);
            max = Math.max(topVal, max);
            stack.pop();
        }
        return max;
    }

    public static void main(String[] args) {
        testFindMax();
    }

    private static void testFindMax() {
        int data[][] = {
                {5, 3, 2, 9, -1, 8},
//                {9, -1, 3, 2},
 //               {6, 5, 3, 10},
        };

        int[] expected = {9, 9, 10};

        for (int i=0; i<data.length; i++) {
            int maxIter = findMaxIterative(data[i]);
            int maxRec = findMaxRecursive(data[i]);
            int maxStack = findMaxUsingStack(data[i]);

            if (maxIter==maxRec && maxRec==maxStack && maxStack==expected[i]) {
                System.out.printf("testRecursiveSum PASSED: case %d, expected %d, stackMax %d, iterativeMax %d, Recursive Max %d\n",
                        i, expected[i], maxStack, maxIter, maxRec);

            } else {
                System.out.printf("testRecursiveSum FAILED: case %d, expected %d, stackMax %d, iterativeMax %d, Recursive Max %d\n",
                        i, expected[i], maxStack, maxIter, maxRec);

            }
        }
    }
}
