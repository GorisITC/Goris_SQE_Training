
public class Node <T> {
	
	Node<T> previousElement;
	Node<T> nextElement;
	T currentElement;
	
	Node (Node<T> previousElement, T currentElement, Node<T> nextElement) {
		this.previousElement = previousElement;
		this.currentElement = currentElement;
		this.nextElement = nextElement;
	}
	
}
