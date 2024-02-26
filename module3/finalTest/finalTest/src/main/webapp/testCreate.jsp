<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 1/25/2024
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Test Create</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap-5.2.3-dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form class="row g-3 needs-validation" novalidate action="/testHome?action=create" method="post">
        <div class="date-test">
            <label for="validationCustom01fw" class="form-label">Date create</label>
            <input type="date" class="form-control" name="date_test" id="validationCustom01fw" required>
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="date-time-test">
            <label for="datetimeInput" class="form-label">Date Time</label>
<%--            <input type="datetime-local" class="form-control" name="date-time-test" id="validationCustom01f" required>--%>
            <input type="datetime-local" id="datetimeInput" name="date-time-test" step="1">
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="test-id">
            <label for="validationCustom031" class="form-label">Test id</label>
            <input type="text" class="form-control" name="test-id" id="validationCustom031" required>
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="list-test">
            <label for="validationCustom041" class="form-label">List test</label>
            <select class="form-select" id="validationCustom041" required>
                <option selected disabled value="">Choose...</option>
                <option value="Text 1">Text 1</option>
                <option value="Text 2">Text 2</option>
            </select>
            <div class="invalid-feedback">
                Please select a valid state.
            </div>
        </div>
        <div class="text_test">
            <label for="validationCustomUsername" class="form-label">Text Test</label>
            <div class="input-group has-validation">
                <span class="input-group-text" id="inputGroupPrepend"></span>
                <input type="text" class="form-control" name="text_test" id="validationCustomUsername" aria-describedby="inputGroupPrepend"
                       required>
                <div class="invalid-feedback">
                    Please choose a username.
                </div>
            </div>
        </div>
        <div class="Option-chose">
            <div>Choose once</div>
            <div class="form-check">
                <input class="form-check-input" type="radio" value="Option 1" name="option-1" id="flexRadioDefault11" required>
                <label class="form-check-label" for="flexRadioDefault11">
                    Option 1
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" value="Option 2" name="option-1" id="flexRadioDefault21" checked required>
                <label class="form-check-label" for="flexRadioDefault21">
                    Option 2
                </label>
            </div>
        </div>
        <div class="check-again">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" name="check-again" id="check-again" required>
                <label class="form-check-label" for="check-again">
                    Agree to terms and conditions
                </label>
                <div class="invalid-feedback">
                    You must agree before submitting.
                </div>
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
                            ...
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary" data-bs-dismiss="modal">Submit form</button>
                        </div>
                    </div>
                </div>
            </div>
            <%--        <button class="btn btn-primary" type="submit">Submit form</button>--%>
        </div>
    </form>
</div>
</body>
Modal
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
<script type="text/javascript" src="/bootstrap-5.2.3-dist/js/bootstrap.bundle.min.js"></script>
</html>
