package com.ds.LinkedLists;

/**
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
        this.size = size + 1;
        if (this.head == null)
            insertIntoEmptyHead(data);
        else {
            Node<T> newNode = new Node<>(data);
            newNode.next = this.head;
            this.head = newNode;
        }

    }

    private Node<T> insertIntoEmptyHead(T data) {
        Node<T> newValue = new Node<>(data);
        this.head = newValue;
        this.tail = newValue;
        return newValue;
    }

    public Node<T> insert(T data) {
        Node<T> newValue = new Node<>(data);
        this.size = size + 1;
        if (this.head == null) {
            insertIntoEmptyHead(data);
        }

        Node<T> currentNode = this.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newValue;
        this.tail = newValue;
        return tail;
    }

    public void insertAtPost(T data, int location) {
        // if list is empty and location is not 0 return error
        // location is greater than the size + 1, of list, return error
        // insert("ade", 0) this should go to first location
        //

        if (this.size == -1 && location != 0 || location - 1 > this.size) {
            System.out.println("ListOutOfBoundsException You cannot insert into position" + location
                    + "as the current size is " + this.size);

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
