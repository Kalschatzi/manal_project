package com.kalschatzi;

import com.kalschatzi.Linkedlist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class LinkedlistTest {
    private Linkedlist<String> list;

    @BeforeEach
    void setUp(){
        list = new Linkedlist<String>();
    }

    @Test
    void testAdd(){
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
        assertEquals(3, list.size());
    }

    @Test
    void testAddAtIndex(){
        list.add("A");
        list.add("C");
        list.add(1, "B");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    @Test
    void testRemove() {
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals("B", list.remove(1));
        assertEquals(2, list.size());
        assertEquals("A", list.get(0));
        assertEquals("C", list.get(1));
    }

    @Test
    void testSet(){
        list.add("A");
        list.add("B");

        assertEquals("B", list.set(1, "C"));
        assertEquals("C", list.get(1));
    }

    @Test
    void testContains(){
        list.add("A");
        list.add("B");

        assertTrue(list.contains("A"));
        assertTrue(list.contains("B"));
        assertFalse(list.contains("C"));
    }

    @Test
    void testSize(){
        assertEquals(0, list.size());
        list.add("A");
        assertEquals(1, list.size());
        list.add("B");
        assertEquals(2, list.size());

    }

    @Test
    void testIsEmpty(){
        assertTrue(list.isEmpty());
        list.add("A");
        assertFalse(list.isEmpty());
    }

    @Test
    void testClear(){
        list.add("A");
        list.add("B");
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testToArray(){
        list.add("A");
        list.add("B");
        list.add("C");

        Object[] array = list.toArray();
        assertEquals(3, array.length);
        assertEquals("A", array[0]);
        assertEquals("B", array[1]);
        assertEquals("C", array[2]);
    }

    @Test
    void testToString(){
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("[A, B, C]", list.toString());
    }



}
