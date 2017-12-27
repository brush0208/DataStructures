package com.brush.datastructures.stack;

import com.brush.datastructures.stack.ArrayStack;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class StackTest {

     static ArrayStack<Integer> stack=new ArrayStack<Integer>(10);
    @Before
    public void setUp()
    {

        stack.push(1);
        stack.push(2);
        stack.push(3);
    }
    @Ignore
    public void testArrayStack()
    {
        stack.show();
        stack.pop();
        System.out.println(stack.top());
        stack.show();
    }
    @Test
    public void testStament()
    {

    }
}
