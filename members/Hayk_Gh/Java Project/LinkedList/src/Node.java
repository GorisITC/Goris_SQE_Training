public class Node<T> {
    Node<T> previous;
    Node<T> next;
    T currentElement;

    Node(Node<T> previous,T currentElement,Node<T> next){
        this.previous = previous;
        this.next = next;
        this.currentElement = currentElement;
    }
}
