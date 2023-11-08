<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/3/2023
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/CustomerServlet?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${listCustomerModel}' var="CustomerModel">
        <tr>
            <td><a href="/CustomerServlet?action=view&id=${CustomerModel.getId()}">${CustomerModel.getName()}</a></td>
            <td>${CustomerModel.getEmail()}</td>
            <td>${CustomerModel.getAddress()}</td>
            <td><a href="/CustomerServlet?action=edit&id=${CustomerModel.getId()}">edit</a></td>
            <td><a href="/CustomerServlet?action=delete&id=${CustomerModel.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
