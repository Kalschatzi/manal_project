package main.java.com.kalschatzi;

import java.util.*;

public class Book {

    private String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }



    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();


        // adding objects to arraylist
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Jane Eyre", "Charlotte Bronte"));
        books.add(new Book("Moby-Dick", "Herman Melville"));
        books.add(new Book("the Stranger", "Albert Camus"));
        System.out.println(Arrays.deepToString(books.toArray()));

        // Adding an object at a specific index
        books.add(0, new Book("Great Expectations", "Charles Dickens"));
        System.out.println(Arrays.deepToString(books.toArray()));

        // using the get method to get the object at index 2
        System.out.println("Book at index 2: " + books.get(2));

        // using set method to change book at index 0
        books.set(2, new Book("Frankenstein", "Mary Shelly"));
        System.out.println("Book at index 0 changed. New book is " + books.get(2));

        // remove
        Book removed = books.remove(3);
        System.out.println("Removed book: " + removed);



        // size
        System.out.println("Size of the list: " + books.size());

        // is empty
        System.out.println("Is the list empty? " + books.isEmpty());

        // contains
        Book bookToSearch = new Book("Little Women", "Louisa May Alcott");
        System.out.println("Does the list contain Little Women? " + books.contains(bookToSearch)); // a book not in the arraylist

        // index of
        System.out.println(Arrays.deepToString(books.toArray()));
//        System.out.println("Index of 1984: " + books.indexOf(books.get(1)));

        // clear method
//        books.clear();
        System.out.println(books.isEmpty()); // confirms arraylist is empty

        // clone method
        ArrayList<Book> books2 = (ArrayList)books.clone();
        System.out.println("books 2: " + Arrays.deepToString(books2.toArray()));

        // replace
        books.replaceAll(book -> new Book(book.getTitle().toUpperCase(), book.getAuthor().toUpperCase()));
        System.out.println(Arrays.deepToString(books.toArray()));

        // sort
        System.out.println("Arraylist before sorting: " + Arrays.deepToString(books.toArray()));
        Comparator<Book> autherComparator = Comparator.comparing(Book::getAuthor);
        books.sort(autherComparator);
        System.out.println("Arraylist After sorting: " + Arrays.deepToString(books.toArray()));

        // sublist
        List<Book> subList = books.subList(2, 4);
        books.subList(2, 3);
        System.out.println(Arrays.deepToString(subList.toArray()));


    }
}
