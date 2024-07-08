package src.main.java.com.ds.Queues;

public class QueueNode<T> {
    // 23, 45, 90
    T data;
    QueueNode<T> next;

    QueueNode(T data) {
        this.data = data;
        this.next = null;
    }

}
