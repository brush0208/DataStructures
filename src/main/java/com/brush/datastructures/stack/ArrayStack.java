package com.brush.datastructures.stack;

public class ArrayStack<T> implements Stack<T> {
    private int top;
    private int capacity;
    private Object[] array;
    private static final int DEFAULT_CAPACITY=20;
    public ArrayStack(int capacity)
    {
        this.capacity=capacity;
        this.array=new Object[capacity];
        this.top=-1;
    }
    public boolean isEmpty() {
        return false;
    }

    public boolean isStackFull() {
        return false;
    }

    public void push(T data) {
        if(isStackFull())
        {
            throw new RuntimeException("full");
        }else
        {
            array[++top]=data;
        }
    }

    public T pop() {
        if(isEmpty())
        {
            throw new RuntimeException("Empty");
        }else
        {
            Object o = array[top--];
            array[(top+1)]=null;
            return (T)o;
        }
    }

    public void deleteStack() {
        array=new Object[capacity];
        top=-1;
    }

    public T top() {
        if(isEmpty())
        {
            throw new RuntimeException("Empty");
        }
        return (T)array[top];
    }

    public int size() {
        return top;
    }

    public void show()
    {
        for(int i=0;i<=size();i++)
        {
            System.out.println(((T)array[i]));
        }
    }
}
