package library;

public class ReferenceBook extends LibraryBook {

    public ReferenceBook(String title, int bookId, String author) {
        super(title, bookId, author);
    }

    public ReferenceBook(String title, int bookId, String author, String description) {
        super(title, bookId, author, description);
    }

    @Override
    public void issueBook(String studentName) {
        System.out.println(
                "Reference books cannot be issued, only used inside library."
        );
    }
}
