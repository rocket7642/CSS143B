public class ArrayQueue implements Queue {

    private int data[];
    private int size;

    // data removed from this side --> [front....end] <-- data added from this side
    private int front;
    private int end;

    private ArrayQueue() {}

    public ArrayQueue(int size) {
        if (size > 0) {
            data = new int[size];
            front = 0;
            end = 0;
        }
    }

    @Override
    public QueueElement dequeue() {
        if (size == 0) {
            return new QueueElement( -1, false);
        }
        int val = data[front];
        front = (front + 1) % data.length;
        size--;
        return new QueueElement(val, true);
    }

    @Override
    public boolean enqueue(int val) {
        if (size == data.length) {
            return false;
        }
        data[end] = val;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }
}
