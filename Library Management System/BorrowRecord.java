
package LibraryManagementSystem;

public class BorrowRecord {
    
    private User user;
    private Book book;

    public BorrowRecord(User user, Book book) {
        this.user = user;
        this.book = book;
        book.borrow();
    }
    
}
