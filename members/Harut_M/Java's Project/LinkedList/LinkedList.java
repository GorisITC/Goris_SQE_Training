package com.company;

public class LinkedList<T> {
Node<T> first;
Node<T> last;
int size =0;


public int length(){
  return size;
}
public void add(T value){
    if (first == null){
        first = new Node<T>(value, null, null);
        last = first;
    }
    else {
        last.next = new Node<T>(value,null,last);
        last = last.next;
    }
    size ++;
}

public void remove(int index){
    Node<T> current = first;
    Node<T> prev = null, next = null;
if (index==0){
    first =first.next;
    size--;
} else if (index == size -1){
    last = last.prev;
    last.next = null;
    size--;
}
    else {
    for (int i = 0; i < index; i++) {
        prev = current;
        current = current.next;
        next = current.next;
    }
    prev.next = next;
    next.prev = prev;
    size--;
}



}

public T get( int index) {
    if (index > size) throw new IndexOutOfBoundsException("index more than size");
    Node<T> current = first;
for (int i = 0; i < index; i++){
 current = current.next;

}
return current.value;



}
public T getFirst(){
    return first.value;
}

}
