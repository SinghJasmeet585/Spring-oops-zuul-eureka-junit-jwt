<%--
  Created by IntelliJ IDEA.
  User: JasmeetSingh
  Date: 17-02-2021
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<h1>Update Employee Details</h1>
<form name="employeeRegForm" action="updateSuccess" method="post">
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
