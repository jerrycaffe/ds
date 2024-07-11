package com.ds.Queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuesTest {
    Queues<Integer> queues;
@BeforeEach
    public void setup(){
   queues = new Queues<>();

   queues.add(20);
   queues.add(30);
   queues.add(40);
   queues.add(50);
}

@Test
public void testAddShouldAddToBeg(){
    assertNotNull(queues);
    assertEquals(50, queues.tail.data);
    assertEquals(40, queues.tail.next.data);
    assertEquals(3, queues.size);
}
@Test
public void testPopShouldReduceQueue(){
    var value = queues.poll();
    assertEquals(value, 50);
}
}