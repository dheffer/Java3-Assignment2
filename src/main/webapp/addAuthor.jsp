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
    <title>Add Author</title>
</head>
<body>
    <form action="lib-data" method="POST">
        First Name: <input type="text" name="firstName" required><br/>
        Last Name:  <input type="text" name="lastName" required><br/>
        <input type="hidden" id="view" name="view" value="add_author">
        <input type="submit" value="Add Author">
    </form>
</body>
<footer>
    <a href="index.jsp">Return</a>
</footer>
</html>
