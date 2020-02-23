public class LinkedListTests extends Tests {

    public static void testAll() {
        testReverseRecursive();
        testEmptyList();
        testListWithMultipleElements();
        testToString();
        testEquals();
    }

    public static void testReverseRecursive() {
        int input[][] = {
                {0},
                {0,1},
                {1,1},
                {0,1,2},
                {0,1,2,3,4,5},
        };
        int expected[][] = {
                {0},
                {1,0},
                {1,1},
                {2,1,0},
                {5,4,3,2,1,0},
        };

        for (int i=0; i<expected.length; i++) {
            SingleLinkedList list = new SingleLinkedList(input[i]);
            list.reverseRecursive();
            if (!assertTrue(list.equals(new SingleLinkedList(expected[i])))) {
                System.out.println("testReverseRecursive FAILED");
                return;
            }
        }
        System.out.println("testReverseRecursive PASSED");
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
        if (!assertEquals(list.toString(), "1 -> end ")) {
            System.out.println("testToString FAILED");
            return;
        }
        list.add(2);
        if (!assertEquals(list.toString(), "1 -> 2 -> end ")) {
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
