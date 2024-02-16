public class GenericDLList<T> {
    private GenericDLNode<T> head;
    private GenericDLNode<T> tail;

    public GenericDLList() {
        head = null;
        tail = null;
    }
    public void listAdd(GenericDLNode<T> newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }
    public void listRemove(GenericDLNode<T> currentNode) {
        GenericDLNode<T> successor = currentNode.next;
        GenericDLNode<T> predecessor = currentNode.previous;

        if (successor != null)
            successor.previous = predecessor;

        if (predecessor != null)
            predecessor.next = successor;

        if (currentNode == head)
            head = successor;

        if (currentNode == tail)
            tail = predecessor;
    }
    public String toString() {
        String string = "";
        GenericDLNode<T> currentNode = head;
        while (currentNode != null) {
            string += "\n" + (String) currentNode.t;
            currentNode = currentNode.next;
        }
        return string;
    }
}
