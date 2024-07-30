// LibraryManager.java
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books;

    // Constructor
    public LibraryManager() {
        books = new ArrayList<>();
        // Initialize books list with some example books
        books.add(new Book(1, "Java Programming", "John Doe"));
        books.add(new Book(2, "Python Basics", "Jane Smith"));
        books.add(new Book(3, "Data Structures", "Alice Johnson"));
    }

    // Linear search to find a book by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Binary search to find a book by title (assuming the list is sorted by title)
    public Book binarySearchByTitle(String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook; // Book found
            } else if (comparison < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return null; // Book not found
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        // Example usage of linear search
        Book foundBook = library.linearSearchByTitle("Python Basics");
        if (foundBook != null) {
            System.out.println("Linear Search - Book found: " + foundBook);
        } else {
            System.out.println("Linear Search - Book not found");
        }

        // Example usage of binary search
        foundBook = library.binarySearchByTitle("Java Programming");
        if (foundBook != null) {
            System.out.println("Binary Search - Book found: " + foundBook);
        } else {
            System.out.println("Binary Search - Book not found");
        }
    }
}
