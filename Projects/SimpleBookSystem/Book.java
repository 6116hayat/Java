package Projects.SimpleBookSystem;


public class Book {

    // Creating the Variables
    // 1.Id 2.Title 3.Author 4.isBorrowed

    // Methods
    // ৹ Constructor to initialize book details
    // ৹ Getters and setter for each attribute
    // ৹ toString() method to print book details

    // Private Variables
    private int id;
    private String title;
    private String author;
    private Boolean isBorrowed;

    // Constructor for book details
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getter for Id
    public int getId() {
        return id;
    }

    // Setter for Id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for Title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for Author
    public String getAuthor() {
        return author;
    }

    // Setter for Author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for isBorrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Setters for IsBorrowed
    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    // OverRide Method
    @Override
    public String toString() {
        return "Book = {" + "id =" + id + ", title =" + title + ", author =" + author + ", isBorrowed =" + isBorrowed
                + "}";
    }

}
