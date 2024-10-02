package com.pittacode.interviewprep.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    MyCircularQueue underTest = new MyCircularQueue(3);

    @Test
    void test() {
        assertTrue(underTest.enQueue(1));
        assertTrue(underTest.enQueue(2));
        assertTrue(underTest.enQueue(3));
        assertFalse(underTest.enQueue(4));
        assertEquals(3, underTest.Rear());
        assertTrue(underTest.isFull());
        assertTrue(underTest.deQueue());
        assertTrue(underTest.enQueue(4));
        assertEquals(4, underTest.Rear());
    }
}