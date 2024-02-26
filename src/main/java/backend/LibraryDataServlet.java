package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name="libData", value="/lib-data")
public class LibraryDataServlet extends HttpServlet {

    private String msg;
    public void init()  { msg = "Lib-Data Servlet"; }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");

        //Setup the foo for later Session example
        HttpSession session = req.getSession();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String view = req.getParameter("view");

        DatabaseManager dbm = new DatabaseManager();

        if (view.equals("add_author")) {;
            System.out.println(new Author(
                    req.getParameter("firstName"),
                    req.getParameter("lastName"))
            );
            dbm.createAuthor(new Author(
                    req.getParameter("firstName"),
                    req.getParameter("lastName"))
            );

            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<html><body>");
            out.println("<h2>" + req.getParameter("view") + "</h2>");
            out.println("<h3>First Name: " + req.getParameter("firstName") + "</h3>");
            out.println("<h3>Last Name: " + req.getParameter("lastName") + "</h3>");
            out.println("</body>" +
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
