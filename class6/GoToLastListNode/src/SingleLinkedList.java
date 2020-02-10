/*
 * Single Linked List without dummy node
 */
public class SingleLinkedList {

    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    public SingleLinkedList(int[] data) {
        ListNode ptr = null;
        for (int datum : data) {
            ListNode newNode = new ListNode(datum);
            if (head==null) {
                head = newNode;
                ptr = head;
                continue;
            }
            ptr.next = newNode;
            ptr = ptr.next;
            size++;
        }
    }

    public ListNode getLast() {
        if (head==null) {
            return null;
        }
        ListNode ptr = head;
        while (ptr.next!=null) {
            ptr = ptr.next;
        }
        return ptr;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head;
        while (ptr != null) {
            builder.append(ptr.val + (ptr.next == null ? " -> end" : " -> "));
            ptr = ptr.next;
        }

        return builder.toString();
    }
}
