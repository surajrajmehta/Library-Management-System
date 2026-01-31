package library;

public abstract class BookItem {

    protected String title;
    protected int bookId;
    protected String author;

    public static final int MAX_ISSUE_DAYS = 7;

    public BookItem(String title, int bookId, String author) {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
    }

    public abstract void displayBookDetails();
}
