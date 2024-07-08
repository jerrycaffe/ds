package com.ds.Stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StacksTest {

    private Stacks<Integer> stacks;

    @BeforeEach
    public void setUp() {
        stacks = new Stacks<>();
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
    }

    @Test
    public void testPush() {
        assertNotNull(stacks.current);
        assertEquals(30, stacks.current.data);
        assertFalse(stacks.isEmpty());
        assertEquals(2, stacks.top);
    }

    @Test
    public void testPop(){
        Integer popped = stacks.pop();

        assertEquals(30, popped);
        assertEquals(1, stacks.top);
        assertEquals(20, stacks.current.data);

    }

    @Test
    public void testEmptyStack(){
        stacks.pop();
        stacks.pop();
        stacks.pop();

        assertEquals(-1, stacks.top);
        assertNull(stacks.current);
    }
}