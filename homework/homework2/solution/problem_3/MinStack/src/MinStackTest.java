import java.util.Arrays;

public class MinStackTest {
    public static boolean testMinStack() {
        int failedCase = 0;

        if (!testPush()) {
            failedCase++;
        }

        if (!testPushPop()) {
            failedCase++;
        }

        return failedCase == 0;
    }

    private static boolean testPushPop() {
        int inputs[] = {5, 4, 3, 2, 1};

        MinStack minStack = new MinStack(inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            minStack.push(inputs[i]);
        }

        for (int i = 0; i < inputs.length; i++) {
            StackElement actual = minStack.getMin();
            StackElement expected = new StackElement(inputs[inputs.length - i - 1], true);

            if (!actual.equals(expected)) {
                System.out.println("testPushPop failed: case " + i + " "
                        + " expected: " + expected + " actual: " + actual);
                return false;
            }
            minStack.pop();
        }

        StackElement expected = new StackElement(-1, false);
        StackElement actual = minStack.getMin();
        if (!actual.equals(expected)) {
            System.out.println("testPushPop failed: case empty,"
                    + " expected: " + expected + " actual: " + actual);
            return false;
        }
        return true;
    }

    private static boolean testPush() {
        int inputs[][] = {
                {},
                {1, 2},
                {2, 1},
                {2, 2},
                {1, 2, 3},
                {3, 2, 1},
                {3, 1, 2},
                {2, 1, 3},
                {2, 2, 2}};
        int outputs[] = {-1, 1, 1, 2, 1, 1, 1, 1, 2};

        StackElement[] expected = new StackElement[outputs.length];
        for (int i = 0; i < outputs.length; i++) {
            boolean isInputEmpty = inputs[i].length == 0;
            expected[i] = new StackElement(isInputEmpty ? -1 : outputs[i],
                    isInputEmpty ? false : true);
        }

        for (int i = 0; i < inputs.length; i++) {
            int[] numbersToPush = inputs[i];
            MinStack minStack = new MinStack(numbersToPush.length);

            for (int j = 0; j < numbersToPush.length; j++) {
                minStack.push(numbersToPush[j]);
            }

            StackElement actual = minStack.getMin();
            if (!actual.equals(expected[i])) {
                System.out.println("testPush failed: case " + i + " "
                        + Arrays.toString(numbersToPush)
                        + " expected: " + expected[i] + " actual: " + actual);
                return false;
            }
        }
        return true;
    }
}
