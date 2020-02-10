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
        /*
         * in class exercise
         */
    }

    public ListNode getLast() {
        /*
         * in class exercise
         */
        return null;    // place holder
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
