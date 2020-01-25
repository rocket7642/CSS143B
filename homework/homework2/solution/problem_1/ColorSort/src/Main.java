/*
CSS143B homework 2, problem 1
by [your name]
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("testColorSort " + (Tests.testColorSort() ? "PASSED" : "FAILED"));
    }

    public static void colorSort(int[] nums) {
        int p0 = 0;
        int p1 = 0;
        int p2 = nums.length - 1;

        while (p1 <= p2) {
            if (nums[p1] == 0) {
                swap(nums, p0, p1);
                p0++;
                p1++;
                continue;
            }

            if (nums[p1] == 1) {
                p1++;
                continue;
            }

            if (nums[p1] == 2) {
                swap(nums, p1, p2);
                p2--;
                continue;
            }
        }
    }

    private static void swap(int[] num, int i, int j) {
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
    }
}
