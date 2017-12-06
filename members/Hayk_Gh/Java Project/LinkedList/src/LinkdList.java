public class LinkdList<T> {
    Node<T> first;
    Node<T> last;
    int count = 1;

    public void add(T element) {
        if (first == null) {
            first = new Node<>(null, element, null);
            last = first;
        } else {
            last.next = new Node<>(last, element, null);
            last = last.next;
            count++;
        }
    }

    public T get(int i) throws Exception {
        Node<T> element = first;
            for (int j = 0; j < i; j++) {
                element = element.next;
                if (element == null) {
                  throw new Exception("Please input valid item");
                }
            }
        return element.currentElement;
    }

    public int indexOf(T item)throws Exception{
        Node<T> element = first;
        int index = 0;
        for (int j = 0; j < count; j++) {
            if (element.currentElement.equals(item)) {
                index = j;
                return index;
            } else {
                element = element.next;
            }
        }
       throw new Exception("Please input valid item");
    }

    public T getFirst() {
        return first.currentElement;
    }

    public T getLast(){
        return last.currentElement;
    }

    public int length() throws Exception {
        return indexOf(last.currentElement) + 1;
    }

    public void remove(int i) throws Exception {
        Node<T> element = first;
        if(i==indexOf(first.currentElement)){
            first = first.next;
        }else if(i==indexOf(last.currentElement)){
            last = last.previous;
        } else {
            for (int j = 0; j <= i; j++) {
                if (i == indexOf(element.currentElement)) {
                    element.previous.next = element.next;
                    element.next.previous = element.previous;
                    break;
                } else {
                    element = element.next;
                }
            }
        }
    }
}
