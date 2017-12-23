package com.brush.datastructures.list;

public interface ListNode<T> {
    /**
     * 获取next节点
     * @return <code>ListNode</code>
     */
    ListNode<T> getNext();
    T getData();
    void setNext(ListNode<T> node);
    void setData(T data);
}
