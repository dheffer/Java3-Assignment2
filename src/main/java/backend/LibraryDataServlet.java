package backend;

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
        System.out.println(view);
        DatabaseManager dbm = new DatabaseManager();
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // VIEW BOOKS
        if (view.equals("books")) {
            System.out.println("test1");
        }
        // VIEW AUTHORS
        else if (view.equals("authors")) {
            ArrayList<Author> authors = dbm.readAllAuthors();
            out.println("<html><body><h2>Authors</h2>");
            for (Author author : authors) {
                        out.println("<p style='font-size:14px'>First Name: " + author.getFirstName() +
                        " --- Last Name: " + author.getLastName() + "</p>");
            }
            out.println("</body>" +
                    "<footer>" +
                    "    <a href=\"index.jsp\">Return</a>\n" +
                    "</footer>" +
                    "</html>");
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
            System.out.println(new Author(
                    req.getParameter("firstName"),
                    req.getParameter("lastName"))
            );
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

        } else {

        }
    }

    public void destroy() {

    }
}
