package com.kalschatzi;


import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist<T> {

    private Node<T> head;
    private int size;

    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(T element){ // Add an element to the end of the LL
        Node<T> newNode = new Node<>(element);
        if (head == null){
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next !=null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, T element){ // add an element at a specific index
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        Node<T> newNode = new Node<>(element);
        if (index == 0){
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index -1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size ++;
    }

    public T remove(int index){// Remove an element at a specific index
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        T removedElement;
        if (index == 0){
            removedElement = head.data;
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedElement = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return removedElement;
    }

    public T get(int index){ // get an element at a specific index
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public T set(int index, T element){ // set an element at a specific value
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        T oldValue = current.data;
        current.data = element;
        return oldValue;
    }

    public boolean contains(T element){ // check if the list contains a specific element
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(element)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size(){ // get the size of the LL
        return  size;
    }

    public boolean isEmpty(){ // check if the LL is empty
        return size == 0;
    }

    public void clear(){ // clear the LL
        head = null;
        size = 0;
    }

    public Object[] toArray(){ // convert the LL to an array
        Object[] array = new Object[size];
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = head;
        while (current != null){
            sb.append(current.data);
            if (current.next != null){
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }



}
