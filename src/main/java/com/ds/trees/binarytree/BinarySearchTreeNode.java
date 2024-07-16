package com.ds.trees.binarytree;

/**
 * @author - Jerrycaffe
 * @since 2024
 */
public class BinarySearchTreeNode<T> {
     T data;
     BinarySearchTreeNode<T> left;
     BinarySearchTreeNode<T> right;

   public BinarySearchTreeNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
