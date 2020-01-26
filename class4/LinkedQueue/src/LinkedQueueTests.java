public class LinkedQueueTests extends Tests{
    public static void testAll() {
        testLinkedQueueEmptyQueue();
        testLinkedQueueQueueOfSizeThree();
    }

    public static void testLinkedQueueEmptyQueue() {
        LinkedQueue queue = new LinkedQueue();
        if (!assertEquals(queue.size(), 0)) {
            System.out.println("testLinkedQueueEmptyQueue FAILED");
            return;
        }
        if (!assertEquals(queue.size(), 0)) {
            System.out.println("testLinkedQueueEmptyQueue FAILED");
            return;
        }
        if (!assertFalse(queue.dequeue().isValid())) {
            System.out.println("testLinkedQueueEmptyQueue FAILED");
            return;
        }
        System.out.println("testLinkedQueueEmptyQueue SUCCEEDED");
    }

    public static void testLinkedQueueQueueOfSizeThree() {
        LinkedQueue queue = new LinkedQueue();
        String testName = "testLinkedQueueQueueOfSizeThree";

        queue.enqueue(99);
        queue.enqueue(100);
        queue.enqueue(101);

        if (!assertEquals(queue.size(),3)) {
            System.out.println("testLinkedQueueQueueOfSizeThree FAILED");
            return;
        }

        Item data = queue.dequeue();
        if (!assertEquals(data, new Item(99, true))) {
            System.out.println("testLinkedQueueQueueOfSizeThree FAILED");
            return;
        }

        if (!assertEquals(queue.size(),2)) {
            System.out.println("testLinkedQueueQueueOfSizeThree FAILED");
            return;
        }

        data = queue.dequeue();
        if (!assertEquals(data, new Item(100, true))) {
            System.out.println("testLinkedQueueQueueOfSizeThree FAILED");
            return;
        }

        data = queue.dequeue();
        if (!assertEquals(data, new Item(101, true))) {
            System.out.println("testLinkedQueueQueueOfSizeThree FAILED");
            return;
        }

        if (!assertEquals(queue.size(),0)) {
            System.out.println("testLinkedQueueQueueOfSizeThree FAILED");
            return;
        }

        data = queue.dequeue();
        if (!assertEquals(data, new Item(-1, false))) {
            System.out.println("testLinkedQueueQueueOfSizeThree FAILED");
            return;
        }
        System.out.println("testLinkedQueueQueueOfSizeThree SUCCEEDED");
    }
}
