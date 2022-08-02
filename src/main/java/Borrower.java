import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public void checkOutBookFromLibrary(Library library, Book bookToBorrow) {
        library.removeBook(bookToBorrow);
        collection.add(bookToBorrow);
    }

    public int bookCount() {
        return collection.size();
    }
}
