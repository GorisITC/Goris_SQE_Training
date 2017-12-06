public class LinkedList<T> {
    Node<T> last = null;
    Node<T> first = null;
    int length;

    public void add(T value) {
        length++;
        if (first == null) {
            first = new Node<>(null, null, value);
            last = first;
        } else {
            last.next = new Node<>(null, last, value);
            last = last.next;
        }
    }

    public T getIndex(int i) {
        Node<T> secondValue = first;
        try {
            for (int j = 0; j < i; j++) {
                secondValue = secondValue.next;
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("The inserted index is greater than a length of LinkedList.");
        }
        return secondValue.value;
    }

    public int indexOf(T value) {
        Node<T> firstValue = first;
        int index = 0;
        if (firstValue.value.equals(value)) {
            return index;
        } else {
            for (int i = 0; i < length - 1; i++) {
                firstValue = firstValue.next;
                if (firstValue.value.equals(value)) {
                    index = i + 1;
                    break;
                }
            }
        }
        return index;
    }

    public void removeByIndex(int index) {
        Node<T> firstValue = first;
        try{
            if (index > length) {
                System.out.println("Please insert the correct index for removing the object!");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("The inserted index is greater than a length of LinkedList.");
        }
        if(index==0){
            first=first.next;
            first.prev=null;
            length--;
        }
        else if(index==length-1){
            last=last.prev;
            last.next=null;
            length--;
        }
        else{
            for (int i = 0; i < index; i++) {
                firstValue = firstValue.next;
            }
            firstValue.prev.next=firstValue.next;
            firstValue.next.prev=firstValue.prev;
            length--;
        }
    }
    public void printLinkedList(){
        Node<T> firstValue = first;
        System.out.println(first.value);
        for (int i = 0; i < length-1; i++) {
            firstValue = firstValue.next;
            System.out.println(firstValue.value);
        }
    }
    public T getFirst() {
        return first.value;
    }

    public T getLast() {
        return last.value;
    }

    public int getLength() {
        return length;
    }
}
