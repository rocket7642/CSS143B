/*
CSS143B homework 1, problem 1
by [your name]
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("testBinarySearch " + (testBinarySearch() ? "PASSED" : "FAILED"));
    }

    // helper function
    public static int binarySearch(int []data, int target, int start, int end) {
        // homework
        return -1; // place holder
    }

    public static int binarySearchRecursive(int[] data, int target) {
       return binarySearch(data, target, 0, data.length-1);
    }

    public static int binarySearchIterative(int[] data, int target) {
        // homework
        return -1; // place holder
    }

    public static boolean testBinarySearch() {
        int inputs[][] = {
                {},
                {3},
                {3},
                {1,3},
                {1,3},
                {4,6,8},
                {4,6,8},
                {4,6,8},
                {3,5,7,9,20},
                {3,5,7,9,20},
        };
        int targets[] = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int answer[] = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        for (int i=0; i<inputs.length; i++) {
            int iterativeAnswer = binarySearchIterative(inputs[i], targets[i]);
            int recursiveAnswer = binarySearchRecursive(inputs[i], targets[i]);
            int expected = answer[i];
            if (iterativeAnswer!=expected || recursiveAnswer!=expected) {
                System.out.printf("testBinarySearch: case %d, expected %d, iterativeAnswer %d, recursiveAnswer %d\n",
                                    i, expected, iterativeAnswer, recursiveAnswer);
                return false;
            }
        }
        return true;
    }
}
