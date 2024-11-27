package com.ds.trees.binarytree;

import com.ds.Queues.Queues;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary search tree must have at most two child
 */
public class BinarySearchTree<T> {
    BinarySearchTreeNode<Integer> root = null;

    /**
     * Create a new node
     * starting at the root
     * check if there is a root,
     * if there is no root THEN root becomes the newly created node
     * if there is a root, THEN check if the value of the new node is greater than or less than the value of the root
     * if it is greater, THEN check to see if there is a node to the right
     * if there is a node to the right, THEN move to that node and repeat these steps
     * if there is no node, add that node as the right property
     * if it is less
     * check to see if there is a node to the left
     * if there is a node to the left, move to that node and repeat these steps
     * if there is not, add that node as the left property
     * Return the entire tree at the end of the insertion
     *
     * @param data
     */
    public BinarySearchTreeNode<Integer> insert(Integer data) {
        BinarySearchTreeNode<Integer> newNode = new BinarySearchTreeNode<>(data);
        if (root == null) return this.root = newNode;
        else {
            BinarySearchTreeNode<Integer> currentNode = this.root;
            while (true) {
                if (data < currentNode.data) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return this.root;
                    } else currentNode = currentNode.left;
                } else if (data > currentNode.data) {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return this.root;
                    } else currentNode = currentNode.right;
                } else return this.root;
            }
        }


    }

    /**
     * <p><h3>Find - Search a value in a binary tree
     *
     * <p>Starting at the root
     * <p>Check if there is a root, if not - It means the tree is empty, return the empty tree
     * <p>
     * if there is a root,
     * <p>check if the value of the new node is the value we are looking for.
     * if they are the same, return the data
     * if not, check to see if the value is greater than or less than the value of the root
     * if it is greater
     * check to see if there is a node to the right
     * if there is, move to that node and repeat these steps
     * if there is not, we are done searching
     * if it is less
     * check to see if there is a node to the left
     * if there is, move to that node and repeat these steps
     * if there is not, we are done searching
     *
     * @param data The value being searched for
     * @return data
     */

    public Integer find(Integer data) {
        if (this.root == null) return -1;
        BinarySearchTreeNode<Integer> current = this.root;
        while (current != null && current.data.compareTo(data) != 0) {
            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else return current.data;
        }

        return -1;
    }

    /**
     * <p><h3>Title: Contain
     * <p>
     * This implementation is similar to the found implemented at the top there
     * The only difference is that it returns true if the value is found and false when it is not found
     *
     * @param data
     * @return boolean
     */
    public boolean contains(Integer data) {
        if (this.root == null) return false;
        BinarySearchTreeNode<Integer> current = this.root;
        while (current != null) {
            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else return true;
        }

        return false;
    }

    /**
     * Create a queue (can be an array) and a variable to store the values of node visited
     * Place the root node in the queue
     * Loop as long as there is anything in the queue
     * * Dequeue(remove) a node from the queue and push the value of the node into the variable that stores the nodes
     * ** if there is a left property on the node dequeued(removed) - add it to the queue
     * ** if there is a right property on the node dequeued - add it to the queue
     * Return the variable that stores the values
     */

    public ArrayList<Integer> breathFirstSearch() {
//        Queues<BinarySearchTree<Integer>> data = new Queues<>();
        Queues<BinarySearchTreeNode<Integer>> queue = new Queues<>();
        ArrayList<Integer> visited = new ArrayList<>();
        BinarySearchTreeNode<Integer> node;
        queue.add(this.root);
        while (!queue.isEmpty()) {
            node = queue.poll();
            visited.add(node.data);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return visited;

    }

    /**
     * Create a variable to store the values of nodes visited
     * store the root of the BST in a variable called current
     * write an helper function which accepts a node
     * Push the value of the node to the variable that stores the values
     * if the node has a left property, call the helper function with the left property on the node
     * if the node has a right property, call the helper function with the right property on the node
     * invoke the helper function with the current variable
     * Return the array of values
     */
    public ArrayList<Integer> depthFirstSearchPreOrder() {
        ArrayList<Integer> visited = new ArrayList<>();
        BinarySearchTreeNode<Integer> current = this.root;
        traverse(this.root, visited);
        return visited;
    }

    private void traverse(BinarySearchTreeNode<Integer> current, ArrayList<Integer> visited) {
        visited.add(current.data);
        if (current.left != null) traverse(current.left, visited);
        if (current.right != null) traverse(current.right, visited);
    }
}
