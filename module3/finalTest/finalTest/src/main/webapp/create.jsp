<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <style>
        body {
            background-image: url('/image/web-background.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            height: auto;
            font-family: 'Arial', sans-serif;
        }

        .content {
            max-width: 100%;
            padding: 10px;
            background-color: rgba(255, 255, 255, 0.8);
        }
    </style>
    <title>Final Test</title>
    <link rel="stylesheet" href="/bootstrap-5.2.3-dist/css/dataTables.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/bootstrap-5.2.3-dist/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <!-- Brand và Toggle Button cho Mobile -->
        <a class="navbar-brand" href="#">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-house"
                 viewBox="0 0 16 16">
                <path d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293zM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5z"/>
            </svg>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <!-- Các liên kết và menu chính -->
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link text-primary fw-bold" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-primary fw-bold" href="/users?action=create">Add</a>
                </li>
            </ul>
        </div>
        <div class="collapse navbar-collapse" id="navbarNavSearch">
            <ul class="navbar-nav ms-auto">
                <li>
                    <form class="d-flex ms-auto" action="/user?countrySearch=#&action=searchByCountry=#">
                        <input class="form-control me-2" type="search" placeholder="Search by name" aria-label="Search"
                               name="nameSearch" value="${key}">
                        <input type="hidden" name="action" value="searchByName">
                        <button class="btn btn-outline-success" type="submit">
                            <%--                             <i class="bi bi-search"></i>--%>
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                 class="bi bi-search" viewBox="0 0 16 16">
                                <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0"/>
                            </svg>
                        </button>
                    </form>
                </li>
                <li>
                    <form class="d-flex ms-auto" action="/user?countrySearch=&action=searchByCountry">
                        <input class="form-control me-2" type="search" placeholder="Search by country"
                               aria-label="Search by country" name="countrySearch" value="${c}">
                        <input type="hidden" name="action" value="searchByCountry">
                        <button class="btn btn-outline-success" type="submit">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                 class="bi bi-search" viewBox="0 0 16 16">
                                <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0"/>
                            </svg>
                        </button>
                    </form>
                </li>
            </ul>
        </div>

    </div>
</nav>
<div class="content w-100 text-center container">
    <div class="container">
        <form class="row g-3 needs-validation" novalidate action="/Products?action=createProduct" method="post">
            <div class="test-id">
                <label for="validationCustom031" class="form-label">Tên sản phẩm</label>
                <input type="text" class="form-control" name="product-id" id="validationCustom031" required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div class="test-id">
                <label for="validationCustom032" class="form-label">Giá</label>
                <input type="number" class="form-control" name="product-price" id="validationCustom032" required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div class="test-id">
                <label for="validationCustom033" class="form-label">Số lượng</label>
                <input type="number" class="form-control" name="product-quantity" id="validationCustom033" required>
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div class="list-test">
                <label for="validationCustom041" class="form-label">Màu sắc</label>
                <select class="form-select" id="validationCustom041" required>
                    <option selected disabled value="">Choose...</option>
                    <option value="1">Xanh</option>
                    <option value="2">Đỏ</option>
                </select>
                <div class="invalid-feedback">
                    Please select a valid state.
                </div>
            </div>
            <div class="test-id">
                <label for="validationCustom033" class="form-label">Mô tả</label>
                <input type="text" class="form-control" name="product-comment" id="validationCustom033">
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div class="list-test">
                <label for="validationCustom042" class="form-label">Danh mục</label>
                <select class="form-select" id="validationCustom042" required>
                    <option selected disabled value="">Choose...</option>
                    <option value="1">Phone</option>
                    <option value="2">Tivi</option>
                </select>
                <div class="invalid-feedback">
                    Please select a valid state.
                </div>
            </div>
            <div class="Modal-option">
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Submit form
                </button>
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                Thêm sản phẩm
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-primary" data-bs-dismiss="modal">Thêm sản phẩm</button>
                            </div>
                        </div>
                    </div>
                </div>
                <%--        <button class="btn btn-primary" type="submit">Submit form</button>--%>
            </div>
        </form>
    </div>
    <footer class="footer bg-info position-relative w-100" style="top: auto">
        <div class="container text-center top-50">
            <p>&copy; 2022 Your Company. All rights reserved.</p>
        </div>
    </footer>

</div>
</body>

<%--Modal--%>
<script>
    var myModal = new bootstrap.Modal(document.getElementById('myModal'), options)
    var myModalEl = document.querySelector('#myModal')
    var modal = bootstrap.Modal.getOrCreateInstance(myModalEl) // Returns a Bootstrap modal instance
</script>
<%--Check--%>
<script>
    (function () {
        'use strict'

        // Fetch all the forms we want to apply custom Bootstrap validation styles to
        var forms = document.querySelectorAll('.needs-validation')

        // Loop over them and prevent submission
        Array.prototype.slice.call(forms)
            .forEach(function (form) {
                form.addEventListener('submit', function (event) {
                    if (!form.checkValidity()) {
                        event.preventDefault()
                        event.stopPropagation()
                    }

                    form.classList.add('was-validated')
                }, false)
            })
    })()
</script>
<script src="/bootstrap-5.2.3-dist/js/jquery-3.7.0.js"></script>
<script type="text/javascript" src="/bootstrap-5.2.3-dist/js/bootstrap.bundle.min.js"></script>
<script src="/bootstrap-5.2.3-dist/js/jquery.dataTables.min.js"></script>
<script>     new DataTable('#example'); </script>
</html>