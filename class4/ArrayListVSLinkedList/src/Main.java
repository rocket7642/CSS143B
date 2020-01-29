import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    //private static int testSize = 100000;
    private static int testSize = 20000*15;

    public static void main(String[] args) {

        testArrayListInsertion();

        /*
        try
        {
            System.out.println("Pausing for 5 sec...");
            Thread.sleep(5000);
            System.out.println("Go!");
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        */

        testLinkedListInsertion();

    }

    private static void testLinkedListInsertion() {
        List<Integer> list2 = new LinkedList<>();
        long startTime = System.nanoTime();

        insertIntoLinkedList(list2);

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("insert into LinkedList : " + durationInMillis);

    }

    private static void testArrayListInsertion() {
        // allocate and prefill the arraylist
        List<Integer> list1 = new ArrayList<>(testSize);
        for (int i=0; i<testSize; i++) {
            list1.add(i, 0);
        }

        // timing method based on https://howtodoinjava.com/java/date-time/execution-elapsed-time/
        long startTime = System.nanoTime();

        insertIntoArrayList(list1);

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("insert into ArrayList : " + durationInMillis);

    }

    private static void insertIntoArrayList(ArrayList<Integer> list) {
        for (int i=0; i<testSize; i++) {
            list.add(0, i+1);
        }
    }

    private static void insertIntoLinkedList(List<Integer> list) {

        for (int i=0; i<testSize; i++) {
            list.add(0, i+1);
        }
    }
}
