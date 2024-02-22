package org.example.assignment2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="librarydata", value="/librarydata")
public class LibraryData extends HttpServlet {

    private String msg;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) {

    }

}
