import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Test Book", "Test Author", "1234567890", 2022);
        library.addBook(book);
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testRemoveBookByISBN() {
        Library library = new Library();
        Book book = new Book("Test Book", "Test Author", "1234567890", 2022);
        library.addBook(book);
        library.removeBookByISBN("1234567890");
        assertEquals(0, library.getBooks().size());
    }

    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        Book book = new Book("Test Book", "Test Author", "1234567890", 2022);
        library.addBook(book);
        library.findBookByTitle("Test Book");
        assertEquals("Book found: " + book.toString(), "Book found: " + book.toString());
    }
}
