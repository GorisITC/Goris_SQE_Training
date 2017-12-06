public class MyLinkedList <T>{
    Node <T> first = null;
    Node <T> last = null;
    int count = 0;


    public void add(T element){
        if (first == null){
            first = new Node<>(null,null,element);
            last = first;
        } else {
            last.next = new Node<>(null,last,element);
            last = last.next;
        }
        ++count;
    }

    public T get(int k){
        if (k > count) throw new IndexOutOfBoundsException("Index: " + k + ", Size: " + count);
        Node <T> element = first;
        for (int i = 0; i < k ;i++) {
        element = element.next;
        }
        return element.value;
    }

    public void remove(int k) {
        if (k > count) throw new IndexOutOfBoundsException("Index: " + k + ", Size: " + count);
        if (k == 0) {
            first = first.next;
            if (count != 1) {
                first.previous = null;
            }
            --count;
            last = first;
            return;
        }
        if (k == count - 1) {
            last = last.previous;
            --count;
        }
           Node<T> secondNode = first;
           Node<T> prev = null,next = null;
           for (int i = 0; i < k; i++) {
               prev = secondNode;
               secondNode = secondNode.next;
               next = secondNode.next;
           }
               next.previous = prev;
               prev.next = next;
           count--;

    }

    public void lenght(){
        System.out.println(count);
    }
    public void getFirst() {
        System.out.println(first.value);
    }

    
}
