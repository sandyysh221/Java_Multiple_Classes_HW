import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(3);
    }

    @Test
    public void canBorrowBookFromLibrary() {
        Book book1 = new Book("Little Women", "Louisa May Alcott", "coming-of-age");
        Book book2 = new Book("The Hobbit", "JRR Tolkien", "fantasy");
        Book book3 = new Book("Anne of Green Gables", "Lucy Maud Montgomery", "coming-of-age");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.checkOutBookFromLibrary(library, book1);
        assertEquals(2, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }
}


