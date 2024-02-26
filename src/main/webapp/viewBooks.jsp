<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="backend.Book" %>
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
    <title>View Books</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
    <h3>Books</h3>
    <% ArrayList<Book> bookList = (ArrayList<Book>)request.getAttribute("books"); %>

    <table>
        <tr>
            <th>ISBN</th>
            <th>Title</th>
            <th>Edition</th>
            <th>Copyright</th>
        </tr>
        <%
            for (Book book : bookList) {
                out.println(
                        "<tr>" +
                            "<td>" + book.getIsbn() + "</td>" +
                            "<td>" + book.getTitle() + "</td>" +
                            "<td>" + book.getEditionNumber() + "</td>" +
                            "<td>" + book.getCopyright() + "</td>" +
                        "</tr>"
                );
            }
        %>
    </table>
</body>
<footer>
    <br><a href="index.jsp">Return</a>
</footer>
</html>
