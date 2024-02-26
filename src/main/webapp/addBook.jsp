<%--
  Created by IntelliJ IDEA.
  User: 11yom
  Date: 2024-02-24
  Time: 9:22 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
<form action="lib-data" method="POST">
    ISBN: <input type="text" name="isbn" required><br/>
    Title:  <input type="text" name="title" required><br/>
    Edition: <input type="text" name="edition" required><br/>
    Copyright:  <input type="text" name="copyright" required><br/>
    <input type="hidden" id="view" name="view" value="add_book">
    <input type="submit" value="Add Book">
</form>
</body>
<footer>
    <a href="index.jsp">Return</a>
</footer>
</html>
