package com.kalschatzi;

import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class DoublyLinkedlist<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T>{
        private T data;
        private Node<T> next;
        private Node<T> prev;

        Node(T data){
            this.data = data;
        }
    }

    public void addFront(T val){ // Function to add a node in the front of doubly linked list
        Node<T> temp = new Node<>(val);
        if (head == null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size ++;
    }

    public void addBack(T val){
        Node<T> temp = new Node<>(val);
        if (tail == null){
            head = tail = temp;
        }
        else{
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        size ++;
    }

    public T removeFront(){
        if (isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
        T data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        else{
            head.prev = null;
        }
        size --;
        return data;
    }

    public T removeBack(){
        if (isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
        T data = tail.data;
        tail = tail.prev;
        if (tail == null){
            head = null;
        }
        else {
            tail.next = null;
        }
        size --;
        return data;
    }

    public void iterateForward(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void interateBackword(){
        Node<T> temp = tail;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(T element){
        Node<T> current = head;
        while (current != null){
            if (current.data.equals(element)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public  T getElement(int index){ // returns the element at a specific index
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index" + index + " is out of bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }






 }

