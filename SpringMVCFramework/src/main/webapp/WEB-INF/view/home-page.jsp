<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: JasmeetSingh
  Date: 17-02-2021
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Home Page</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<h1>${x}</h1>
<h1></h1>
<form name="employeeRegForm" action="addEmployeeDetails" method="post">
    <div class="form-group">
        <label for="username">User name</label>
        <input type="text" class="form-control" name="username" id="username">
    </div>
    <div class="form-group">
        <label for="mobile">Mobile</label>
        <input type="number" class="form-control" name="mobile" id="mobile">
    </div>
    <div class="form-group">
        <label for="email">E-Mail</label>
        <input type="email" class="form-control" name="email" id="email">
    </div>
    <div class="form-group">
        <input class="form-check-input" type="radio" name="gender" id="male" value="male">
        <label class="form-check-label" for="male">Male</label>
        <input class="form-check-input" type="radio" name="gender" id="female" value="female">
        <label class="form-check-label" for="female">Female</label>
    </div>

    <input type="submit" class="btn btn-primary"></input>
</form>
</body>
</html>
