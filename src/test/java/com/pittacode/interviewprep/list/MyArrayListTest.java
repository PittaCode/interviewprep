package com.pittacode.interviewprep.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void newlyInitialisedArrayHasSize0() {
        MyArrayList list = new MyArrayList();

        assertEquals(0, list.size());
    }
}