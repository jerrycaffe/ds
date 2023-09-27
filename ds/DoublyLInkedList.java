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
     *      Inserting node in doubly linked list( same as push) </a>
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

    /**
     * @param data value to be added to the newly created node of type T
     *             create a new node with the value passed to the insert function
     *             if the head is null, then set the head and tail to be
     *             the new node
     *             else - set the previous property on the old head to point to the
     *             new node created
     *             set the next property of the new head to point to the old head
     *             set the head to be the newly created node
     *             increment the size
     * 
     * @see <a
     *      href=https://www.geeksforgeeks.org/introduction-and-insertion-in-a-doubly-linked-list/>
     *      Inserting node in doubly linked list( same as unshift) </a>
     * @return void
     */

    public void insertFirst(T data) {
        NodeDouble<T> newNode = new NodeDouble<>(data);
        NodeDouble<T> oldHead = this.head;

        if (oldHead == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            oldHead.prev = newNode;
            newNode.next = oldHead;
            this.head = newNode;
        }
        this.size++;

    }

    /**
     * @param void
     *             if there is no head, return null
     *             Store current tail in a temp variable
     *             if the size of the list is 1 set both head and tail to null
     *             Set previous node as the new tail
     *             set the next property of the new tail to null
     *             Decrease the size by 1
     *             return value removed
     * @see <a
     *      href=https://www.geeksforgeeks.org/delete-a-node-in-a-doubly-linked-list/>
     *      Delete a node from the end in a Doubly Linked List(same as pop) </a>
     * @return T data
     */
    public T removeLast() {
        T data = null;
        if (this.head == null)
            return data;
        NodeDouble<T> tempTail = this.tail;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;

            data = tempTail.data;
        } else {
            this.tail = tempTail.prev;
            this.tail.next = null;
            data = tempTail.data;
        }
        this.size--;
        return data;
    }

    /**
     * @param void
     *             Store current head in a temp variable
     *             if there is no head, return null
     *             if the size of the list is 1 set both head and tail to null
     *             Set next node of the head as the new head
     *             set the previous property of the new head to null
     *             Decrease the size by 1
     *             return value removed
     * @see <a
     *      href=https://www.geeksforgeeks.org/delete-a-node-in-a-doubly-linked-list/>
     *      Delete a node, from the beginning in a Doubly Linked List (same as
     *      shift)</a>
     * @return T data
     */
    public T removeFirst() {
        NodeDouble<T> tempHead = this.head;
        T data = null;
        if (this.head == null)
            return data;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            data = tempHead.data;
        } else {
            this.head = tempHead.next;
            this.head.prev = null;
            data = tempHead.data;
        }
        this.size--;
        return data;
    }

    /**
     * @param T (data type supplied to the constructor)
     *          if the index is less than 0, greater or equal to the length, return
     *          null
     *          if the index is less than or equal to half of the size of the list,
     *          loop through the list starting from the head and loop towards the
     *          midde
     *          return the data once it is found
     *          else
     *          loop through the list starting from the tail and size -1 and loop
     *          towards the
     *          middle
     *          return the data once it is found
     * 
     * @see <a
     *      href=https://www.geeksforgeeks.org/arraylist-get-method-java-examples/>
     *      get a node from the a Doubly Linked List </a>
     * @return T data
     */
    public T get(int index) {
        if (index < 0 || index >= this.size)
            return null;
        int halfLen = this.size / 2;
        T data = null;
        if (index <= halfLen) {
            NodeDouble<T> currentNode = this.head;
            int counter = 0;
            while (counter != index) {
                currentNode = currentNode.next;
                counter++;
            }
            data = currentNode.data;
        } else {
            NodeDouble<T> currentNode = this.tail;
            int counter = this.size - 1;

            while (counter != index) {
                currentNode = currentNode.prev;
                counter--;
            }
            data = currentNode.data;
        }
        return data;
    }

    public void printList() {
        NodeDouble<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
