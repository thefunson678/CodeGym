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
    <title>Mail Setting</title>
</head>
<body>
<div><h1>Settings</h1></div>
<form:form action="/mail/setup" modelAttribute="mailSetup" method="post">
    <div style="display: flex">
        <div style="width: 100px"><label>Languages</label></div>
        <div>
            <form:select path="languages" itemValue="${mailSetup.languages}" cssStyle="width: 100px; height: 20px">
                <form:options items="${languagesList}"></form:options>
            </form:select>
        </div>
    </div>
    <br>
    <div style="display: flex;">
        <div style="width: 100px"><label>Page Size:</label></div>
        <div>
            <label>Show</label>
            <form:select path="pageSize" itemValue="${mailSetup.pageSize}"
                      cssStyle="width: 100px; height: 20px; text-align: center">
                <form:options items="${pageSizeList}"></form:options>
            </form:select>
            <label> emails per page</label>
        </div>
    </div>
    <br>
    <div style="display: flex">
        <div style="width: 100px"><label>Spams filters</label></div>
        <div>
            <form:checkbox name="spamsFilter" path="spamsFilter" value="${mailSetup.spamsFilter}"></form:checkbox>
            <label>Enable spams filter</label>
        </div>
    </div>
    <br>
    <div style="display: flex">
        <div style="width: 100px"><label>Signature</label></div>
        <div>
            <form:textarea name="signature" path="signature"></form:textarea>
        </div>
    </div>
    <br>
    <button type="submit">Update</button>
    <button type="button"><a href="/mail/account" style="text-decoration: none">Cancel</a></button>
</form:form>
</body>
</html>
