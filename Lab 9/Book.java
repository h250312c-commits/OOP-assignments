import java.util.Objects;

/** Book value identified by ISBN, regardless of its title. */
public class Book {
    /** Identifier used to compare books for equality. */
    private final String isbn;
    /** Display title; titles do not affect ISBN-based equality. */
    private final String title;

    /** Creates a book with nonblank ISBN and title values. */
    public Book(String isbn, String title) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN cannot be blank.");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank.");
        }
        this.isbn = isbn;
        this.title = title;
    }

    /** Returns the book's ISBN. */
    public String getIsbn() {
        return isbn;
    }

    /** Returns the book's title. */
    public String getTitle() {
        return title;
    }

    @Override
    /** Treats books with the same ISBN as equal. */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Book book)) {
            return false;
        }
        return isbn.equals(book.isbn);
    }

    @Override
    /** Builds a hash consistent with ISBN-based equality. */
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    /** Formats the title and ISBN for display. */
    public String toString() {
        return title + " (ISBN: " + isbn + ")";
    }
}
