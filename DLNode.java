public class DLNode {
    public Book book;
    public DLNode next;
    public DLNode previous;

    public DLNode(Book p) {
        book = p;
        next = null;
        previous = null;
    }
}
