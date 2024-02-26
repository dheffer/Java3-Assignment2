package backend;

import java.util.ArrayList;

/**
 * This class represents a book.
 * It contains details about the book such as ISBN, title, edition number, copyright, and a list of authors.
 */
public class Book {
    // ISBN of the book
    private String isbn;
    // Title of the book
    private String title;
    // Edition number of the book
    private int editionNumber;
    // Copyright of the book
    private String copyright;
    // List of authors of the book
    private ArrayList<Author> authorList = new ArrayList<>();

    /**
     * Constructor for the Book class.
     * @param isbn The ISBN of the book.
     * @param title The title of the book.
     * @param editionNumber The edition number of the book.
     * @param copyRight The copyright of the book.
     */
    public Book(String isbn, String title, int editionNumber, String copyRight) {
        this.isbn = isbn;
        this.title = title;
        this.editionNumber = editionNumber;
        this.copyright = copyRight;
    }

    /**
     * Getter for the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Setter for the ISBN of the book.
     * @param isbn The new ISBN of the book.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter for the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for the title of the book.
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for the edition number of the book.
     * @return The edition number of the book.
     */
    public int getEditionNumber() {
        return editionNumber;
    }

    /**
     * Setter for the edition number of the book.
     * @param editionNumber The new edition number of the book.
     */
    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    /**
     * Getter for the copyright of the book.
     * @return The copyright of the book.
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Setter for the copyright of the book.
     * @param copyright The new copyright of the book.
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * Getter for the list of authors of the book.
     * @return The list of authors of the book.
     */
    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    /**
     * Adds an author to the list of authors of the book.
     * @param author The author to be added.
     */
    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    /**
     * Removes an author from the list of authors of the book.
     * @param author The author to be removed.
     */
    public void removeAuthor(Author author) { this.authorList.remove(author); }

    /**
     * Returns a string representation of the book.
     * @return The title of the book.
     */
    public String toString() {
        return this.title;
    }
}