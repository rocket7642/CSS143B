public interface Queue {

    boolean enqueue(int val);

    Item dequeue();

    int size();
}
