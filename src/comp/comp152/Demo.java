package comp.comp152;

public class Demo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst("test node 2");
        list.addFirst("test node 1");
        list.addLast("test node 3");
        list.print();

        list.removeLast();
    }
}
