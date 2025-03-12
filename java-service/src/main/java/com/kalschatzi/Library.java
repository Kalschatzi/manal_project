package com.kalschatzi;

// Library class to demonstrate Arraylist implementation
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private final String LIBRARYNAME = "Glasgow Library"; // set default library name
    private List<Book> libraryCatalogue;

    public Library(){
        this.libraryCatalogue = new Arraylist2<>();
    }

    // method that adds books to library catalogue
    public void addBook(Book book){
        libraryCatalogue.add(book);
        System.out.println("Added: " + book.getTitle());

    }

    // method that removes book from library catalogue
    public void removeBook(String title){
        libraryCatalogue.removeIf(book -> book.getTitle().equals(title));
    }

    // method that finds book by title
    public Book findBook(String title){
        for (Book book : libraryCatalogue){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    // method that displays full library catalogue
    public void displayCatalogue(){
        System.out.println("Full catalogue at " + LIBRARYNAME + ":");
        for (Book book : libraryCatalogue){
            System.out.println(book);
        }
    }

    // method that sorts books by year published
    public void sortBooksByYear(){
        Collections.sort(libraryCatalogue, Comparator.comparingInt(Book::getYearPublished));

    }

    // method that sorts books by title
    public void sortBooksByTitle(){
        Collections.sort(libraryCatalogue, Comparator.comparing(Book::getTitle));
    }

    // method that returns all available books(not checked out)
    public List<Book> getAvailableBooks(){
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : libraryCatalogue){
            if (!book.getIsCheckedOut()){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    // method that returns the total number of books in the library
    public int getTotalBooks(){
        return libraryCatalogue.size();
    }

    // method that checks out a book from the library with appropriate error message
    public void checkOut(String title){
        Book book = findBook(title);
        if (book != null) {
            book.checkOut();
        }
        else {
            System.out.println(title + "not found");
        }
    }

    // method that return a checked out book with appropriate error message
    public void returnBook(String title) {
        Book book = findBook(title);
        if (book !=null ){
            book.returnBook();
        }
        else {
            System.out.println(title + " not found");
        }
    }



}
