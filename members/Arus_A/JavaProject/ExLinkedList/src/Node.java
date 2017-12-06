public class Node<T> {
    public Node<T> next;
    public Node<T> prev;
    public T value;

    public Node (Node<T> next, Node<T> prev, T value){
        this.next=next;
        this.prev=prev;
        this.value=value;
    }
}
