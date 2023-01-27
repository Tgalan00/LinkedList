

public class Node<T> {
    public T content;

    public Node<T> previous;
    public Node<T> next;

    public Node(T content, Node<T> previous, Node<T> next) {
        this.content = content;
        this.previous = previous;
        this.next = next;
    }
}