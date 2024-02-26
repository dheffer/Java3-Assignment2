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
    <h3>Authors</h3>
    <% ArrayList<Author> authorList = (ArrayList<Author>)request.getAttribute("authors"); %>
    <table>
        <tr>
            <th>Author ID</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <%
            for (Author author : authorList) {
                out.println("<tr>" +
                                "<td>" + author.getAuthorID() + "</td>" +
                                "<td>" + author.getFirstName() + "</td>" +
                                "<td>" + author.getLastName() + "</td>" +
                            "</tr>");
            }
        %>
    </table>
</body>
<footer>
    <br><a href="index.jsp">Return</a>
</footer>
</html>
