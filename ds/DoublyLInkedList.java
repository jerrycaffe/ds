/**
 * @author - Adeleye Jeremiah
 * @version - 1.00
 */
public class DoublyLInkedList<T> {
    int size;
    NodeDouble<T> head;
    NodeDouble<T> tail;

    DoublyLInkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * @param data value to be added to the newly created node of type T
     *             create a new node with the value passed to the insert function
     *             if the head property is null, means the list is empty then set
     *             the head and tail to newly created node
     *             else set the next property on the tail to be that node, and set
     *             the previous property of the newly created node to the tail and
     *             make the new node the new tail
     * @see <a
     *      href=https://www.geeksforgeeks.org/introduction-and-insertion-in-a-doubly-linked-list/>
     *      Inserting node in doubly linked list </a>
     * @return void
     */
    public void insertLast(T data) {
        NodeDouble<T> newNode = new NodeDouble<>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            NodeDouble<T> tempDouble = this.tail;
            this.tail = newNode;
            this.tail.prev = tempDouble;
            tempDouble.next = this.tail;
        }
        this.size++;

    }

    public void insertFirst(T data) {
        NodeDouble<T> newNode = new NodeDouble<>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            NodeDouble<T> tempHead = this.head;
            this.head = newNode;
            tempHead.prev = this.head;
            this.head.next = tempHead;
        }
        this.size++;
    }

    public void printList() {
        NodeDouble<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
