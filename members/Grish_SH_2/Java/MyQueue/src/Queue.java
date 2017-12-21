import java.util.NoSuchElementException;

public class Queue <T>{
    private int countOfItem;
    private Node first;
    private Node last;

    public Queue (){
        first = null;
        countOfItem = 0;
    }

    public int size(){
        return countOfItem;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public T peek(){
        if(isEmpty()) throw new NoSuchElementException("No item to peek");
        return (T) first.item;
    }

    public void enqueue(T item){
        Node second = new Node(item,null);
        if(isEmpty()) {
            first = second;
        }
        else{ last.next = second;
        }
        last = second;
        countOfItem++;
    }

    public T dequeue(){
        if(isEmpty())throw new NoSuchElementException("No item to dequeue");
        T item = (T) first.item;
        first = first.next;
        countOfItem--;
        return item;
    }
}
