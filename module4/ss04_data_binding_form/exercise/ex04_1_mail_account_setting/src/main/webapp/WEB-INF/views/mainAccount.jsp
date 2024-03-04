<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2/26/2024
  Time: 6:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Account Setting</title>
</head>
<body>
<div><h1>Settings</h1></div>
<form:form action="/mail" modelAttribute="mailSetup" method="get">
    <div style="display: flex">
        <div style="width: 100px"><label>Languages</label></div>
        <div>
            <form:input path="languages" disabled="true"></form:input>
        </div>
    </div>
    <br>
    <div style="display: flex;">
        <div style="width: 100px"><label>Page Size:</label></div>
        <div>
            <label>Show</label>
            <form:input path="pageSize" disabled="true" cssStyle="width: 100px; height: 20px; text-align: center"></form:input>
            <label> emails per page</label>
        </div>
    </div>
    <br>
    <div style="display: flex">
        <div style="width: 100px"><label>Spams filters</label></div>
        <div>
            <form:checkbox name="spamsFilter" path="spamsFilter" value="${mailSetup.spamsFilter}" disabled="true"></form:checkbox>
            <label>Enable spams filter</label>
        </div>
    </div>
    <br>
    <div style="display: flex">
        <div style="width: 100px"><label>Signature</label></div>
        <div>
            <form:textarea name="signature" path="signature" disabled="true"></form:textarea>
        </div>
    </div>
    <br>
    <button type="submit">Edit</button>
</form:form>
</body>
</html>
