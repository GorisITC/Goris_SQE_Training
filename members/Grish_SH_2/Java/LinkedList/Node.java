public class Node <T> {
    public Node<T> next;
    public Node<T> previous;
    public T value;

    public Node(Node<T> next,Node<T> previous,T value){
        this.next = next;
        this.next = previous;
        this.value = value;
    }
}
