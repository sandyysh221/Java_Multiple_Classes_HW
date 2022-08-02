import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The Hobbit", "JRR Tolkien", "fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Hobbit", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("JRR Tolkien", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("fantasy", book.getGenre());
    }

}
