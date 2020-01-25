import java.util.Arrays;

public class ArrayStack implements Stack {

    private int data[];
    private int size;

    private ArrayStack() {}

    public ArrayStack(int size) {
        data = new int[size];
        this.size = 0;
    }

    @Override
    public boolean pop() {
        if (size==0) {
            return false;
        }
        size--;
        return true;
    }

    @Override
    public boolean push(int val) {
        if (size==data.length) {
            return false;
        }
        data[size] = val;
        size++;
        return true;
    }

    @Override
    public StackElement peek() {
        if (size==0) {
            return new StackElement(-1, false);
        }
        return new StackElement(data[size-1], true);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
