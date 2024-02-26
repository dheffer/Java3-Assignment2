<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="backend.Author" %>
<%--
  Created by IntelliJ IDEA.
  User: 11yom
  Date: 2024-02-24
  Time: 9:23 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View Authors</title>
</head>
<body>
    <h3>Authors</h3>
    <% ArrayList<Author> authorList = (ArrayList<Author>)request.getAttribute("authors"); %>
    <%
    for (Author author : authorList) {
        out.println("<p style='font-size:14px'>First Name: " + author.getFirstName() +
            " --- Last Name: " + author.getLastName() + "</p>");
    }
    %>
</body>
<footer>
    <a href="index.jsp">Return</a>
</footer>
</html>
