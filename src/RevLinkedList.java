import java.util.LinkedList;

// Reverse linked list
public class RevLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList.descendingIterator().forEachRemaining(linkedList1::add);
        System.out.println(linkedList1);
    }
}
