public class ValidParentheses {
    public static boolean isValid(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            return true;
        }

        Stack stack = new ArrayStack(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            StackElement item = stack.peek();
            char left = (char) item.getData();
            if (!item.isValid() || !characterMatch(left, c)) {
                stack.push((int) c);
                continue;
            }
            stack.pop();
        }
        return stack.size() == 0;
    }

    private static boolean characterMatch(char left, char right) {
        if (left == '(') {
            return right == ')';
        }
        if (left == '{') {
            return right == '}';
        }
        if (left == '[') {
            return right == ']';
        }
        return false;
    }

    public static boolean testIsValid() {
        String[] inputs = {"(}",
                "{}()",
                ")[](",
                "", // new cases from here down
                "[]{}()",
                "[[{{}}]]()",
                "[()]{",
                "[]({})"};
        boolean[] expected = {false, true, false, true, true, true, false, true};

        for (int i = 0; i < inputs.length; i++) {
            boolean actual = isValid(inputs[i]);
            if (actual != expected[i]) {
                System.out.println("testIsValid failed: case '" + inputs[i] + "', expected " +
                        expected[i] + ", actual " + actual);
                return false;
            }
        }
        return true;
    }
}
