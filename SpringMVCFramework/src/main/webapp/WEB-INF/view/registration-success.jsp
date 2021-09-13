<%--
  Created by IntelliJ IDEA.
  User: JasmeetSingh
  Date: 17-02-2021
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
<h1> ${employee.name} -> your information is added</h1>
<h2>Your Details -></h2>
<h3>Mobile Number -> ${employee.mobile }</h3>
<h3>E-Mail -> ${employee.email }</h3>
<h3>Gender -> ${employee.gender }</h3>
<hr>
<a href="admin">Go back to add details</a>
<a href="getAllEmployeeDetails">Get all Employee Details</a>
</body>
</html>
