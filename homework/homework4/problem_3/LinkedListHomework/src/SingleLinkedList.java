public class SingleLinkedList {

    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    public void reverseIterative() {
       // homework
    }

    int size() {
        return size;
    }

    public Item getFirst() {
        return get(0);
    }

    public Item getLast() {
        return get(size-1);
    }

    // Returns the element at the specified position in this list
    public Item get(int index) {
        if (index<0 || index>=size) {
            return new Item(-1, false);
        }
        ListNode ptr = head.next;
        for (int i=0; i<index; i++) {
            if (ptr==null) {
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
        while (ptr.next!=null) {
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
        if (head.next==null) {
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

        while (p2.next!=null) {
            p1 = p2;
            p2 = p2.next;
        }
        p1.next = null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr!=null) {
            builder.append(ptr.val + (ptr.next==null ? " -> end " : " -> "));
            ptr = ptr.next;
        };

        return builder.toString();
    }
}
