package com.ds.trees.binarytree;

/**
 * Binary search tree must have at most two child
 */
public class BinarySearchTree<T> {
    BinarySearchTreeNode<Integer> root = null;

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
     *
     * @param data
     */
    public BinarySearchTreeNode<Integer> insert(Integer data) {
        BinarySearchTreeNode<Integer> newNode = new BinarySearchTreeNode<>(data);
        if (root == null) return this.root = newNode;
        else {
            BinarySearchTreeNode<Integer> currentNode = this.root;
            while (true) {
               if(data < currentNode.data) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return this.root;
                    } else currentNode = currentNode.left;
                }else if(data > currentNode.data){
                   if(currentNode.right == null){
                       currentNode.right = newNode;
                       return this.root;
                   }else currentNode = currentNode.right;
               }
            }
        }


    }
}
