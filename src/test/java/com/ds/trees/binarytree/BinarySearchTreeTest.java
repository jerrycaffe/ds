package com.ds.trees.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    private BinarySearchTree<Integer> binarySearchTree;
    @BeforeEach
    public void setup() {
        binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(7);
        binarySearchTree.insert(13);
        binarySearchTree.insert(5);
    }

    @Test
    public void testDataInserted(){
        assertNotNull(binarySearchTree);
    }

    @Test
    public void testFindShouldReturnWhenValueIsFound(){
       Integer found = binarySearchTree.find(5);
       assertEquals(5, found);
    }

    @Test
    public void testFindShouldNotReturnWhenValueIsMissing(){
        Integer found = binarySearchTree.find(90);
        assertEquals(-1, found);
    }

    @Test
    public void testContainsShouldReturnTrueWhenValueIsPresent(){
        assertTrue(binarySearchTree.contains(13));
    }

    @Test
    public void testContainsShouldReturnFalseWhenValueIsMissing(){
        assertFalse(binarySearchTree.contains(100));
    }
}