import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {
    Library library;

    @Before
    public void before() {
        library = new Library(3);
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryHasBooks() {
        Book book1 = new Book("Little Women", "Louisa May Alcott", "coming-of-age");
        Book book2 = new Book("The Hobbit", "JRR Tolkien", "fantasy");
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void libraryCanAddBook() {
        Book book = new Book("Little Women", "Louisa May Alcott", "coming-of-age");
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void libraryCanNotAddBookIfCapacityReached() {
        Book book1 = new Book("Little Women", "Louisa May Alcott", "coming-of-age");
        Book book2 = new Book("The Hobbit", "JRR Tolkien", "fantasy");
        Book book3 = new Book("Anne of Green Gables", "Lucy Maud Montgomery", "coming-of-age");
        Book book4 = new Book("The Great Gatsby", "F Scott Fitzgerald", "tragedy");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void libraryCanRemoveBook() {
        Book book1 = new Book("Little Women", "Louisa May Alcott", "coming-of-age");
        Book book2 = new Book("The Hobbit", "JRR Tolkien", "fantasy");
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
        library.removeBook(book2);
        assertEquals(1, library.bookCount());
    }
}
