package com.ds.LinkedLists;

/**
 * Base class for starting up linked list
 */
public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}