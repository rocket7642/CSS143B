public interface Queue {
    boolean enqueue(int val);
    QueueElement dequeue();
    int size();
}
