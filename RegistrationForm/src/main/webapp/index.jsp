<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Welcome to Java Servlets
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<div>

    <form name="regForm" action="hello-servlet" method="get">

        <label for="username">User Name</label>
        <input type="text" name="username" id="username">
        <br>
        <label for="password">Password</label>
        <input type="password" name="password" id="password">
        <br>
        <label for="mobileNumber">Mobile Number</label>
        <input type="text" name="mobileNumber" id="mobileNumber">
        <br>
        <label for="salary">Salary</label>
        <input type="number" name="salary" id="salary">
        <br>
        <input type="submit" value="Submit">

    </form>

</div>

</body>
</html>