package com.ds.LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {


SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
    @Test
    public void testSinglyLinkedListShouldBeNullAtCreation(){
        assertNull(singlyLinkedList.head);
        assertNull(singlyLinkedList.tail);
        assertEquals(0, singlyLinkedList.getListCount());
    }

    @Test
    public void testInsert(){
        singlyLinkedList.insert(200);
        singlyLinkedList.insert(300);
        assertEquals(2, singlyLinkedList.getListCount());
        assertEquals(200, singlyLinkedList.head.data);
        assertEquals(300, singlyLinkedList.tail.data);
    }

    @Test
    public void testInsertFirst(){
        singlyLinkedList.insertFirst(100);
        singlyLinkedList.insertFirst(500);
        singlyLinkedList.insertFirst(300);
        assertEquals(3, singlyLinkedList.getListCount());
        assertEquals(300, singlyLinkedList.head.data);
        assertEquals(100, singlyLinkedList.tail.data);
    }

    @Test
    public void testInsertAtGivenPosition(){
        singlyLinkedList.insert(200);
        singlyLinkedList.insert(300);
        singlyLinkedList.insert(400);
        singlyLinkedList.insertAtPosition(150, 1);
        assertEquals(4, singlyLinkedList.getListCount());
        assertEquals(150, singlyLinkedList.getDataAtPos(1));
    }

    @Test
    public void testReverseLinkedList(){
        singlyLinkedList.insert(200);
        singlyLinkedList.insert(300);
        singlyLinkedList.insert(400);
        singlyLinkedList.reverseList();
        assertEquals(400, singlyLinkedList.head.data);
    }
}
