package backend;

import java.sql.*;

// COPIED FROM ASSIGNMENT 1
public class DatabaseManager {
    // Database connection details
    private static final String URL = "jdbc:mariadb://localhost:3307/books";
    private static final String USER = "root";
    private static final String PASS = "substance-sloped-spindle";


    /**
     * Establishes a connection to the database.
     * @return A Connection object representing the database connection.
     */
    public Connection connect() {
        Connection conn = null;
        try {
            // Attempt to establish a connection to the database
            conn = DriverManager.getConnection(URL, USER, PASS);
            // Set auto-commit to false
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
        return conn;
    }

    /**
     * Retrieves all books from the database.
     * @return An ArrayList of Book objects representing all books in the database.
     */
    // TODO: fix this
    /*
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> bookList = new ArrayList<>();
        try (Connection conn = connect()) {
            // SQL query to select all books
            String sql = "SELECT * FROM TITLES";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            // Loop through the result set and add each book to the book list

            while (rs.next()) {
                bookList.add(new Book(rs.getString("isbn"), rs.getString("title"),
                        rs.getInt("editionNumber"), rs.getString("copyRight")));
            }


            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
        return bookList;
    }*/

    /**
     * Reads a specific book from the database.
     * @param book The Book object to be read from the database.
     * @throws SQLException if the connection fails.
     */
    /*
    public void readBook(Book book) throws SQLException {
        try (Connection conn = connect()) {
            // SQL query to select a specific book
            String sql = "SELECT * FROM TITLES WHERE isbn = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getIsbn());
            ResultSet rs = ps.executeQuery();
            // Loop through the result set and print each book's details
            while (rs.next()) {
                System.out.println(rs.getString("isbn") + "\t" + rs.getString("title") +
                        "\t" + rs.getInt("editionNumber") + "\t" + rs.getString("copyright"));
            }
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
    }*/

    /**
     * Creates a new book in the database.
     * @param book The Book object to be created in the database.
     * @throws SQLException if the connection fails.
     */
    /*
    public void createBook(Book book) {
        try (Connection conn = connect()) {
            // SQL query to insert a new book
            String sql = "INSERT INTO titles(isbn,title,editionNumber,copyRight) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getIsbn());
            ps.setString(2, book.getTitle());
            ps.setInt(3, book.getEditionNumber());
            ps.setString(4, book.getCopyright());
            // Execute the update
            ps.executeUpdate();
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
    }*/

    /**
     * Updates a specific book in the database.
     * @param bookToModify The Book object to be updated in the database.
     * @param book The new Book object with updated details.
     */
    /*
    public void updateBook(Book bookToModify, Book book) {
        try (Connection conn = connect()) {
            // SQL query to update a specific book
            String sql = "UPDATE titles SET isbn=?,title=?,editionNumber=?,copyRight=? WHERE isbn=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getIsbn());
            ps.setString(2, book.getTitle());
            ps.setInt(3, book.getEditionNumber());
            ps.setString(4, book.getCopyright());
            ps.setString(5, bookToModify.getIsbn());
            // Execute the update
            ps.executeUpdate();
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
    }*/

    /**
     * Retrieves all authors from the database.
     * @return An ArrayList of Author objects representing all authors in the database.
     */
    /*
    public ArrayList<Author> readAllAuthors() {
        ArrayList<Author> authorList = new ArrayList<>();
        try (Connection conn = connect()) {
            // SQL query to select all authors
            String sql = "SELECT * FROM AUTHORS";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            // Loop through the result set and add each author to the author list
            while (rs.next()) {
                Author author = new Author(rs.getString("firstName"), rs.getString("lastName"));
                author.setAuthorID(rs.getInt("authorID"));
                authorList.add(author);
            }
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
        return authorList;
    }
    */

    /**
     * Reads a specific author from the database.
     * @param id The id of the author to be read from the database.
     * @return An Author object representing the author read from the database.
     */
    /*
    public Author readAuthor(int id) {
        Author author = null;
        try (Connection conn = connect()) {
            // SQL query to select a specific author
            String sql = "SELECT * FROM AUTHORS WHERE authorID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            // Loop through the result set and create an author object
            while (rs.next()) {
                author = new Author(rs.getString("firstName"),
                        rs.getString("lastName"));
                author.setAuthorID(rs.getInt("authorID"));
            }
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
        return author;
    }
    */
    /**
     * Creates a new author in the database.
     * @param author The Author object to be created in the database.
     */

    public void createAuthor(Author author) {
        try (Connection conn = connect()) {
            // SQL query to insert a new author
            String sql = "INSERT INTO authors(firstName,lastName) VALUES (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, author.getFirstName());
            ps.setString(2, author.getLastName());
            // Execute the update
            ps.executeUpdate();
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
    }

    /**
     * Updates a specific author in the database.
     * @param authorToModify The Author object to be updated in the database.
     * @param author The new Author object with updated details.
     */
    /*
    public void updateAuthor(Author authorToModify, Author author) {
        try (Connection conn = connect()) {
            // SQL query to update a specific author
            String sql = "UPDATE authors SET firstName=?,lastName=? WHERE authorID=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, author.getFirstName());
            ps.setString(2, author.getLastName());
            ps.setInt(3, authorToModify.getAuthorID());
            // Execute the update
            ps.executeUpdate();
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
    }

     */

    /**
     * Retrieves the ISBNs of all books written by each author.
     * @param bookList The list of all books.
     * @param authorList The list of all authors.
     */
    /*
    public void getAuthorISBNs(ArrayList<Book> bookList, ArrayList<Author> authorList) {
        try (Connection conn = connect()) {
            // SQL query to select all entries from the authorISBN table
            String sql = "SELECT * FROM authorISBN";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            // Loop through the result set and add each book to the corresponding author's book list
            while (rs.next()) {
                for (Book book : bookList) {
                    for (Author author : authorList) {
                        if (Objects.equals(book.getIsbn(), rs.getString("isbn")) &&
                                rs.getInt("authorID") == author.getAuthorID()) {
                            book.addAuthor(author);
                            author.addBook(book);
                        }
                    }
                }
            }
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
    }
    */

    /**
     * Adds a new entry to the authorISBN table in the database.
     * @param book The Book object to be added to the authorISBN table.
     * @param authorID The id of the author to be added to the authorISBN table.
     */
    /*
    public void addToAuthorISBNs(Book book, int authorID) {
        try (Connection conn = connect()) {
            // SQL query to insert a new entry into the authorISBN table
            String sql = "INSERT INTO authorISBN(authorID,isbn) VALUES (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, authorID);
            ps.setString(2, book.getIsbn());
            // Execute the update
            ps.executeUpdate();
            // Commit the transaction
            conn.commit();
        } catch (SQLException e) {
            // Print the error message if the connection fails
            System.out.println("Failure: " + e.getMessage());
        }
    }

    */
}