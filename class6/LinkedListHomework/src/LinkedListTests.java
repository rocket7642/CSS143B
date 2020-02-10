public class LinkedListTests extends Tests {

    public static void testAll() {
        testCopyConstructor();
        testRemove();
        testReverseIterative();
        testMergeSorted();
        testEmptyList();
        testListWithMultipleElements();
        testToString();
        testEquals();
    }

    public static void testCopyConstructor() {
        // empty list
        SingleLinkedList myList = new SingleLinkedList();
        SingleLinkedList theirEmptyList = new SingleLinkedList(myList);
        if (!assertTrue(myList.equals(theirEmptyList))) {
            System.out.println("testCopyConstructor FAILED");
            return;
        }
        // 1 nodes
        // 2 nodes, different values
        // 3 nodes, different values
        // goes up to 5 nodes with different values
        for (int i = 0; i < 5; i++) {
            myList.add(i);
            SingleLinkedList theirList = new SingleLinkedList(myList);
            if (!assertTrue(myList.equals(theirList))) {
                System.out.println("testCopyConstructor FAILED");
                return;
            }
        }

        // two nodes with the same values
        myList = new SingleLinkedList();
        myList.add(2);
        myList.add(2);
        SingleLinkedList theirList = new SingleLinkedList(myList);
        if (!assertTrue(myList.equals(theirList))) {
            System.out.println("testCopyConstructor FAILED");
            return;
        }
        System.out.println("testCopyConstructor PASSED");   // place holder
    }

    public static void testRemove() {
        int[][] inputs = {
                {1, 2, 3},
                {1, 2, 4, 2},
                {1, 1, 4, 2},
                {3, 3, 3, 3},
                {1, 1, 4, 2},
        };
        int[] targets = {3, 2, 1, 3, 5};
        int[][] expects = {
                {1, 2},
                {1, 4},
                {4, 2},
                {},
                {1, 1, 4, 2},
        };
        int[] expectedSize = {2, 2, 2, 0, 4};
        int[] expectedCounts = {1, 2, 2, 4, 0};

        // empty list
        SingleLinkedList emptyList = new SingleLinkedList();
        int count = emptyList.remove(3);
        if (!assertEquals(emptyList.size(), 0) || !assertEquals(count, 0)) {
            System.out.println("testRemove FAILED");
            return;
        }

        // non-empty list
        for (int i = 0; i < inputs.length; i++) {
            SingleLinkedList list = new SingleLinkedList(inputs[i]);
            SingleLinkedList expectedList = new SingleLinkedList(expects[i]);
            int actualRemoved = list.remove(targets[i]);
            if (!assertTrue(list.equals(expectedList)) ||
                    actualRemoved != expectedCounts[i] ||
                    !assertEquals(list.size(), expectedSize[i])) {
                System.out.println("testRemove FAILED");
                return;
            }
        }
        System.out.println("testRemove PASSED");
    }

    public static void testReverseIterative() {
        int[][] inputs = {
                {},
                {1},
                {1, 2},
                {3, 3},
                {1, 4, 2},
                {3, 4, 5, 6, 7},
        };
        int[][] expected = {
                {},
                {1},
                {2, 1},
                {3, 3},
                {2, 4, 1},
                {7, 6, 5, 4, 3},
        };
        for (int i = 0; i < inputs.length; i++) {
            SingleLinkedList list = new SingleLinkedList(inputs[i]);
            SingleLinkedList reversed = new SingleLinkedList(expected[i]);

            list.reverseIterative();

            if (!assertTrue(list.equals(reversed))) {
                System.out.println("testReverseIterative FAILED");
                return;
            }
        }
        System.out.println("testReverseIterative PASSED");   // place holder
    }

    public static void testMergeSorted() {
        int[][] otherLists = {
                {},
                {},
                {1},
                {1},
                {1, 3},
                {1, 3},
                {6, 7, 8},
                {3, 3, 8},
        };
        int[][] myLists = {
                {},
                {2},
                {},
                {2},
                {2, 4},
                {4, 5},
                {4, 5},
                {2, 5},
        };
        int[][] expected = {
                {},
                {2},
                {1},
                {1, 2},
                {1, 2, 3, 4},
                {1, 3, 4, 5},
                {4, 5, 6, 7, 8},
                {2, 3, 3, 5, 8},
        };
        for (int i = 0; i < myLists.length; i++) {
            SingleLinkedList myList = new SingleLinkedList(myLists[i]);
            SingleLinkedList otherList = new SingleLinkedList(otherLists[i]);
            SingleLinkedList expect = new SingleLinkedList(expected[i]);

            myList.mergeSorted(otherList);

            if (!assertTrue(myList.equals(expect))) {
                System.out.println("case " + i + " testMergeSorted FAILED");
                return;
            }
        }
        System.out.println("testMergeSorted PASSED");   // place holder
    }

    private static void testListWithMultipleElements() {
        Item invalidItem = new Item(-1, false);
        SingleLinkedList list = new SingleLinkedList();

        // list as [-1, 1, 2]
        list.add(1);
        list.add(2);
        list.addFirst(-1);

        if (!assertEquals(list.size(), 3)) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(0), new Item(-1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(1), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(2), new Item(2, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(3), invalidItem)) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        list.removeLast();
        if (!assertEquals(list.get(0), new Item(-1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.getLast(), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        list.removeFirst();
        if (!assertEquals(list.get(0), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.getLast(), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        System.out.println("testListWithOneElement PASSED");
    }

    private static void testToString() {
        SingleLinkedList list = new SingleLinkedList();
        assertTrue(list.toString().isEmpty());
        list.add(1);
        if (!assertEquals(list.toString(), "1 -> end")) {
            System.out.println("testToString FAILED");
            return;
        }
        list.add(2);
        if (!assertEquals(list.toString(), "1 -> 2 -> end")) {
            System.out.println("testToString FAILED");
            return;
        }
        System.out.println("testToString PASSED");
    }

    private static void testEmptyList() {
        Item invalidItem = new Item(-1, false);
        SingleLinkedList list = new SingleLinkedList();

        if (!assertEquals(list.size(), 0)) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertEquals(invalidItem, list.getFirst())) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertEquals(invalidItem, list.getLast())) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertEquals(invalidItem, list.get(0))) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertTrue(list.toString().isEmpty())) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        System.out.println("testEmptyList PASSED");
    }

    public static void testEquals() {
        SingleLinkedList l1 = new SingleLinkedList();
        SingleLinkedList l2 = new SingleLinkedList();

        assertTrue(l1.equals(l2));
        assertTrue(l2.equals(l1));

        l1.add(1);
        assertFalse(l1.equals(l2));
        assertFalse(l2.equals(l1));

        l1.add(2);
        l2.add(1);
        assertFalse(l1.equals(l2));
        assertFalse(l2.equals(l1));

        l1.add(3);
        l2.add(2);
        assertFalse(l1.equals(l2));
        assertFalse(l2.equals(l1));

        l2.add(3);
        assertTrue(l1.equals(l2));
        assertTrue(l2.equals(l1));

        System.out.println("testEquals PASSED");   // place holder
    }

}
