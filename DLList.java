public class DLList {
    private DLNode head;
    private DLNode tail;

    public DLList() {
        head = null;
        tail = null;
    }
    public void listAdd(DLNode newNode) {
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
    public void listRemove(DLNode currentNode) {
        DLNode successor = currentNode.next;
        DLNode predecessor = currentNode.previous;

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
        DLNode currentNode = head;
        while (currentNode != null) {
            string += "\n" + "{Title: " + currentNode.book.title + ", Author: " + currentNode.book.author
                    + ", Price: " + currentNode.book.price + "}";
            currentNode = currentNode.next;
        }
        return string;
    }
}
