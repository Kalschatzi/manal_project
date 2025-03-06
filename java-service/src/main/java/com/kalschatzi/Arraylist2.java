package main.java.com.kalschatzi;
import java.util.Arrays;
import java.util.ArrayList;
// Arraylist implementation
public class Arraylist2<E> { // generic type 'E' allowing the arraylist to store any object

    private static final int Initial_CAPACITY = 10;
    private Object[] elements;
    private int size;

    // Constructor
    public Arraylist2(){
        elements = new Object[Initial_CAPACITY];
        size = 0;
    }

    // add an element to the end of the arraylist
    public void add(E element){
        ensureCapacity(); // ensures capacity before adding elements
        elements[size++] = element;
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

    // get the number of elements in the list
    public int size(){
        return size;
    }

    // check if the list is empty
    public boolean isEmpty(){
        return size == 0;
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
