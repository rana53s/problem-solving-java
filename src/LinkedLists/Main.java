package LinkedLists;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertAtFirst(6);
        list.insertAtFirst(3);
        list.insertAtFirst(7);
        list.insertAtFirst(1);

        // Insert at the End
        list.insertAtLast(8);

        // Insert at particular index;
        list.insertAtIndex(5, 2);

        // Insert before an element;
        list.insertBefore(9, 6);

        list.displayTheList();

    }
}
