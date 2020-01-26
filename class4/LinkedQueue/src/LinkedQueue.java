public class LinkedQueue implements Queue{
    SingleLinkedList queue;

    public LinkedQueue() {
        queue = new SingleLinkedList();
    }

    public int size() {
        return queue.size();
    }

    @Override
    public boolean enqueue(int val) {
        queue.add(val);
        return true;
    }

    @Override
    public Item dequeue() {
        Item retVal = queue.getFirst();
        queue.removeFirst();
        return retVal;
    }
}
