import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    private static int factor = 2;
    private static int testSize = 100000 * factor;

    public static void main(String[] args) {

        testArrayListInsertion();

        testLinkedListInsertion();

    }

    private static void testLinkedListInsertion() {
        List<Integer> list2 = new LinkedList<>();

        // timing method based on https://howtodoinjava.com/java/date-time/execution-elapsed-time/
        long startTime = System.nanoTime();

        insertIntoList(list2);

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("insert into LinkedList : " + durationInMillis);
    }

    private static void testArrayListInsertion() {
        // allocate and prefill the arraylist
        // this prevents re-allocating array as the
        // size of array increases when running the test
        List<Integer> list1 = new ArrayList<>(testSize);
        for (int i = 0; i < testSize; i++) {
            list1.add(i, 0);
        }

        // timing method based on https://howtodoinjava.com/java/date-time/execution-elapsed-time/
        long startTime = System.nanoTime();

        insertIntoList(list1);

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("insert into ArrayList : " + durationInMillis);
    }

    private static void insertIntoList(List<Integer> list) {
        for (int i = 0; i < testSize; i++) {
            list.add(0, i + 1);
        }
    }
}
