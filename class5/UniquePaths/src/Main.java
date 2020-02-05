public class Main {

    // m rows, n columns
    public static int uniquePaths(int m, int n) {
        if (m!=0 && n!=0) {
            System.out.printf("%d,%d\n", m, n);
        }
        if (m==0 || n==0) {
            return 0;
        }

        if (m==1 && n==1) {
            return 1;
        }

        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }

    public static void main(String[] args) {
        int m=3, n=4;
//        testUniquePaths();
        if (args.length==2) {
            m = Integer.valueOf(args[0]);
            n = Integer.valueOf(args[1]);

        }
        uniquePaths(m,n);
    }

    public static void testUniquePaths() {
        int inputs[][] = {
                {0,0},
                {0,1},
                {1,0},
                {1,1},
                {1,2},
                {2,1},
                {2,2},
                {2,4},
                {3,5},
                {10,20},
        };

        int expected[] = {0, 0, 0, 1, 1, 1, 2, 4, 15};

        boolean failed = false;
        for (int i=0; i<inputs.length; i++) {
            int actual = uniquePaths(inputs[i][0], inputs[i][1]);
            if (!Tests.assertEquals(actual, expected[i])) {
                System.out.println("testUniquePaths FAILED: case " + i);
                failed = true;
            }
        }

        if (!failed) {
            System.out.println("testUniquePaths PASSED");
        }
    }
}
