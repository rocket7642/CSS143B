public class Main {

    public static void main(String[] args) {
        System.out.println("testReverseArray " + (testReverseArray() ? "PASSED" : "FAILED"));
    }

    public static void reverseArray(int[] values) {
        int size = values.length;
        for (int i=0; i<size/2; i++) {
            /*
            int temp = values[i];
            values[i] = values[size-1-i];
            values[size-1-i] = temp;
             */

            // swap two numbers without extra space
            // a = a - b
            // b = b + a
            // a = b - a
            if (values[i]!=values[size-1-i]) {
                values[i] = values[i] - values[size-1-i];
                values[size-1-i] = values[size-1-i] + values[i];
                values[i] = values[size-i-1] - values[i];
            }
        }
    }

    public static boolean testReverseArray() {
        // prepare the answers
        int inputs[][] = {
                {},
                {1},
                {-2, 2},
                {3, -3},
                {1, 2, 3},
                {3, 2, 1, 0},
                {-4, -4, -4},
                {-1, 0, 9, 3, 2}};

        int outputs[][] = {
                {},
                {1},
                {2, -2},
                {-3, 3},
                {3, 2, 1},
                {0, 1, 2, 3},
                {-4, -4, -4},
                {2, 3, 9, 0, -1}};

        for (int i=0; i<inputs.length; i++) {

            reverseArray(inputs[i]);

            for (int j=0; j<inputs[i].length; j++) {

                int expected = outputs[i][j];
                int actual = inputs[i][j];

                if (expected!=actual) {
                    System.out.printf("Case %d: index %d, Expected %d, actual %d\n", i, j, expected, actual);
                    return false;
                }
            }
        }
        return true;
    }
}
