package com.company;

public class Node<T> {
    Node<T> next;
    Node<T> prev;
    T value;

    Node(T value, Node<T> next,Node<T> prev){
        this.next = next;
        this.prev = prev;
        this.value = value;

    }


}
