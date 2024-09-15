package Projects.BookManagementSystem;

import java.util.*;

public class LibraryManager {

    // Creating Variables
    // List <Book> books

    // Methods
    // ৹ addBook(Book book) : Adds A new book to the library
    // ৹ updateBook(int id, String title, String author) : Updates book details
    // ৹ deleteBook(int id) : Deletes a book by id
    // ৹ listBooks() : Lists all books
    // ৹ searchBooks(String query) : Searches for books by title or author

    private List<Book> books;

    public LibraryManager() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added Successfully");
    }

    // Method to update book details
    public void updateBook(int id, String title, String author) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(title);
                book.setAuthor(author);
                System.out.println("Book Updated Successfully !!");
                return;
            }
        }
        System.out.println("Book not Found !!");
    }

    // Method to delete the book by Id
    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Book Deleted Successfully");
    }

    // Method to list all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available in the library");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Method to search book By author
    public void searchBooks(String query) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching the query");
        }
    }

    // Method to Borrow a book
    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true);
                    System.out.println("Book Borrowed successfully!");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found!!");
    }

    // Method to return the book
    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("Book Returned successfully!");
                } else {
                    System.out.println("Book was not borrrowed");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
