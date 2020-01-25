public class MinStack extends ArrayStack {

    ArrayStack auxStack;

    public MinStack(int size) {
        super(size);
        auxStack = new ArrayStack(size);
    }

    @Override
    public boolean push(int val) {
        StackElement item = auxStack.peek();
        if (!item.isValid() || val < item.getData()) {
            auxStack.push(val);
        }
        return super.push(val);
    }

    @Override
    public boolean pop() {
        StackElement auxItem = auxStack.peek();
        StackElement item = super.peek();

        if (item.isValid() && item.equals(auxItem)) {
            auxStack.pop();
        }
        return super.pop();
    }

    // add your comments for your design here
    public StackElement getMin() {
        return auxStack.peek();
    }
}
