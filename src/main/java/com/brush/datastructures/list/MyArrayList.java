package com.brush.datastructures.list;

import java.util.Iterator;


public class MyArrayList<T>  implements Iterable<T>{

    private T[] elements;
    private final int DEFAULT_CAPLITY=10;
    private  int theSize;
    //ArrayList<>();

    public int size()
    {
        return theSize;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    public T get(int index)
    {
        if(index<0||index>=size()) {
            return null;
        }
        return elements[index];
    }
    public T set(int ids,T data)
    {
        if(ids<0||ids>=size()) {
            return null;
        }
        T element = elements[ids];
        elements[ids]=data;
        return element;
    }
    public void ensureCapacity(int newCapacity)
    {
        if(newCapacity<size()) {
            return ;
        }
        T[] old=elements;
        elements =(T[]) new Object[newCapacity];
        for(int i=0;i<size();i++)
        {
            elements[i]=old[i];
        }


    }
    public boolean add(T value)
    {

        add(size(),value);
        return  true;
    }

    /**
     * 在指定位置添加元素 自动扩容
     * 如果位置大于总数，再末尾添加
     * @param idx
     * @param value
     */
    public void add(int idx,T value)
    {

        if(elements.length==size()) {
            ensureCapacity(size()*2+1);
        }
        if(idx>size()) {
            idx=size();
        }
        if(idx<0||idx>size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i=theSize;i>idx;i--)
        {
            elements[i]=elements[i-1];
        }
        elements[idx]=value;
        theSize++;
    }
    public T remove(int idx)
    {
        if(idx<0||idx>=size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T element = elements[idx];
        //size()-1 */
        for(int i=idx;i<size()-1;i++)
        {
            elements[i]=elements[i+1];
        }
        theSize--;
        return null;
    }
    @Override
    public Iterator<T> iterator() {
        return new MyIterate();
    }

    private class MyIterate implements Iterator<T>
    {
        private int  current=0;
        @Override
        public boolean hasNext() {
            return current<size();
        }

        @Override
        public T next() {
            return elements[current++];
        }

        @Override
        public void remove() {

        }
    }
}
