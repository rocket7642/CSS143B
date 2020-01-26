public class SingleLinkedList {

    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = null;
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
        ListNode ptr = head;
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
        ListNode newNode = new ListNode(val);

        // when list is empty
        if (head==null) {
            head = newNode;
            return;
        }

        // when list is not empty
        ListNode ptr = head;
        while (ptr.next!=null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }

    // Inserts the specified element at the beginning of this list
    public void addFirst(int val) {
        size++;
        ListNode newNode = new ListNode(val);

        // when list is empty
        if (head==null) {
            head = newNode;
            return;
        }

        // when list is not empty
        newNode.next = head;
        head = newNode;
    }

    // Removes and returns the first element from this list
    public void removeFirst() {
        if (head==null) {
            return;
        }
        head = head.next;
        size--;
    }

    // Removes and returns the last element from this list
    public void removeLast() {
        if (head==null) {
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

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
        if (head==null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head;
        do {
            builder.append(ptr.val + (ptr.next==null ? " -> end " : " -> "));
            ptr = ptr.next;
        }while (ptr!=null);

        return builder.toString();
    }
}
