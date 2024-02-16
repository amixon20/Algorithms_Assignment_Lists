public class GenericSLList<T> {
    private GenericSLNode<T> head;
    private GenericSLNode<T> tail;
    public GenericSLList() {
        head = null;
        tail = null;
    }
    public void listAdd(GenericSLNode<T> newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void listRemove(GenericSLNode<T> currentNode) {
        if (currentNode == null && head != null) {
            GenericSLNode<T> succeedingNode = head.next;
            head = succeedingNode;
            if (succeedingNode == null) {
                tail = null;
            }
        }
        else if (currentNode.next != null) {
            GenericSLNode<T> succeedingNode = currentNode.next.next;
            currentNode.next = succeedingNode;
            if (succeedingNode == null) {
                tail = currentNode;
            }
        }
    }
    public String toString() {
        String string = "";
        GenericSLNode<T> currentNode = head;
        while (currentNode != null) {
            string += "\n" + (String) currentNode.t;
            currentNode = currentNode.next;
        }
        return string;
    }
}
