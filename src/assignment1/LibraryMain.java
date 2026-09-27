package assignment1;

/**
 * Task 4 - Demonstrates the corrected Book/Member classes and shows that
 * the borrowing-limit and already-issued business rules (missing from the
 * AI's original code) now actually hold.
 */
public class LibraryMain {

    public static void main(String[] args) {
        Book b1 = new Book("978-0132350884", "Clean Code", "Robert C. Martin");
        Book b2 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        Book b3 = new Book("978-0596007126", "Head First Design Patterns", "Freeman & Robson");
        Book b4 = new Book("978-0201633610", "Design Patterns", "Gang of Four");

        Member m1 = new Member("M001", "Ayesha Khan");

        m1.borrowBook(b1);
        m1.borrowBook(b2);
        m1.borrowBook(b3);
        m1.borrowBook(b4); // should fail: borrowing limit of 3 reached

        System.out.println();
        System.out.println(m1.getName() + "'s borrowed books:");
        for (Book b : m1.getBorrowedBooks()) {
            System.out.println(" - " + b);
        }

        System.out.println();
        m1.returnBook(b1);
        System.out.println("After returning Clean Code -> " + b1);

        Member m2 = new Member("M002", "Bilal Ahmed");
        System.out.println();
        m2.borrowBook(b2); // should fail: b2 is still issued to Ayesha
    }
}
