package com.ds.LinkedLists;

/**
 *
 *
 * Linked list is not in any contingents storage like array and size can be increased anytime unlike array in java
 * it stores in heap memory
 * These are the methods present in the given linked list for this class
 * Insert to the beginning
 * insert at the given location
 * insert to the end of the list
 * reverse a given list
 * delete from the beginning
 * delete from the end
 * delete from a given location
 * return max value from list
 * search value in singly list
 * 
 * @author Adeleye Jeremiah
 * @version 1.02
 */
public class SinglyLinkedList<T> {

    public Node<T> head = null;
    public Node<T> tail = null;
    private int size = -1;

    /**
     * This method is used to add element to the beginning of a list
     * It first checks if the list is empty by probing the head node for null to be
     * sure no node exist
     * Once the head is null then this confirms the list is empty and new data get
     * added to the head and the tail
     * pointing to the newly created data
     * if there exist a value, create a temporary node
     * add the current head to the newly created temporary node
     * let the head point to the newly created node
     * set the next node property of the new node to the previous head
     * 
     * @name insertFirst
     * @apiNote This method of a linked list ensures that value can be inserted to
     *          the beginning of the list
     * @param data T data - the value to be inserted, T - data type e.g Integer, String etc
     * @return no value is returned
     */
    public void insertFirst(T data) {
            Node<T> newNode = new Node<>(data);
        this.size = size + 1;
        if (this.head == null)
            insertIntoEmptyHead(newNode);
        else {
            newNode.next = this.head;
            this.head = newNode;
        }

    }

    private Node<T> insertIntoEmptyHead(Node<T> newNode) {

        this.head = newNode;
        this.tail = newNode;
        return newNode;
    }
    /**
     * This method is used to add element to the end of a list
     * It first checks if the list is empty by probing the head node for null to be sure no node exist
     * Once the head is null then this confirms the list is empty and new data get added to the head and the tail
     * and both data will be pointing to the newly created data
     * if there exist a value,
     * Get the tail,
     * point the next value of the tail to the newly created node,
     * set the newly created node to be the new tail
     *
     * @name insert
     * @apiNote This method of a linked list ensures that value can be inserted to
     *          the end of the list
     * @param data T data - the value to be inserted, T - data type e.g Integer, String etc
     * @return no value is returned
     */
    public Node<T> insert(T data) {
        Node<T> newNode = new Node<>(data);
        this.size = size + 1;
        if (this.head == null) {
            return insertIntoEmptyHead(newNode);

        }

        Node<T> currentNode = this.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        this.tail = newNode;
        return tail;
    }
    /**
     * This method is used to add element to any position on the list
     * Throw error if any of this happens
     * 1. if the list is empty and the value passed in is not 0
     * 2. if the size of the list is lesser than size+1 value passed
     * iterate through the list keeping track of the count i.e number of times iteration has gone
     * once the count is reached,
     * get the previous node before the targeted node, point the next of the prev node to the newly created node
     * point the next of the newly created node to the original node before insertion
     *
     * @name insertAtPost
     * @apiNote This method of a linked list ensures that value can be inserted to
     *          the end of the list
     * @param data T data - the value to be inserted, T - data type e.g Integer, String etc
     * @return no value is returned
     */
    public void insertAtPosition(T data, int location) {

        if (this.size == -1 && location != 0 || location - 1 > this.size) {
            System.out.println("ListOutOfBoundsException You cannot insert into position" + location
                    + "as the current size is " + this.size);
        return;
        }
        if (location == 0) {
            insertFirst(data);
            this.size += 1;
            return;
        }
        if (location == 1) {
            Node<T> newNode = new Node<>(data);
            Node<T> tempNode = this.head.next;
            this.head.next = newNode;
            newNode.next = tempNode;
            this.size += 1;
            return;
        }
        // keep track of previous and current node
        // create a new node
        // let the next of previous point to the node of newly created
        // let the next of newly created point to the current node
        int currentPos = 0;
        Node<T> prevNode = this.head;
        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = this.head;
        while (currentPos != location - 1) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }
        prevNode.next = newNode;
        newNode.next = currentNode;
        this.size++;
        if (newNode.next == null)
            this.tail = newNode;

    }

    /**
     * This method is used to get an element in any position on the list
     * Throw error if any of this happens
     * 1. if the list is empty and position is not zero
     * 2. if the size of the list is lesser than size+1 value passed
     * if the value passed in is 0, return the head
     * iterate through the list keeping track of the count i.e number of times iteration has gone
     * once the count is reached,
     * get the value at the current position and return it
     *
     * @name getDataAtPosition
     * @apiNote This method of a linked list get data at a given position
     * @param pos int - is the value to be gotten
     * @return data T is the value found and data type of T
    */

    public T getDataAtPos(int pos){
        if(this.size == -1 && pos > 0 || this.size+1 < pos){
            System.out.println("NoValueExistException: value passed in cannot be less than 0");
            return null;
        }
        if(pos == 0 && this.head != null) return head.data;
        if(pos == 0 && this.head == null) return null;

        int count = 1;
        Node<T> currentNode = this.head;
        while(count <= pos){
            currentNode = currentNode.next;
            count++;
        }
        return currentNode.data;

    }

    // check if list is not empty, otherwise call add first
    // loop through till the last element has next to be null
    // create new node
    // append create node to the next of the last node

    // tail -> 5 and next = 10, next = null
    // temp = tail
    // tail -> next = newNode
    //

    /**
     * 
     * @param data An integer value to be passed in for the method
     * @see <a href=
     *      "https://www.geeksforgeeks.org/insert-node-at-the-end-of-a-linked-list/">
     *      Adding Node at the end</a>
     * 
     */
    public void append(T data) {
        if (this.head == null)
            insertFirst(data);
        Node<T> newNode = new Node<>(data);

        Node<T> prevTail = this.tail;
        prevTail.next = newNode;
        this.tail = newNode;

    }

    public T deleteFromStart() {
        // if head is null return -1
        // if head.next is null, set head to null and tail to null then return head.data
        // hence new head is head.next
        T data = this.head.data;
        if (this.head == null)
            return null;
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;

        } else {
            Node<T> newHead = this.head.next;
            this.head = newHead;
        }
        this.size--;
        return data;

    }

    public void reverseList() {
        // Check if the next element is not null
        // keep track of current
        // keep track of previous
        // store the next of current to a separate variable
        // point current to previous node
        // check if this is the first node and update head and tail

        Node<T> prevNode = null;
        Node<T> currentNode = this.head;

        while (currentNode.next != null) {
            Node<T> tempNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = tempNode;
        }
        Node<T> oldHeadNode = this.head;
        this.head = tail;
        this.head.next = prevNode;
        this.tail = oldHeadNode;
        this.tail.next = null;

    }

    public void printList() {
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("End of the List");
    }


    public int getListCount() {
        return size + 1;
    }
}
