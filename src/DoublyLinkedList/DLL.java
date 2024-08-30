package DoublyLinkedList;

public class DLL {

    private Node head;

    public void insertFirst(int val) {
        // Create the Node
        Node node = new Node(val);

        // Connect to the head
        node.next = head; // At the very beginning head must be points to a null & by adding this its next also must be points to a null
        // Its prev also should point to a null
        node.prev = null;

        if (head != null) { // Head will be null if there is no element/node present or the very first time
            head.prev = node;
        }

        // Now, head should point/represent this new node
        head = node;

    }

    public void insertAtLast (int val) {
        // Create the node
        Node node = new Node(val);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        node.next = null;
        node.prev = temp;
        temp.next = node;
    }

    public void display() {
        Node node = head;
        Node last = null;

        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END.");


        System.out.println("Print in Reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("END.");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
