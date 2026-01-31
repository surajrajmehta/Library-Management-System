package library;

import java.util.ArrayList;

public class LibraryUtility {

    public static void displaySystemMessage() {
        System.out.println("Welcome to Library Management System");
    }

    public static int countTotalBooks(ArrayList<LibraryBook> books) {
        return books.size();
    }

    public static void addBook(ArrayList<LibraryBook> books, LibraryBook book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public static LibraryBook searchBookById(
            ArrayList<LibraryBook> books, int bookId) {

        for (LibraryBook book : books) {
            if (book.bookId == bookId) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        displaySystemMessage();

        ArrayList<LibraryBook> library = new ArrayList<>();

        LibraryBook b1 =
                new LibraryBook("Java Programming", 101, "James Gosling");

        ReferenceBook rb =
                new ReferenceBook("Oxford Dictionary", 201, "Oxford");

        addBook(library, b1);
        addBook(library, rb);


        Issueable issueableBook = b1;
        issueableBook.issueBook("Suraj");
        issueableBook.returnBook();

        rb.issueBook("Aman");

        LibraryBook found = searchBookById(library, 101);
        if (found != null) {
            System.out.println(found);
        }

        System.out.println("Total Books: " + countTotalBooks(library));
    }
}
