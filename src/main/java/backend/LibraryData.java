package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="librarydata", value="/librarydata")
public class LibraryData extends HttpServlet {

    private String msg;
    public void init() throws ServletException { msg = "Hello World"; }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        res.setContentType("text/html");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

    }
}
