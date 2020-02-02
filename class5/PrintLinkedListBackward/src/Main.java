public class Main {



    public static void main(String[] args) {
        testprintLinkedListBackward();
    }

    private static void testprintLinkedListBackward() {
        int data[][] = {
                {8,3,2,9,5,6},
        };

        String[] expected = {"6,5,9,2,3,8"};

        for (int i=0; i<data.length; i++) {
            SingleLinkedList list = new SingleLinkedList();
            for (int v : data[i]) {
                list.add(v);
            }
            String actualRecursive = list.printLinkedListBackward();
            String actualStack = list.printLinkedListBackwardWithStack();
            if (!expected[i].equals(actualRecursive) ||
                !expected[i].equals(actualStack)) {
                System.out.printf("testprintLinkedListBackward FAILED: case %d, expected %s, actualRecursive %s, actualStack %s\n",
                                    i, expected[i], actualRecursive, actualStack);
                continue;
            }
            System.out.printf("testprintLinkedListBackward PASSED: case %d, expected %s, actualRecursive %s, actualStack %s\n",
                                    i, expected[i], actualRecursive, actualStack);

        }
    }
}
