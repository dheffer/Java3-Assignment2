<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Java Assignment 2</title>
</head>
<body>
    <table border="1px solid black" cellpadding="4px">
        <tr>
            <th><a href="addBook.jsp">Add Book</a></th>
            <th><a href="addAuthor.jsp">Add Author</a></th>
        </tr>
        <tr>
            <td>
                <form action="lib-data" method="GET">
                    <input type="hidden" id="view_books" name="view_type" value="books" />
                    <input type="submit" name="view" value="View Books"/>
                </form>
            </td>
            <td>
                <form action="lib-data" method="GET">
                    <input type="hidden" id="view_authors" name="view_type" value="authors" />
                    <input type="submit" name="view" value="View Authors"/>
                </form>
            </td>
        </tr>
    </table>
<br/>
</body>
</html>