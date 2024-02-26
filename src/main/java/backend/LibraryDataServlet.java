package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="libData", value="/lib-data")
public class LibraryDataServlet extends HttpServlet {

    private String msg;
    //public void init() throws ServletException { msg = "Hello World"; }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");

        res.getWriter().println("<h1>Hello!</h1>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String view = req.getParameter("view");

        if (view.equals("add_author")) {
            String fName = req.getParameter("firstName");
            String lName = req.getParameter("lastName");
            System.out.println(fName + " " + lName);
        } else if (view.equals("add_book")) {

        } else {

        }
    }

    public void destroy() {

    }
}
