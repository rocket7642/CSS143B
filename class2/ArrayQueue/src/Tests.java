public class Tests {
    public static boolean testArrayQueueEmptyQueue() {
        ArrayQueue queue = new ArrayQueue(5);
        String testName = "testArrayQueue";

        if (queue.size()!=0) {
            printFailMessage(testName, "size wrong", String.valueOf(0), String.valueOf(queue.size()));
            return false;
        }

        if (queue.dequeue().isValid()) {
            printFailMessage(testName, "dequeue wrong", String.valueOf(false), String.valueOf(true));
            return false;
        }

        return true;
    }

    public static boolean testArrayQueueQueueOfSizeOne() {
        ArrayQueue queue = new ArrayQueue(1);
        String testName = "testArrayQueueQueueOfSizeOne";

        boolean addedNewValue = queue.enqueue(99);

        if (!addedNewValue) {
            printFailMessage(testName, "enqueue wrong", String.valueOf(true), String.valueOf(addedNewValue));
            return false;
        }

        if (queue.size()!=1) {
            printFailMessage(testName, "size wrong", String.valueOf(1), String.valueOf(queue.size()));
            return false;
        }

        QueueElement data = queue.dequeue();

        if (!data.isValid()) {
            printFailMessage(testName, "dequeue wrong", String.valueOf(true), String.valueOf(false));
            return false;
        }

        if (queue.size()!=0) {
            printFailMessage(testName, "size wrong", String.valueOf(0), String.valueOf(queue.size()));
            return false;
        }

        if (queue.dequeue().isValid()) {
            printFailMessage(testName, "dequeue wrong", String.valueOf(false), String.valueOf(true));
            return false;
        }

        queue.enqueue(99);
        addedNewValue = queue.enqueue(100);
        if (addedNewValue) {
            printFailMessage(testName, "enqueue wrong", String.valueOf(false), String.valueOf(addedNewValue));
            return false;
        }
        return true;
    }

    public static boolean testArrayQueueQueueOfSizeTwo() {
        ArrayQueue queue = new ArrayQueue(2);
        String testName = "testArrayQueueQueueOfSizeTwo";

        queue.enqueue(99);
        boolean addedNewValue = queue.enqueue(-100);

        if (!addedNewValue) {
            printFailMessage(testName, "enqueue wrong", String.valueOf(true), String.valueOf(addedNewValue));
            return false;
        }

        if (queue.size()!=2) {
            printFailMessage(testName, "size wrong", String.valueOf(2), String.valueOf(queue.size()));
            return false;
        }

        QueueElement data = queue.dequeue();
        // queue now has [99, -100], 99 being the front

        if (queue.size()!=1) {
            printFailMessage(testName, "size wrong", String.valueOf(1), String.valueOf(queue.size()));
            return false;
        }

        if (!data.isValid() || data.getData()!=99) {
            printFailMessage(testName, "dequeue wrong", data.toString(), "{data:99, isValid:true}");
            return false;
        }

        addedNewValue = queue.enqueue(88);
        // queue now has [-100, 88], 99 being the front

        data = queue.dequeue();
        if (!data.isValid() || data.getData()!=-100) {
            printFailMessage(testName, "dequeue wrong", data.toString(), "{data:-100, isValid:true}");
            return false;
        }

        data = queue.dequeue();
        if (!data.isValid() || data.getData()!=88) {
            printFailMessage(testName, "dequeue wrong", data.toString(), "{data:-100, isValid:true}");
            return false;
        }
        return true;
    }


    private static void printFailMessage(String testName, String message, String expected, String actual) {
        System.out.println(testName + " : " + message +
                ", expected: " + expected +
                ", actual: " + actual);
    }
}
