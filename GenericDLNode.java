public class GenericDLNode<T> {
    public T t;
    public GenericDLNode<T> next;
    public GenericDLNode<T> previous;

    public GenericDLNode(T p) {
        t = p;
        next = null;
        previous = null;
    }
}
