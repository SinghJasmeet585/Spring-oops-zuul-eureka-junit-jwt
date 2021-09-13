<%--
  Created by IntelliJ IDEA.
  User: JasmeetSingh
  Date: 17-02-2021
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form name="login" action="admin" method="post">
    <div class="form-group">
        <label for="username">User name</label>
        <input type="text" class="form-control" name="username" id="username">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" class="form-control" name="password" id="password">
    </div>

    <input type="submit" class="btn btn-primary"></input>
</form>
</body>
</html>
