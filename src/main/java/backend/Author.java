package backend;

import java.util.ArrayList;

/**
 * This class represents an author.
 * It contains details about the author such as author ID, first name, last name, and a list of books written by the author.
 */
public class Author {
    // ID of the author
    private int authorID;
    // First name of the author
    private String firstName;
    // Last name of the author
    private String lastName;
    // List of books written by the author
    private ArrayList<Book> bookList = new ArrayList<>();

    /**
     * Constructor for the Author class.
     * @param firstName The first name of the author.
     * @param lastName The last name of the author.
     */
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Getter for the ID of the author.
     * @return The ID of the author.
     */
    public int getAuthorID() {
        return authorID;
    }

    /**
     * Setter for the ID of the author.
     * @param authorID The new ID of the author.
     */
    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    /**
     * Getter for the first name of the author.
     * @return The first name of the author.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for the first name of the author.
     * @param firstName The new first name of the author.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for the last name of the author.
     * @return The last name of the author.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for the last name of the author.
     * @param lastName The new last name of the author.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for the list of books written by the author.
     * @return The list of books written by the author.
     */
    public ArrayList<Book> getBookList() { return bookList;}

    /**
     * Adds a book to the list of books written by the author.
     * @param book The book to be added.
     */
    public void addBook(Book book) { this.bookList.add(book); }

    /**
     * Removes a book from the list of books written by the author.
     * @param book The book to be removed.
     */
    public void removeBook(Book book) { this.bookList.remove(book); }

    /**
     * Returns a string representation of the author.
     * @return The full name of the author.
     */
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}