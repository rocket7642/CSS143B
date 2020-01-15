public class Main {
    public static void main(String[] args) {
        System.out.println("testArrayQueueEmptyQueue " + (Tests.testArrayQueueEmptyQueue() ? "PASSED" : "FAILED"));
        System.out.println("testArrayQueueQueueOfSizeOne " + (Tests.testArrayQueueQueueOfSizeOne() ? "PASSED" : "FAILED"));
        System.out.println("testArrayQueueQueueOfSizeTwo " + (Tests.testArrayQueueQueueOfSizeTwo() ? "PASSED" : "FAILED"));
    }
}
