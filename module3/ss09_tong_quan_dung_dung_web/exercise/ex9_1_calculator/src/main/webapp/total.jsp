<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 1/8/2024
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="/bootstrap-5.2.3-dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container-fluid">
    <div class="calculator-price d-flex">
        <form method="post" name="calculator">
            <div><label>Product Description</label></div>
                <div><input class="prodcut bg-secondary text-white  text-center" type="text" name="product" id="product" value="${product}" disabled></div>
            <div><label>List Price</label></div>
            <div><input class="price bg-secondary text-white  text-center" type="text" name="price" id="price" value="${price}"></div>
            <div><label>Discount Percent (%)</label></div>
            <div><input class="discount bg-secondary text-white  text-center" type="text" name="discount" id="discount" value="${discount}"></div>
            <br>
            <div><label>TOTAL:</label></div>
            <div><input class="total bg-secondary text-white  text-center" type="text" name="total" id="total" value="${total}"></div>
            <br>
            <div>
                <button><a href="/calculator" class="index-link">Go back</a></button>
            </div>
        </form>
    </div>
</div>
</body>
<script src="/bootstrap-5.2.3-dist/js/bootstrap.bundle.min.js"></script>
</html>
