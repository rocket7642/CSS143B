public class Main {

    public static void main(String[] args) {
        System.out.println("testReverseArray " + (testReverseArray() ? "PASSED" : "FAILED"));
    }

    public static void reverseArray(int[] values) {
        // write your own code
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

        // write your own tests

        return false; // placeholder
    }
}
