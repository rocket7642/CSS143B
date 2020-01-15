/*
CSS143B homework 1, problem 1
by [your name]
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("testBinarySearch " + (testBinarySearch() ? "PASSED" : "FAILED"));
        System.out.println("testBinarySearchInLargeArray " + (testBinarySearchInLargeArray() ? "PASSED" : "FAILED"));
    }

    // iterative binary search
    // assuming input array is sorted in ascending order
    // if there's duplicates, only the first found index is returned
    public static int binarySearch(int[] data, int target) {
        int start = 0;
        int end = data.length-1;
        while (start<=end) {
            int mid = (start + end)/2;
            //int mid = start + (end-start)/2;  // fix for overflow
            if (data[mid]==target) {
                return mid;
            }
            if (target>data[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static boolean testBinarySearchInLargeArray() {

        int maxInteger = Integer.MAX_VALUE;

        System.out.println("maximum integer is " + maxInteger);

        int hugeArraySize = maxInteger/3*2;
        int hugeArray[] = new int[hugeArraySize];
        for (int i=0; i<hugeArray.length; i++) {
            hugeArray[i] = i;
        }

        int targets[] = {hugeArray.length/2, hugeArray.length-1};
        int expected[] = {hugeArray.length/2, hugeArray.length-1};

        for (int i=0; i<targets.length; i++) {
            try {
                int actual = binarySearch(hugeArray, targets[i]);
                if (actual!=expected[i]) {
                    System.out.printf("testBinarySearchInLargeArray: case %d failed. Expected %d, actual %d\n",
                            i, expected[i], actual);
                    return false;
                }
            } catch (Exception e) {
                System.out.printf("testBinarySearchInLargeArray: case %d failed. Expected %d. \nException: %s\n",
                        i, expected[i], e.toString());
                return false;
            }
        }
        return true;
    }

    public static boolean testBinarySearch() {
        int inputs[][] = {
                {},
                {3},
                {3},
                {1,3},
                {1,3},
                {4,6,8},
                {4,6,8},
                {4,6,8},
                {3,5,7,9,20},
                {3,5,7,9,20},
        };
        int targets[] = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int answer[] = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        for (int i=0; i<inputs.length; i++) {
            int actual = binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            if (actual!=expected) {
                System.out.printf("testBinarySearch: case %d, expected %d, actual %d\n",
                                    i, expected, actual);
                return false;
            }
        }
        return true;
    }
}
