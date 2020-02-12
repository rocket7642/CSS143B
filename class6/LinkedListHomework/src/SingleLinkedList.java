import java.util.Objects;

public class SingleLinkedList {

    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    public SingleLinkedList(SingleLinkedList list) {
        // Note: list.head can never be null

        head = new ListNode();  // dummy node
        ListNode ptr = head;
        ListNode otherListNode = list.head.next;
        while (otherListNode != null) {
            ptr.next = new ListNode(otherListNode.val);
            ptr = ptr.next;
            otherListNode = otherListNode.next;
            size++;
        }
    }

    public SingleLinkedList(int[] data) {
        head = new ListNode();  // dummy node
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    public int remove(int valueToRemove) {
        int count = 0;
        ListNode ptr = head;
        while (ptr.next != null) {
            if (ptr.next.val == valueToRemove) {
                ptr.next = ptr.next.next;
                size--;
                count++;
                continue;
            }
            ptr = ptr.next;
        }
        return count;
    }

    public void reverseIterative() {
        if (size < 2) {
            return;
        }
        ListNode p1 = head.next;
        ListNode p2 = p1.next;
        while (p2 != null) {
            p1.next = p2.next;
            p2.next = head.next;
            head.next = p2;
            p2 = p1.next;
        }
    }

    // buggy code
    public void mergeSorted(SingleLinkedList listToMerge) {
        ListNode p0 = head;
        ListNode p1 = listToMerge.head.next;
        while (p1 != null) {
            if (p0.next != null && p0.next.val <= p1.val) {
                p0 = p0.next;
                continue;
            }
            ListNode newNode = new ListNode(p1.val);
            newNode.next = p0.next;
            p0.next = newNode;
            p1 = p1.next;
            size++;
        }
    }

    int size() {
        return size;
    }

    public Item getFirst() {
        return get(0);
    }

    public Item getLast() {
        return get(size - 1);
    }

    // Returns the element at the specified position in this list
    public Item get(int index) {
        if (index < 0 || index >= size) {
            return new Item(-1, false);
        }
        ListNode ptr = head.next;
        for (int i = 0; i < index; i++) {
            if (ptr == null) {
                return new Item(-1, false);
            }
            ptr = ptr.next;
        }
        return new Item(ptr.val, true);
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    // Inserts the specified element at the beginning of this list
    public void addFirst(int val) {
        size++;
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
    }

    // Removes and returns the first element from this list
    public void removeFirst() {
        if (head.next == null) {
            return;
        }
        head.next = head.next.next;
        size--;
    }

    // Removes and returns the last element from this list
    public void removeLast() {
        if (head.next == null) {
            return;
        }
        size--;

        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2.next != null) {
            p1 = p2;
            p2 = p2.next;
        }
        p1.next = null;
    }

    public boolean equals(SingleLinkedList otherList) {
        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, size);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val + (ptr.next == null ? " -> end " : " -> "));
            ptr = ptr.next;
        }
        ;

        return builder.toString();
    }
}
