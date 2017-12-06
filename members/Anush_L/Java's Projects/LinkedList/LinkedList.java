
public class LinkedList<T> {
	
	Node<T> last;
	Node<T> first;
	private int length = 0;
	
	public int size() {
		return length;
	}
	
	public void add(T element) {
		length ++;
		Node<T> newElement = new Node<>(null, element, null);
		if (first != null) {
			last.nextElement = newElement;
			newElement.previousElement = last;
			last = newElement;
		} else {
			first = newElement;
			last = newElement;
		}
	}
	
	public T get(int index) throws Exception {
		Node<T> element;
		if (index < length && index >= 0) {
			if (index < length / 2) {
				element = first;
				while (index > 0) {
					index--;
					element = element.nextElement;
				}
			} else {
				element = last;
				while (index < length - 1) {
					index++;
					element = element.previousElement;
				}
			}
		} else {
			throw new Exception("The index does not exist.");
		}
		return element.currentElement;
	}
	
	public void remove(int index) throws Exception {
		Node<T> element;
		if (index < length && index >= 0 && length != 0) {
			if (index != 0 && index != length -1) {
				if (index < length / 2) {
					element = first;
					while (index > 0) {
						index--;
						element = element.nextElement;
					}
				} else {
					element = last;
					while (index < length) {
						index++;
						element = element.previousElement;
					}
				}
				element.previousElement.nextElement = element.nextElement;
				element.nextElement.previousElement = element.previousElement;
			} else if (index == 0) {
				first = first.nextElement;
			} else {
				last = last.previousElement;
			}
			this.length -= 1;
		} else {
			throw new Exception("");
		}
	}
	
	public void remove(T element) {
		Node<T> getElement = first;
		boolean exist = false;
		while (getElement.nextElement != null) {
			if (getElement.currentElement.equals(element)) {
				getElement.previousElement.nextElement = getElement.nextElement;
				getElement.nextElement.previousElement = getElement.previousElement;
				this.length -= 1;
				exist = true;
				break;
			} else {
				getElement = getElement.nextElement;
			}
		}
		if (exist == false) {
			System.out.println("The element does not exist");
		}
	}
	
	public int indexOf(T element) throws Exception {
		int index = 0;
		Node<T> getElement = first;
		while (getElement.nextElement != null) {
			if (getElement.currentElement.equals(element)) {
				return index; 
			} else {
				getElement = getElement.nextElement;
				index++;
			}
		}
		throw new Exception("The element does not exist");
	}
			
	public T getFirst() {
		return first.currentElement;
	}
	
	public T getLast() {
		return last.currentElement;
	}
	
}
