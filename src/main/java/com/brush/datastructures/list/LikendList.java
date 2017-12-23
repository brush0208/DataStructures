package com.brush.datastructures.list;

import java.util.List;

/**
 * @author brush
 * @param <T>
 */
public class LikendList<T> implements ListNode<T> {

    private ListNode<T> nextNode;
    private T data;

    public ListNode<T> getNext() {
        return this.nextNode;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(ListNode<T> node) {
        this.nextNode=node;
    }

    public void setData(T data) {
        this.data=data;
    }

    public static  int getLength(ListNode<?> headNode)
    {
        if(headNode==null)
        {
            return 0;
        }
        else
        {
            int count=1;
            ListNode<?> current=headNode.getNext();
            while (current!=null)
            {
                count++;
                current=current.getNext();
            }
            return count;
        }
    }
    public static <E> ListNode<E> inserToList(ListNode<E> headNode, ListNode<E> newNode,int position)
    {
        if(headNode==null)
        {
            return newNode;
        }
        int size=getLength(headNode);
        if(position<1&&position<size+1)
        {
            throw new RuntimeException("请传入正确的位置（1-"+size+1+")");
        }
        if(position==1)
        {
            newNode.setNext(headNode);
            return  newNode;
        }else
        {
            int count=1;
            ListNode<E> presoversNode=headNode;
            while (count<position-1)
            {
                count++;
                presoversNode=presoversNode.getNext();
            }
            newNode.setNext(presoversNode.getNext());
            presoversNode.setNext(newNode);
            return headNode;
        }

    }
}
