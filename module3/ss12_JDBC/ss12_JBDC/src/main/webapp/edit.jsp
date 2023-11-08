<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/8/2023
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>UserDao Update</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=list">List Users</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <h3>Your Update information</h3>
        <div>
            <table>
                <tr>
                    <td>ID:</td>
                    <td>
                        <input type="text" disabled="disabled" name="id" id="id" value= "${user.id}">
                    </td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td>
                        <input name="name" id="name" value= "${user.name}">
                    </td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td>
                        <input name="email" id="email" value= "${user.email}">
                    </td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td>
                        <input name="country" id="country" value="${user.country}">
                    </td>
                </tr>
            </table>
        </div>
        <div><button type="submit"><div>Update Now</div></button></div>
    </form>
</div>
<c:if test='${requestScope["message"] != null}'>
    <center>
        <div class="message" style="color: green">${requestScope["message"]}</div>
    </center>
</c:if>
<c:if test='${requestScope["message2"] != null}'>
    <center>
        <div class="message2" style="color: red"><b>${requestScope["message2"]}</b> </div>
    </center>
</c:if>
</body>
</html>
