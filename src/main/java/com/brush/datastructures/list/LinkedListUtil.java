package com.brush.datastructures.list;

import java.util.LinkedList;

public class LinkedListUtil {
    /**
     * 计算链表长度
     * @param headNode
     * @return
     */
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

    /**
     * 在链表尾部插入节点
     * @param headNode
     * @param newNode
     * @param <E>
     * @return
     */
    public static <E> ListNode<E> inserToList(ListNode<E> headNode, ListNode<E> newNode)
    {
        int length = getLength(headNode);
        return inserToList(headNode,newNode,length+1);
    }

    /**
     * 在链表任意位置插入节点
     * @param headNode
     * @param newNode
     * @param position
     * @param <E>
     * @return
     */
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

    /**
     * 打印链表
     * @param head
     */
    public static void  showList  (ListNode<?> head)
    {
        while(head!=null)
        {
            System.out.print(head.getData()+"-->");
            head=head.getNext();
        }
        System.out.println("null");
    }

    /**
     * 反转链表
     * @param head
     * @param <T>
     * @return
     */
    public  static <T> ListNode<T> ReverseList(ListNode<T> head)
    {
        ListNode<T> temp=null;
        ListNode<T> nextNode=null;
        while (head!=null)
        {
            nextNode=head.getNext();
            head.setNext(temp);
            temp=head;
            head=nextNode;
        }
        return temp;
    }

    /**
     * floyd判环算法
     * @param head
     * @param <T>
     * @return
     */
    public static <T> boolean doesLinkedListContainsLoopByFloyd(ListNode<T> head)
    {
        if(head==null)
            return false;
        ListNode<T> slow=head,fast=head;
        while (fast.getNext()!=null&&fast.getNext().getNext()!=null)
        {
            slow=slow.getNext();
            fast=fast.getNext().getNext();
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }

}
