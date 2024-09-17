package Projects.SimpleBookSystem;

import java.util.*;

public class Main {

    // Methods:
    // ৹ main(String[] args) : Entry point of application
    // ৹ Menu-driven interface to interact with library system

    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. List Books");
            System.out.println("5. Search Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Books");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    libraryManager.addBook(new Book(id, title, author));
                    break;
                case 2:
                    System.out.print("Enter book ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new author: ");
                    String newAuthor = scanner.nextLine();
                    libraryManager.updateBook(updateId, newTitle, newAuthor);
                    break;
                case 3:
                    System.out.print("Enter book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    libraryManager.deleteBook(deleteId);
                    break;
                case 4:
                    libraryManager.listBooks();
                    break;
                case 5:
                    System.out.print("Enter title or author to search: ");
                    String query = scanner.nextLine();
                    libraryManager.searchBooks(query);
                    break;
                case 6:
                    System.out.println("Enter book ID to borrow:");
                    int borrowId = scanner.nextInt();
                    libraryManager.borrowBook(borrowId);
                    break;
                case 7:
                    System.out.println("Enter a book ID to return");
                    int returnId = scanner.nextInt();
                    libraryManager.returnBook(returnId);
                    break;
                case 8:
                    exit = true;
                    System.out.println("Exiting the System. GoodBye!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
