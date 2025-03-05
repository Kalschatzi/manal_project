package main.java.com.kalschatzi;

import java.util.Arrays;

public class Arraylist2<E> { // 'E' type parameter stands for 'Element'. This makes the class generic allowing it to
                             // work with different data types.
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public Arraylist2(){
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void ensureCapacity(){
        if (size == elements.length){
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public void add(E element){ // adds a specific element to the end of the list
        ensureCapacity();
        elements[size++] = element;
    }

    public void add(int index, E element){ // inserts the element at a specific index position
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        System.arraycopy(element, index, element, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E get(int index){ // returns the element at the specified index
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public E remove(int index){ // removes an element from a specific index in the arraylist, shifts the remaining elements & updates the size of the list.
        if (index < 0 || index >= size){ // check if given index is valid & throws the appropriate exception if not
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1; // calculates how many elements need to be moved after removing the element at the given index
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved); // using System.arraycopy to shift
            // all elements after the removed element one position to the left
        }
        elements[--size] = null; // decrements the size of the arraylist and sets the last element to null.
        return removedElement;
    }


    public E set(int index, E element){
        E oldValue = (E) elements[index];
        elements[index] = element;
        return oldValue;
    }


    public int size(){ // returns size of the arraylist
        return size;
    }

    public boolean isEmpty(){ // returns true if the arraylist is empty anf false if it's not.
        return size == 0;
    }

    public void clear(){ // removes all elements from the list
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
    }

    public void trimToSize(){ // trims the capacity of the arraylist's instance to be the list's current size
        if (size < elements.length){
            elements = Arrays.copyOf(elements, size);
        }
    }

    public int indexOf(Object o){ // return the index of the specified element in the list, or -1 if it's not in the list
        if (o == null) {
            for (int i = 0; i < size; i++){
                if (elements[i] == null){
                    return i;
                }
            }
        }
        else{
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean contains(Object o){
        return indexOf(o) > 0;
    }

    public Object[] toArray(){ // returns an array containing all the elements in this list in proper sequence (from first to last element).
        return Arrays.copyOf(elements, size);
    }





}

