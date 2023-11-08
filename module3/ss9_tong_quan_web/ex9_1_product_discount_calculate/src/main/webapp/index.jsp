<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Product Discount Calculate</title>
</head>
<body>
<h1><%= "Product Discount Calculate" %>
</h1>
<br/>
<form action="/DiscountCalculate" method="post">
    <label>Product Description </label><input name="productDesc">
    <label>List Price </label><input name="productPrice">
    <label>Discount Percent </label><input name="productDisc">
    <button type="submit">Product Discount Calculate</button>
</form>
</body>
</html>