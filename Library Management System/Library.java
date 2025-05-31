
package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    
      private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void showAllBooks() {
        System.out.println("Books in library:");
        for (Book b : books) {
            System.out.println("- " + b.getTitle() + (b.isBorrowed() ? " (Not available)" : " (Available)"));
        }
    }
}
