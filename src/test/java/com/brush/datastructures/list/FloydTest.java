package com.brush.datastructures.list;

import org.junit.Before;
import org.junit.Test;

import static com.brush.datastructures.list.LinkedListUtil.doesLinkedListContainsLoopByFloyd;
import static com.brush.datastructures.list.LinkedListUtil.inserToList;
import static org.junit.Assert.assertEquals;

public class FloydTest  {
    static ListNode<Integer> head=new ListNodeImpl<Integer>(1);
    @Before
    public void setup(){
        ListNodeImpl<Integer> node = new ListNodeImpl<Integer>(2);
        inserToList(head,node);
        inserToList(head,new ListNodeImpl<Integer>(3));
        inserToList(head,new ListNodeImpl<Integer>(4));
        inserToList(head,new ListNodeImpl<Integer>(5));
        inserToList(head,new ListNodeImpl<Integer>(6));
        ListNodeImpl<Integer> node1 = new ListNodeImpl<Integer>(7);
        inserToList(head,node1);
        node1.setNext(node);
    }
    @Test
    public void testFlody()
    {
        boolean loop = doesLinkedListContainsLoopByFloyd(head);
        assertEquals(true,loop);

    }
}
