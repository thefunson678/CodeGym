<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2/21/2024
  Time: 8:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Money Exchange</title>
</head>
<style>
  form{
    font-family: "Times New Roman", Arial, sans-serif;
    font-size: 15px;
  }

</style>
<body>
<div>
  <form action="exchange">
    <h1>Ứng dụng chuyển đổi USD sang VNĐ</h1>
    <br>
    <br>
    <label>Số tiền USD </label><input type="number" name="usd" value="${usd}">
    <br>
    <br>
    <label>Tỉ giá </label><input type="number" name="rate" value="25100">
    <br>
    <br>
    <button type="submit">Chuyển đổi</button>
  </form>
  <hr>
  <p>${usdToVnd}</p>
</div>
</body>
</html>
