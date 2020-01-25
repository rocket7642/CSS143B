public class ArrayStackTests {
    public static boolean testArrayStackEmpty() {
        ArrayStack stack = new ArrayStack(5);
        String testName = "testArrayStackEmpty";
        if (stack.size() != 0) {
            printFailMessage(testName, "size wrong", String.valueOf(0), String.valueOf(stack.size()));
            return false;
        }
        if (stack.pop()) {
            printFailMessage(testName, "pop wrong", String.valueOf(false), String.valueOf(true));
            return false;
        }
        return true;
    }

    public static boolean testArrayStackOfSizeOne() {
        ArrayStack stack = new ArrayStack(5);
        String testName = "testArrayStackOfSizeOne";

        stack.push(99);
        if (stack.size() != 1) {
            printFailMessage(testName, "size wrong", String.valueOf(1), String.valueOf(stack.size()));
            return false;
        }

        StackElement actualItem = stack.peek();
        StackElement expectedItem = new StackElement(99, true);
        if (!actualItem.equals(expectedItem)) {
            printFailMessage(testName, "peek wrong",
                    actualItem.toString(), expectedItem.toString());
            return false;
        }

        stack.pop();
        if (stack.size() != 0) {
            printFailMessage(testName, "pop wrong", String.valueOf(0), String.valueOf(stack.size()));
            return false;
        }
        actualItem = stack.peek();
        if (actualItem.isValid()) {
            printFailMessage(testName, "peek wrong",
                    String.valueOf(actualItem.isValid()), String.valueOf(false));
            return false;
        }
        return true;
    }

    public static boolean testArrayStackOfSizeTwo() {
        ArrayStack stack = new ArrayStack(5);
        String testName = "testArrayStackOfSizeTwo";

        stack.push(99);
        stack.push(100);

        StackElement actualItem = stack.peek();
        StackElement expectedItem = new StackElement(100, true);
        if (!actualItem.equals(expectedItem)) {
            printFailMessage(testName, "peek wrong",
                    actualItem.toString(), expectedItem.toString());
            return false;
        }

        stack.pop();
        if (stack.size() != 1) {
            printFailMessage(testName, "pop wrong", String.valueOf(1), String.valueOf(stack.size()));
            return false;
        }
        actualItem = stack.peek();
        expectedItem = new StackElement(99, true);
        if (!actualItem.equals(expectedItem)) {
            printFailMessage(testName, "peek wrong",
                    String.valueOf(actualItem.isValid()), String.valueOf(false));
            return false;
        }
        return true;
    }

    public static boolean testArrayStackOfSizeThree() {
        ArrayStack stack = new ArrayStack(3);
        String testName = "testArrayStackOfSizeThree";

        stack.push(99);
        stack.push(100);
        stack.push(101);

        StackElement actualItem = stack.peek();
        StackElement expectedItem = new StackElement(101, true);
        if (!actualItem.equals(expectedItem)) {
            printFailMessage(testName, "peek wrong",
                    expectedItem.toString(), actualItem.toString());
            return false;
        }

        stack.pop();
        if (stack.size() != 2) {
            printFailMessage(testName, "pop wrong", String.valueOf(2), String.valueOf(stack.size()));
            return false;
        }
        actualItem = stack.peek();
        expectedItem = new StackElement(100, true);
        if (!actualItem.equals(expectedItem)) {
            printFailMessage(testName, "peek wrong",
                    expectedItem.toString(), actualItem.toString());
            return false;
        }

        stack.push(101);
        boolean succeeded = stack.push(102);
        if (succeeded) {
            printFailMessage(testName, "push wrong",
                    String.valueOf(false), String.valueOf(succeeded));
            return false;
        }
        if (stack.size() != 3) {
            printFailMessage(testName, "size wrong", String.valueOf(3), String.valueOf(stack.size()));
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
