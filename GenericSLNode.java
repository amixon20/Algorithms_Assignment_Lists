public class GenericSLNode<T> {
    public T t;
    public GenericSLNode<T> next;

    public GenericSLNode(T p) {
        t = p;
        next = null;
    }
}
