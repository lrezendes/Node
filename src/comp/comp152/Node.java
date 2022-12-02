package comp.comp152;

public class Node {
    String data;
    Node nextNode;

    public Node(String newData, Node newNextNode) {
        // set the value of data and nextNode using the supplied arguments
        this.data = newData;
        this.nextNode = newNextNode;
    }
}
