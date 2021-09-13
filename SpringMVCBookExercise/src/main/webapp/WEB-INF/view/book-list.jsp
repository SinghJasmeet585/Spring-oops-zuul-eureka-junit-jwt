<%@ page import="com.model.Book" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: JasmeetSingh
  Date: 18-02-2021
  Time: 00:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<div style="padding-bottom: 10%; margin-top: 10%;margin-left: 20%;  width: 60%; border:2px solid cornflowerblue; text-align: center">
    <h1>Kaveri Book Stall</h1>
    <div style=" margin-right: 5%; text-align: right">
        <a href="/contact">Contact Us</a>
    </div>
    <h2>Book Details</h2>
    <%
        ArrayList<Book> list = (ArrayList<Book>) request.getAttribute("list");
        for (Book book : list) {
            //out.println(employee);
        }
    %>
    <table style=" margin-left: 5%;  width: 90%; border: 1px solid black;">
        <tr>
            <th style="width: 30%; border: 1px solid black;"> Book name</th>
            <th style="width: 30%; border: 1px solid black;"> Book Details</th>
            <th style="width: 30%; border: 1px solid black;"> Book Author</th>
        </tr>
        <c:forEach items="${list}" var="list">
            <h3>
                <tr>
                    <th style="width: 30%; border: 1px solid black;">${list.bookName}</th>
                    <th style="width: 30%; border: 1px solid black;">${list.bookDetails}</th>
                    <th style="width: 30%; border: 1px solid black;">${list.bookAuthor}</th>
                </tr>
            </h3>
        </c:forEach>
    </table>
</div>
</body>
</html>
