package com.brush.datastructures.tree;

import org.junit.Before;
import org.junit.Test;

public class TreeShowTest {

    BinaryTreeNode<Integer> integerBinaryTreeNode;
    @Before
    public void setUp()
    {
        integerBinaryTreeNode=new BinaryTreeNode<Integer>(1);

        BinaryTreeNode<Integer> integerBinaryTreeNode1 = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> integerBinaryTreeNode2 = new BinaryTreeNode<Integer>(3);
        BinaryTreeNode<Integer> integerBinaryTreeNode3 = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> integerBinaryTreeNode4 = new BinaryTreeNode<Integer>(5);
        BinaryTreeNode<Integer> integerBinaryTreeNode5 = new BinaryTreeNode<Integer>(6);
        BinaryTreeNode<Integer> integerBinaryTreeNode6 = new BinaryTreeNode<Integer>(7);

        integerBinaryTreeNode.setLeft(integerBinaryTreeNode1);
        integerBinaryTreeNode.setRight(integerBinaryTreeNode2);
        integerBinaryTreeNode1.setLeft(integerBinaryTreeNode3);
        integerBinaryTreeNode1.setRight(integerBinaryTreeNode4);
        integerBinaryTreeNode2.setLeft(integerBinaryTreeNode5);
        integerBinaryTreeNode2.setRight(integerBinaryTreeNode6);
}

    @Test
    public void PerOderTest()
    {
        integerBinaryTreeNode.preOrder(integerBinaryTreeNode);
    }



        @Test   public void PreOderNonRecursive()
        {       System.out.println("----start PreOderNonRecursive");
        integerBinaryTreeNode.preOrderNonRecursive(integerBinaryTreeNode);
    }
    @Test
    public void LevelOderTest()
    {
        System.out.println("----start LevelOrder");
        integerBinaryTreeNode.levelOrder(integerBinaryTreeNode);
    }
}
