package com.kalschatzi;
import java.util.*;

// Arraylist implementation
public class Arraylist2<E> implements List<E> { // generic type 'E' allowing the arraylist to store any object

    private static final int Initial_CAPACITY = 10;
    private Object[] elements;
    private int size;

    // Constructor
    public Arraylist2(){
        elements = new Object[Initial_CAPACITY];
        size = 0;
    }

    // add an element to the end of the arraylist
    @Override
    public boolean add(E element){
        ensureCapacity(); // ensures capacity before adding elements
        elements[size++] = element;
        return true; //TODO fixme
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    // Inserting an element at a specific index (also, example of method overloading)
    public void add(int index, E element){
        if (index < 0 || index > size ){ // check if index is valid
            throw new IndexOutOfBoundsException("This index doesn't exist");
        }
        ensureCapacity();
        // shifting elements to the right to make space for the new element
        System.arraycopy(element, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    // private method to ensure capacity for adding new elements
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // get an element at a specific index
    public E get(int index){
        if (index < 0 || index >= size) { // check if index is valid
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index]; // why do we need to cast to type E?
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    // get the number of elements in the list
    public int size(){
        return size;
    }

    // check if the list is empty
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    // remove all elements from the list
    public void clear(){
        // set all elements to null to help garbage collection
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }
}
