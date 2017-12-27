
package com.brush.datastructures.tree;

/**
 * @author brush
 * @param <T>
 */
public class BinaryTreeNode<T extends Comparable<T>>{

    T element;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
}