package LinkedLists;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtFirst (int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

//    public void insertAtLast (int val) {
//        if (tail == null) {
//           insertAtFirst(val);
//        }
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        size += 1;
//    }

    public void insertAtLast (int val) {
        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        Node node = new Node(val);
        tmp.next = node;
        size += 1;
    }

    // Insert at particular index;
    public void insertAtIndex(int val, int idx) {
        Node temp = head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    // Insert before an element;
    public void insertBefore(int val, int ele) {
        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == ele) {
                Node node = new Node(val, temp.next);
                temp.next = node;
                break;
            }
            temp = temp.next;
        }
    }

    public void displayTheList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {

        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }

}
