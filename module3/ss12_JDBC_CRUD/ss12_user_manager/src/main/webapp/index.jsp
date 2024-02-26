<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Manager</title>
    <link rel="stylesheet" href="/bootstrap-5.2.3-dist/css/bootstrap.min.css"/>
</head>
<header class="p-3 bg-secondary text-white">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
        </div>
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
            </a>
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="/index?action=home" class="nav-link px-2 text-white">Home</a></li>
            </ul>
            <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3 d-flex" action="/home?action=search">
                <div>
                    <input type="search" class="form-control form-control-dark" placeholder="Search by..." aria-label="Search" name="values">
                </div>
                <div class="text-end">
                    <button type="submit" class="btn btn-outline-light me-2"> Search</button>
                </div>
            </form>
        </div>
    </div>
</header>
<body>
<div class="position-relative">
    <div class="position-absolute top-50 start-50"><h1>TOTAL USER</h1></div>
</div>



</body>
<script src="/bootstrap-5.2.3-dist/js/bootstrap.bundle.min.js"></script>
</html>