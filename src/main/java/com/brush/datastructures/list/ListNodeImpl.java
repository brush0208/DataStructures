package com.brush.datastructures.list;

/**
 * 单向链表
 * @param <T>
 */
public class ListNodeImpl<T> implements ListNode<T> {

    private ListNode<T> nextNode;
    private T data;

    public ListNodeImpl(T data){
        this.data=data;
    }

    public ListNode<T> getNext() {
        return nextNode;
    }

    public T getData() {
        return data;
    }

    public void setNext(ListNode<T> node) {
        this.nextNode=node;
    }

    public void setData(T data) {
        this.data=data;
    }
}
