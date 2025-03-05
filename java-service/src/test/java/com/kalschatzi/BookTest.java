package test.java.com.kalschatzi;

import main.java.com.kalschatzi.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookTest {

    private ArrayList<Book> books;

    @BeforeEach
    public void setUp() {
        books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Jane Eyre", "Charlotte Bronte"));
        books.add(new Book("Moby-Dick", "Herman Melville"));
    }

    @Test
    void testAddBook(){
        books.add(new Book("The Stranger", "Albert Camus"));
        assertEquals(4, books.size());
        assertEquals("The Stranger", books.get(3).getTitle());
    }

    @Test
    void addBooksAtIndex(){
        books.add(0, new Book("Great Expectations", "Charles Dickens"));
        assertEquals("Great Expectations", books.get(0).getTitle());
    }

    @Test
    void testGetBook(){
        Book book = books.get(1);
        assertEquals("Jane Eyre", book.getTitle());
        assertEquals("Charlotte Bronte", book.getAuthor());
    }

    @Test
    void testSetBook() {
        books.set(1, new Book("Frankenstein", "Mary Shelly"));
        assertEquals("Frankenstein", books.get(1).getTitle());
        assertEquals("Mary Shelly", books.get(1).getAuthor());
    }

    @Test
    void testRemoveBook(){
        Book removed = books.remove(1);
        assertEquals("Jane Eyre", removed.getTitle());
        assertEquals(2, books.size());
    }

    @Test
    void testSize(){
        assertEquals(3, books.size());
    }

    @Test
    void testIsEmpty(){
        assertFalse(books.isEmpty());
        books.clear();
        assertTrue(books.isEmpty());
    }

//    @Test
//    void testContains(){
//        Book bookToSearch = new Book("1984", "George Orwell");
//        assertTrue(books.contains(bookToSearch));
//        bookToSearch = new Book("Little Women", "Louisa May Alcott");
//        assertFalse(books.contains(bookToSearch));
//    }

//    @Test
//    void testIndexOf(){
//        assertEquals(0, books.indexOf(new Book("1984", "George Orwell")));
//        assertEquals(-1, books.indexOf(new Book("Little Women", "Louisa May Alcott")));
//    }

    @Test
    void testClear(){
        books.clear();
        assertTrue(books.isEmpty());
    }

    @Test
    void testClone(){
        ArrayList<Book> books2 = (ArrayList<Book>) books.clone();
        assertEquals(books.size(), books2.size());
        for (int i = 0; i < books.size(); i++){
            assertEquals(books.get(i).getTitle(), books2.get(i).getTitle());
            assertEquals(books.get(i).getAuthor(), books2.get(i).getAuthor());
        }
    }

    @Test
    void testReplaceAll(){
        books.replaceAll(book -> new Book(book.getTitle().toUpperCase(), book.getAuthor().toUpperCase()));
        assertEquals("1984", books.get(0).getTitle());
        assertEquals("GEORGE ORWELL", books.get(0).getAuthor());
    }

    @Test
    void testSort(){
        Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
        books.sort(authorComparator);
        assertEquals("Charlotte Bronte", books.get(0).getAuthor());
        assertEquals("George Orwell", books.get(1).getAuthor());
        assertEquals("Herman Melville", books.get(2).getAuthor());
    }

    @Test
    void testSubList(){
        List<Book> subList = books.subList(1, 3);
        assertEquals(2, subList.size());
        assertEquals("Jane Eyre", subList.get(0).getTitle());
        assertEquals("Moby-Dick", subList.get(1).getTitle());
    }
}
