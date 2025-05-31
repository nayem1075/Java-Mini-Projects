
package LibraryManagementSystem;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        Library library = new Library();
        library.addBook(new Book("Padma Nadir Majhi"));
        library.addBook(new Book("Lalon Fakir"));
        library.addBook(new Book("Amar Bondhu Rashed"));
        library.addBook(new Book("Ekattorer Dinguli"));
        library.addBook(new Book("Humayun Ahmed er Galpo"));

        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        User user = new User(userName);

        while (true) {
            System.out.println("\n1. Show all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                library.showAllBooks();

            } else if (choice.equals("2")) {
                System.out.print("Enter book title to borrow: ");
                String title = input.nextLine();

                Book book = library.findBookByTitle(title);
                if (book == null) {
                    System.out.println("Sorry! This book is not in the library.");
                } else if (book.isBorrowed()) {
                    System.out.println("Sorry! The book is already borrowed.");
                } else {
                    new BorrowRecord(user, book);
                    System.out.println("You successfully borrowed \"" + book.getTitle() + "\".");
                }

            } else if (choice.equals("3")) {
                System.out.println("Thank you for using the library system.");
                break;

            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        input.close();
    }  
}
