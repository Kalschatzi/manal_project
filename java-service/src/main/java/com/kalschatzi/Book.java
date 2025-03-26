package com.kalschatzi;

// Book class to demonstrate Arraylist

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private boolean isCheckedOut;


    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isCheckedOut = false; // initialise as false as every book starts off not checked out
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int newYearPublished) {
        this.yearPublished = newYearPublished;
    }

    public boolean getIsCheckedOut(){
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean checkedOut){
        isCheckedOut = checkedOut;
    }

    // method that checks out a book from the library with appropriate error message if book is  unavailable
    public void checkOut(){
        if (!isCheckedOut){
            isCheckedOut = true;
            System.out.println("You've checked out " + title);
        }
        else{
            System.out.println("Sorry, this book is already checked out :(");
        }
    }

    // method that returns a book to the library
    public void returnBook(){
        if(isCheckedOut){
            isCheckedOut = false;
            System.out.println("Thanks for returning " + title);
        }
    }


    @Override
    public String toString() {
        return
                "Title: '" + title + '\'' +
                ", Author: '" + author + '\'' +
                ", Year Published: '" + yearPublished + '\'' +
                ", Checked out?: '" + isCheckedOut + '\'' ;
    }
}


