package com.ds.Stacks;

/**
 * @version 0.01
 *          LIFO - Last In First Out principal
 *          Stack is about adding and removing element at the same end e.g add to the end of the list and remove from same place
 *          The first element added is at the bottom or is at the other end of the stack depending on how we see the stack
 *          The last element added is the first element to be removed. e.g
 *          plates stacked, the very top to be removed
 * @author Jerrycaffe
 */

public class Stacks<T> {
    int top;
    StackNode<T> head;

    Stacks() {
        this.top = -1;
        head = null;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    /**
     * If there is no node in the stack i.e node is empty, set the value passed in as the head node
    * store the head node within a temporary variable
     * make the head node become previous
     * store the new node as the head node
     * increment the size of the stack by 1
     * @param T data
     * @return T data
     */

    public T push(T data) {
        StackNode<T> newData = new StackNode<>(data);
        if (isEmpty()) {
            this.head = newData;
        } else {

            StackNode<T> oldHead = this.head;
            this.head = newData;
            this.head.prev = oldHead;
        }
        this.top++;
        return this.head.data;

    }

    public T peek() {
        if (isEmpty())
            return null;
        return this.head.data;
    }

    /**
     * it there is no nodes in the stack return null
     * store the current node into a temp node
     * get the previous node of the stack and set it as the current node
     * decrement the size of the stack
     * @return
     */
    public T pop() {
        if (isEmpty())
            return null;

        StackNode<T> tempCurrent = this.head;
        this.head = tempCurrent.prev;
        this.top--;
        return tempCurrent.data;

    }

}
