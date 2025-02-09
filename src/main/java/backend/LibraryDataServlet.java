package backend;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name="libData", value="/lib-data")
public class LibraryDataServlet extends HttpServlet {

    private String msg;
    public void init()  { msg = "Lib-Data Servlet"; }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String view = req.getParameter("view_type");
        DatabaseManager dbm = new DatabaseManager();
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        RequestDispatcher dispatcher;

        // VIEW BOOKS
        if (view.equals("books")) {
            ArrayList<Book> books = dbm.getAllBooks();
            dispatcher = req.getRequestDispatcher("viewBooks.jsp");
            req.setAttribute("books", books);
            dispatcher.forward(req, res);
        }
        // VIEW AUTHORS
        else if (view.equals("authors")) {
            ArrayList<Author> authors = dbm.readAllAuthors();
            dispatcher = req.getRequestDispatcher("viewAuthors.jsp");
            req.setAttribute("authors", authors);
            dispatcher.forward(req, res);
        } else {
            res.sendRedirect("index.jsp");
        }

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String view = req.getParameter("view");
        DatabaseManager dbm = new DatabaseManager();
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if (view.equals("add_author")) {;
            dbm.createAuthor(new Author(
                    req.getParameter("firstName"),
                    req.getParameter("lastName"))
            );
            out.println("<html>" +
                        "<body>" +
                            "<h2>" + req.getParameter("view") + "</h2>" +
                            "<h3>First Name: " + req.getParameter("firstName") + "</h3>" +
                            "<h3>Last Name: " + req.getParameter("lastName") + "</h3>" +
                        "</body>" +
                        "<footer>" +
                        "    <a href=\"index.jsp\">Return</a>\n" +
                        "</footer>" +
                        "</html>");
        } else if (view.equals("add_book")) {
            Book book = new Book(
                    req.getParameter("isbn"),
                    req.getParameter("title"),
                    Integer.parseInt(req.getParameter("edition")),
                    req.getParameter("copyright"));
            Author author = dbm.readAuthor(Integer.parseInt(req.getParameter("author")));

            dbm.createBook(book);
            dbm.addToAuthorISBNs(book, author.getAuthorID());
            out.println(
                    "<html>" +
                    "<body>" +
                        "<h2>" + req.getParameter("view") + "</h2>" +
                        "<h3>ISBN: " + req.getParameter("isbn") + "</h3>" +
                        "<h3>Title: " + req.getParameter("title") + "</h3>" +
                        "<h3>Edition: " + req.getParameter("edition") + "</h3>" +
                        "<h3>CopyRight: " + req.getParameter("copyright") + "</h3>" +
                        "<h3>Author ID: " + req.getParameter("author") +
                    "</body>" +
                    "<footer>" +
                    "    <a href=\"index.jsp\">Return</a>\n" +
                    "</footer>" +
                    "</html>");
        } else {
            out.println("<html>" +
                        "<body>" +
                            "<h2>Invalid View</h2>" +
                        "</body>" +
                        "<footer>" +
                        "    <a href=\"index.jsp\">Return</a>\n" +
                        "</footer>" +
                        "</html>");
        }
    }

    public void destroy() {

    }
}
