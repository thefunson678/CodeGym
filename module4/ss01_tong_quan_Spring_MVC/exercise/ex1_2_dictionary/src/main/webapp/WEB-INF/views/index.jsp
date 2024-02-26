<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2/21/2024
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển Việt - Anh</title>
</head>
<body>
<form action="findVnString" method="get">
    <table>
        <tr>
            <td>Tiếng Anh</td>
        </tr>
        <tr>
            <td style="height: 100px"><input  style="height: 100px" type="text" name="enString" value="${enString}"></td>
        </tr>
    </table>
    <button type="submit">Dịch ngay</button>
</form>
<hr>
<p>${result}</p>
</body>
</html>
