package LinkedLists;

public class NodeDouble<T> {
    NodeDouble<T> next;
    NodeDouble<T> prev;
    T data;

    NodeDouble(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
