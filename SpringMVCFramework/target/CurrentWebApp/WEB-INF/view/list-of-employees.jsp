<%@ page import="java.util.ArrayList" %>
<%@ page import="com.model.Employee" %><%--
  Created by IntelliJ IDEA.
  User: JasmeetSingh
  Date: 17-02-2021
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<h1>Employee Details</h1>

<%
    ArrayList<Employee> list = (ArrayList<Employee>)request.getAttribute("list");
    for (Employee employee:
         list) {
        System.out.println(employee);
    }
%>

<c:forEach items="${list}" var="emplist">
    <h3>${emplist.name}-${emplist.mobile}-${emplist.gender}-${emplist.email}</h3>
</c:forEach>
<hr>
<a href="admin" >Home</a>

</body>
</html>
