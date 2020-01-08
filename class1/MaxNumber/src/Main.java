public class Main {
    public static void main(String[] args) {
        System.out.println("testFindMax " + (testFindMax() ? "PASSED" : "FAILED"));
    }

    public static boolean testFindMax() {
        int data[] = {-1, 0, 9, 3, 2};
        return findMax(data) == 9;
    }

    public static int findMax(int []data) {
        if (data.length<=0) {
            return -1;
        }
        int val = data[0];
        for (int i=1; i<data.length; i++) {
            if (val<data[i]) {
                val = data[i];
            }
        }

        return val;
    }
}
