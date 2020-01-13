/*
CSS143B homework 1, problem 2
by [your name]
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("testBubbleSort " + (testBubbleSort() ? "PASSED" : "FAILED"));
    }

    // sort the input array in ascending order
    public static void bubbleSort(int[] data) {
        for (int i=0; i<data.length-1; i++) {
            for (int j=0; j<data.length-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public static boolean testBubbleSort() {
        int inputs[][] = {
                {3},
                {3,2},
                {2,3},
                {6,5,1},
                {-1,8,0},
                {0,-2,9,3}
        };
        int expects[][] = {
                {3},
                {2,3},
                {2,3},
                {1,5,6},
                {-1,0,8},
                {-2,0,3,9}
        };

        for (int i=0; i<inputs.length; i++) {
            bubbleSort(inputs[i]);

            for (int j=0; j<inputs[i].length; j++) {
                if (inputs[i][j]!=expects[i][j]) {
                    System.out.printf("testBubbleSort: case %d, expected: %s, actual %s\n",
                            i, Arrays.toString(expects[i]), Arrays.toString(inputs[i]));
                    return false;
                }
            }
        }
        return true;
    }
}
