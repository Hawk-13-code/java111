class IntNode {
    int value;
    IntNode next;

    public IntNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class IntContainer {
    private IntNode head;
    private int size;

    public IntContainer() {
        this.head = null;
        this.size = 0;
    }

    public void add(int value) {
        if (head == null) {
            head = new IntNode(value);
        } else {
            IntNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new IntNode(value);
        }
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");

        IntNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");

        if (index == 0) {
            head = head.next;
        } else {
            IntNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public int size() {
        return size;
    }
}
