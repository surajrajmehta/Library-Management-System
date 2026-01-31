package library;

public class LibraryBook extends BookItem implements Issueable {

    private boolean isAvailable = true;
    private String issuedTo = "None";
    private String description;


    public LibraryBook(String title, int bookId, String author) {
        super(title, bookId, author);
        this.description = "No description provided.";
    }

    public LibraryBook(String title, int bookId, String author, String description) {
        super(title, bookId, author);
        this.description = description;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    
    public void issueBook(String studentName) {
        try {
            if (!isAvailable) {
                throw new IllegalStateException(
                        "Book already issued to " + issuedTo
                );
            }

            isAvailable = false;
            issuedTo = studentName;
            System.out.println("Book issued to " + studentName);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void issueBook(String studentName, int issueDurationDays) {
        try {
            if (issueDurationDays < 0) {
                throw new NegativeValueException(
                        "Issue duration cannot be negative"
                );
            }

            issueBook(studentName);

            if (issueDurationDays > MAX_ISSUE_DAYS) {
                System.out.println(
                        "Warning: Issue duration exceeds MAX_ISSUE_DAYS"
                );
            }

        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public void returnBook() {
        isAvailable = true;
        issuedTo = "None";
        System.out.println("Book returned successfully.");
    }

    
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Available: " + isAvailable);
        System.out.println("Issued To: " + issuedTo);
        System.out.println("--------------------------");
    }

    
    public String toString() {
        return "LibraryBook {" +
                "Title='" + title + '\'' +
                ", Book ID=" + bookId +
                ", Author='" + author + '\'' +
                ", Available=" + isAvailable +
                ", Issued To='" + issuedTo + '\'' +
                '}';
    }
}
