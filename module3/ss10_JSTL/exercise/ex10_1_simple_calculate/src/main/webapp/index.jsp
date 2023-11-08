<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculate</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1><%= "Simple Calculate" %></h1>
<br/>
<form class="col-xl-2" action="/CalculateControler" method="post">
    <div class="form-group">
        <label for="formGroupExampleInput">First operand</label>
        <input type="text" class="form-control" name="firstOperand" id="formGroupExampleInput" placeholder="Example input">
    </div>
    <div class="form-group">
        <label for="exampleFormControlSelect1">Operator</label>
        <select class="form-control" id="exampleFormControlSelect1" name="operator">
            <option>Addition</option>
            <option>Subtraction</option>
            <option>Multiplication</option>
            <option>Division</option>
        </select>
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput">Second operand</label>
        <input type="text" class="form-control" name="secondOperand" id="formGroupExampleInput" placeholder="Example input">
    </div>

    <div class="form-group">
        <label></label>
        <button class="form-control" type="submit">Sumbit</button>
    </div>
</form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</html>