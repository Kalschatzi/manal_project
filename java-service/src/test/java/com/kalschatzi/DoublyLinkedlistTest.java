package com.kalschatzi;

import com.kalschatzi.DoublyLinkedlist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.traversal.NodeIterator;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedlistTest {
    private DoublyLinkedlist<Integer> list;

    @BeforeEach
    void setUp(){
        list = new DoublyLinkedlist<>();
    }

    @Test
    void testAddFront(){
        list.addFront(1);
        list.addFront(2);
        assertEquals(2, list.getSize());
        assertEquals(2, list.removeFront());
        assertEquals(1, list.removeFront());
        assertTrue(list.isEmpty());


    }

    @Test
    void testAddBack(){
        list.addBack(1);
        list.addBack(2);
        assertEquals(2, list.getSize());
        assertEquals(1, list.removeFront());
        assertEquals(2, list.removeFront());
        assertTrue(list.isEmpty());

    }

    @Test
    void testRemoveFront(){
        list.addBack(1);
        list.addBack(2);
        assertEquals(1, list.removeFront());
        assertEquals(1, list.getSize());
        assertEquals(2, list.getElement(0));
    }

    @Test
    void testRemoveBack(){
        list.addBack(1);
        list.addBack(2);
        assertEquals(2, list.removeBack());
        assertEquals(1, list.getElement(0));
    }

    @Test
    void isEmpty(){
        assertTrue(list.isEmpty());
        list.addFront(1);
        assertFalse(list.isEmpty());
    }

    @Test
    void testContains(){
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        assertTrue(list.contains(2));
        assertFalse(list.contains(4));
    }

    @Test
    void TestGetElement(){
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        assertEquals(2, list.getElement(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.getElement(3));
    }

    @Test
    void testClear(){
        list.addBack(1);
        list.addBack(2);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.getSize());
    }

    @Test
    void testIteration(){
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);

        List<Integer> forwardResult = list.iterateForward();
        List<Integer> expectedForward = Arrays.asList(1, 2, 3);
        assertEquals(expectedForward, forwardResult);

        List<Integer> backwardResult = list.interateBackword();
        List<Integer> expectedBackward = Arrays.asList(3, 2, 1);
        assertEquals(expectedBackward, backwardResult);
    }





}
