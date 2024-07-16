package com.ds.trees.binarytree;

/**
 * Binary search tree must have at most two child
 */
public class BinarySearchTree<T> {
BinarySearchTreeNode<T> root = null;

    /**
     * Create a node
     * starting at the root
     * check if there is a root, if not - set root to new node
     * if there is a root, check if the value of the new node is greater than or less than the value of the root
     * if it is greater - check to see if there is a node to the right
     * if there is a node to the right, move to that node and repeat these steps
     * if there is no node, add that node as the right property
     * if it is less
     * check to see if there is a node to the left
     * if there is a node to the left, move to that node and repeat these steps
     * if there is not, add that node as the left property
     * @param data
     */
    public void insert(T data){
        BinarySearchTreeNode<T> newNode = new BinarySearchTreeNode<>(data);
        if(root == null) root = newNode;
        else {
            if(data.equals(root.data)){
                //move right
            }else {
                //move left
            }
        }


}
}
