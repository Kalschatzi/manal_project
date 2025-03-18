package com.kalschatzi;
import java.util.*;
// Arraylist implementation
public class Arraylist2<E> implements List<E>{ // generic type 'E' allowing the arraylist to store any object

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
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++){
            if (o.equals(elements[i])){
                System.arraycopy(elements, i + 1, elements, i, size -i - 1);
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c){
            if (!contains(o)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] a = c.toArray();
        int numNew = a.length;

        System.arraycopy(a,0, elements, size, numNew);
        return numNew != 0;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {

        Object[] a = c.toArray();
        int numNew = a.length;

        int numMoved = size - index;
        if(numMoved > 0)
            System.arraycopy(elements, index, elements, index + numNew, numMoved);
        System.arraycopy(a, 0, elements, index, numNew);
        size += numNew;
        return numNew != 0;

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (int i = size - 1; i >= 0; i--){
            if(c.contains(elements[i])){
                remove(i);
                modified = true;
            }
        }
        return  modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = size - 1; i >= 0; i--){
            if(!c.contains(elements[i])){
                remove(i);
                modified = true;
            }
        }
        return modified;
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
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0){
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return oldValue;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null){
            for (int i = 0; i < size; i++){
                if(elements[i] == null){
                    return i;
                }
            }
        }
        else {
            for (int i = 0; i < size; i++){
                if (o.equals(elements[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null){
            for (int i = size - 1; i >= 0; i--){
                if (elements[i] == null){
                    return i;
                }
            }

        }
        else{
            for (int i = size - 1; i >= 0; i--){
                if (o.equals(elements[i])){
                    return  i;
                }
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return new ListIterator<E>() {
            private int cursor = index;
            private int lastRet = -1;

            public boolean hasNext() {
                return cursor != size;
            }

            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                lastRet = cursor;
                return (E) elements[cursor++];
            }

            public boolean hasPrevious() {
                return cursor != 0;
            }

            public E previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                lastRet = --cursor;
                return (E) elements[cursor];
            }

            public int nextIndex() {
                return cursor;
            }

            public int previousIndex() {
                return cursor - 1;
            }

            public void remove() {
                if (lastRet < 0) {
                    throw new IllegalStateException();
                }
                Arraylist2.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
            }

            public void set(E e) {
                if (lastRet < 0) {
                    throw new IllegalStateException();
                }
                Arraylist2.this.set(lastRet, e);
            }

            public void add(E e) {
                Arraylist2.this.add(cursor++, e);
                lastRet = -1;
            }
        };
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return new AbstractList<E>() {
            public E get(int index) {
                return Arraylist2.this.get(fromIndex + index);
            }
            public int size() {
                return toIndex - fromIndex;
            }
            public E set(int index, E element) {
                return Arraylist2.this.set(fromIndex + index, element);
            }
        };
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

        E oldValue = (E) elements[index];
        elements[index] = element;
        return oldValue;
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
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return get(index++);
            }
        };

    }


    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size){
            return ((T[])Arrays.copyOf(elements, size, a.getClass()));
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size){
            a[size] = null;
        }
        return a;
    }

    // remove all elements from the list
    public void clear(){
        // set all elements to null to help garbage collection
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }

    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("Index out of bounds!");
    }

}




