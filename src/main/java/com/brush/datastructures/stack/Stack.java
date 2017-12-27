package com.brush.datastructures.stack;

/**
 * @author brush
 * 栈接口
 */
public interface Stack<T> {
    boolean isEmpty();
    boolean isStackFull();
    void  push(T data);
    T pop();
    void deleteStack();
     T top();
    int size();
}
