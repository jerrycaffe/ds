package com.ds.Queues;

/**
 * @author Jerrycaffe
 * @version 0.01
 * FIFO - First In First Out principal
 * In queues data is added to the rear/end/tail and data is removed from the head
 * QUEUE is abut adding an element from one end and remove the element from the other end. e.g sending a work to a printer, the first job that got there would be printed first
 * another example of a queue is waiting on a long line to be served
 * The first element added is at the end
 * The last element added is the last element to be removed.
 * take the numbers for instance 1->2->3->4->5   starting from left to right, it shows that 5 was the first to get in from left and hence 5 will be removed first
 * We can use linked list or array to build a queue
 */
public class Queues<T> {
    QueueNode<T> head;
    QueueNode<T> tail;
    int size;

   public Queues() {
        this.size = -1;
        this.head = null;
    }

    /**
     * It is good to note that the queue adds new data to the rear/tail
     * Enqueue is adding a new value to a queue or sometimes called push
     * If there is no value within the queue, Create a new node using the data passed in. head and tail will point to the same value
     * otherwise, set the next property of the tail to be the newly created node, and then set the tail property of the queue to be the new node
     *
     * @param T data
     * @return true
     */
    public boolean add(T data) {
        QueueNode<T> newData = new QueueNode<>(data);
        if (this.head == null) {
            this.head = newData;
            this.tail = newData;
        } else {
            QueueNode<T> tempTail = tail;
            this.tail = newData;
            this.tail.next = tempTail;
        }
        this.size++;
        return true;
    }

    /**
     * Returns the element at the front/head/start of the queue without removing it.
     * @return T
     */
    public T peek() {
        if (this.head != null)
            return this.head.data;
        else
            return null;
    }

    /**
     * Also called Dequeue or pop
     * if there is no head, return null
     * store the head property in a variable
     * see if the head is the same as the tail (check if there is only 1 node). if so, set the head and tail to be null
     * if there is more than one node, set the head property to be the next property of head
     * decrement the size by 1
     * return the value of the node dequeued
     *
     * @return T data
     */
    public T poll() {
        if (this.head == null)
            return null;

        QueueNode<T> oldHead = this.head;
        if (this.head == this.tail) {
            this.tail = null;
        }else {

            this.head = this.head.next;
        }

        this.size--;
        return oldHead.data;

    }
}
