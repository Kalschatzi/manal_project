package com.kalschatzi;
import com.kalschatzi.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    private Book book;

    @BeforeEach
    void setUp(){
        book = new Book("1984", "George Orwell", 1949);
    }

    @Test
    void testBookDetails(){
        assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
        assertEquals(1949, book.getYearPublished());
        assertFalse(book.getIsCheckedOut());
    }

    @Test
    void testCheckOut(){
        book.checkOut();
        assertTrue(book.getIsCheckedOut());
        book.checkOut();
        assertTrue(book.getIsCheckedOut()); // Should return an error message if you try to checkout out a book that's already checked out
    }

    @Test
    void testReturnBook(){
        book.checkOut();
        book.returnBook();
        assertFalse(book.getIsCheckedOut());

    }

    @Test
    void testToString(){
        assertEquals("Title: '1984', Author: 'George Orwell', Year Published: '1949', Checked out?: 'false'", book.toString());
    }




}