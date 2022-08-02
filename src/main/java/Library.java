import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;
    private int capacity;

    public Library(int capacity) {
        this.book = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return book.size();
    }

    public void addBook(Book newBook) {
        if (book.size() < capacity) {
        book.add(newBook);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean removeBook(Book bookToRemove) {
        return book.remove(bookToRemove);
    }
}
