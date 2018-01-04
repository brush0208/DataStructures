package com.brush.datastructures.list;

public class MyLinkedList<T> {


    Node<T> head;
    Node<T> tail;
    private int theSize;
    private int modCount=0;


    private static class Node<T> {

        T data;
        Node<T> pre;
        Node<T> next;

        public Node(T data, Node<T> pre, Node<T> next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }
}
