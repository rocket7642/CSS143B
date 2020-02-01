import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    // helper function
    // find the sum data[0]...data[n-1]
    private static int recursiveSum(int[] data, int n) {
        if (n==0) {
            return 0;
        }

        return recursiveSum(data, n-1) + data[n-1];
    }

    public static int recursiveSum(int[] data) {
        return recursiveSum(data, data.length);
    }

    public static int iterativeSum(int[] data) {
        int sum = 0;
        for (Integer i : data) {
            sum += i;
        }
        return sum;
    }

    // convert array to List https://www.java67.com/2019/03/how-to-convert-int-array-to-arraylist-in-java-8-example.html
    // use lamda for sum https://www.baeldung.com/java-stream-sum
    public static int coolSum(int[] data) {
        List<Integer> dataAsList = IntStream.of(data)
                .boxed().collect(Collectors.toCollection(ArrayList::new));
        return dataAsList.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        testRecursiveSum();
    }

    private static void testRecursiveSum() {
        int testSize = 100;
        int data[] = new int[testSize];
        for (int i=0; i<testSize; i++) {
            data[i] = i*10;
        }

        int expected = iterativeSum(data);
        int coolExpected = coolSum(data);
        int actual = recursiveSum(data);

        if (expected==coolExpected && expected==actual) {
            System.out.printf("testRecursiveSum PASSED: expected %d, cool expected %d, actual %d",
                    expected, coolExpected, actual);
            return;
        }

        System.out.printf("testRecursiveSum FAILED: expected %d, cool expected %d, actual %d",
                                    expected, coolExpected, actual);
    }
}
