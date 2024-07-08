package com.ds.Stacks;

/**
 * @version 0.01
 *          LIFO - Last In First Out principal
 *          Stack is abut adding and removing at the same end e.g add to the end of the list and remove from same place
 *          The first element added is at the bottom or is at the other end of the stack depending on how we see the stack
 *          The last element added is the first element to be removed. e.g
 *          plates stacked, the very top to be removed
 * @author Jerrycaffe
 */

public class Stacks<T> {
    int top;
    StackNode<T> current;

    Stacks() {
        this.top = -1;
        current = null;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    /**
     * If there is no node in the stack i.e node is empty, set the value passed in as the first and last property
    * store the current node within a temporary variable
     * make the current node become previous
     * store the new node as the current node
     * increment the size of the stack by 1
     * @param T data
     * @return T data
     */

    public T push(T data) {
        StackNode<T> newData = new StackNode<>(data);
        if (isEmpty()) {
            this.current = newData;
        } else {

            StackNode<T> temNode = this.current;
            this.current = newData;
            this.current.prev = temNode;
        }
        this.top++;
        return this.current.data;

    }

    public T peek() {
        if (isEmpty())
            return null;
        return this.current.data;
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

        StackNode<T> tempCurrent = this.current;
        this.current = tempCurrent.prev;
        this.top--;
        return tempCurrent.data;

    }

}
