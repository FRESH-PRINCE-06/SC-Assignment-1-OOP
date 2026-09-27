package assignment1;

/**
 * Task 4 - The AI Code Review (Meta-Learning)
 *
 * This is the CORRECTED version of the Book class after reviewing the
 * AI-generated code (see the assignment report for the original AI
 * output and the written critique). The fields are private and issued
 * status can only change through setIssued(), so no outside class can
 * silently flip a book's issued flag or edit its title/author.
 */
public class Book {

    private final String isbn;
    private final String title;
    private final String author;
    private boolean issued;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + isbn + ") - " + (issued ? "Issued" : "Available");
    }
}
