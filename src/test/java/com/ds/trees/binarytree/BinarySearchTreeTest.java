package com.ds.trees.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    private BinarySearchTree<Integer> binarySearchTree;
    @BeforeEach
    public void setup() {
        binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(13);
        binarySearchTree.insert(11);
        binarySearchTree.insert(2);
        binarySearchTree.insert(16);
        binarySearchTree.insert(10);
        binarySearchTree.insert(7);
    }

    @Test
    public void testDataIsInserted(){
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
    @Test
    public void testBreadthFirstSearch(){
        var result = binarySearchTree.breathFirstSearch();
        assertNotNull(result);
    }

    @Test
    public void testDepthFirstSearchPreOrder(){
        var result = binarySearchTree.depthFirstSearchPreOrder();
        assertNotNull(result);
        assertEquals(10, result.get(0));
        assertEquals(5, result.get(1));
        assertEquals(2, result.get(2));
        System.out.printf(result.toString());
    }

    @Test
    public void testDeptFirstSearchPostOrder(){
        var result = binarySearchTree.depthFirstSearchPostOrder();
        assertNotNull(result);
        assertEquals(2, result.get(0));
        System.out.printf(result.toString());
    }
}