package com.kalschatzi;

import com.kalschatzi.Book;
import com.kalschatzi.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp(){
        library = new Library();
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("Jane Eyre", "Charlotte Bronte", 1847));
        library.addBook(new Book("Frankenstein", "Mary Shelly", 1818));
    }

    @Test
    void testAddBooks(){
        Book newBook = new Book("Great Expectations", "Charles Dickens", 1860);
        library.addBook(newBook);
        assertEquals(4, library.getTotalBooks());
        assertNotNull(library.findBook("Great Expectations"));
    }

    @Test
    void testRemoveBook(){
        library.removeBook("1984");
        assertEquals(2, library.getTotalBooks());
        assertNull(library.findBook("1984"));
    }

    @Test
    void testFindBook(){
        Book bookToFind = library.findBook("Frankenstein");
        assertNotNull(bookToFind);
        assertEquals("Frankenstein", bookToFind.getTitle());
    }

//    @Test
//    void testSortBooksByYear(){
//        library.sortBooksByYear();
//        assertEquals("1984", library.get(0));
//    }

    @Test
    void testGetAvailableBooks(){
        assertEquals(3, library.getAvailableBooks().size());
        library.checkOut("1984");
        assertEquals(2, library.getAvailableBooks().size());
    }

    @Test
    void testCheckoutOut(){
        Book bookToChecKout =  library.findBook("1984");
        library.checkOut("1984");
        assertTrue(bookToChecKout.getIsCheckedOut());
        assertEquals(2, library.getAvailableBooks().size());
    }

    @Test
    void testReturnBook(){
        Book bookToReturn =  library.findBook("1984");
        library.returnBook("1984");
        assertFalse(bookToReturn.getIsCheckedOut());
        assertEquals(3, library.getAvailableBooks().size());
    }


}
