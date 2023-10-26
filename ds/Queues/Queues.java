package Queues;

public class Queues<T> {
    QueueNode<T> head;
    QueueNode<T> tail;
    int size;

    Queues() {
        this.size = -1;
        this.head = null;
    }

    /**
     * Create a new node using the value passed
     * If the queue is empty, set head and tail to the newly created node
     * otherwise set the next property of the tail to the newly created node
     * increment the size of the queue by 1
     * 
     * @param data
     * @return boolean
     */
    public boolean add(T data) {
        QueueNode<T> newData = new QueueNode<>(data);
        if (this.head == null) {
            this.head = newData;
            this.tail = newData;
        } else {
            this.tail.next = newData;
            this.tail = newData;
        }
        this.size++;
        return true;
    }

    public T peek() {
        if (this.head != null)
            return this.head.data;
        else
            return null;
    }

    /**
     * If the property of head and tail is empty, return null
     * ` * get thehead stored within a variable as a temporary head
     * Check if head and tail are the same, this means the element to be removed is
     * last, remove from both and set value as null
     * Decrease the size
     */

    public T poll() {
        if (this.head == null)
            return null;

        QueueNode<T> oldHead = this.head;
        if (this.head == this.tail)
            this.tail = null;

        this.head = this.head.next;
        this.size--;
        return oldHead.data;

    }
}
