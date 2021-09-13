<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: JasmeetSingh
  Date: 16-02-2021
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>success page</title>
</head>
<body>
<h1>Welcome ${x} ${y}</h1>
<h1>
<%
    String name=(String)request.getAttribute("x");
    String username=(String) request.getAttribute("y");
    PrintWriter out1= response.getWriter();
    out1.println(name);
    out1.println(username);
%>
</h1>
</body>
</html>
