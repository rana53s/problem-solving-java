package DoublyLinkedList;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(9);
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(3);


        // Insert at the Last
        list.insertAtLast(10);
        list.insertAtLast(12);

        list.display();
    }

}
