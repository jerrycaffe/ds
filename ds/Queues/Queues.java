package Queues;

public class Queues<T> {
    QueueNode<T> head;
    QueueNode<T> tail;
    int size;

    Queues() {
        this.size = -1;
        this.head = null;
    }

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
