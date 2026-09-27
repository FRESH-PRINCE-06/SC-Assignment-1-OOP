package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Task 4 - Corrected Member class.
 *
 * The AI's original version returned its internal ArrayList directly
 * from a getBorrowedBooks() style method, which let any outside code
 * add or remove books from a member's record without going through
 * borrowBook()/returnBook() - completely bypassing the "already issued"
 * and "borrowing limit" business rules. This version fixes that by
 * returning an unmodifiable view of the list, so the only way to change
 * a member's borrowed books is through the validated methods below.
 */
public class Member {

    private static final int MAX_BOOKS = 3;

    private final String memberId;
    private final String name;
    private final List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    /** Returns a read-only view - callers cannot mutate the real list. */
    public List<Book> getBorrowedBooks() {
        return Collections.unmodifiableList(borrowedBooks);
    }

    public boolean borrowBook(Book book) {
        if (book.isIssued()) {
            System.out.println("Borrow failed: \"" + book.getTitle() + "\" is already issued.");
            return false;
        }
        if (borrowedBooks.size() >= MAX_BOOKS) {
            System.out.println("Borrow failed: " + name + " has reached the borrowing limit of " + MAX_BOOKS + ".");
            return false;
        }
        book.setIssued(true);
        borrowedBooks.add(book);
        System.out.println(name + " borrowed \"" + book.getTitle() + "\".");
        return true;
    }

    public boolean returnBook(Book book) {
        if (!borrowedBooks.remove(book)) {
            System.out.println("Return failed: " + name + " did not borrow \"" + book.getTitle() + "\".");
            return false;
        }
        book.setIssued(false);
        System.out.println(name + " returned \"" + book.getTitle() + "\".");
        return true;
    }
}
