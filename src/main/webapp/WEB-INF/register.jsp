<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 7/12/20
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/register" method="post">
    <div><label> Username : <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <div><label> email: <input type="email" name="email"/> </label></div>
    <div><input type="submit" value="Submit"/></div>
</form>
</body>
</html>
