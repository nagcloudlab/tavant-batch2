<%--
  Created by IntelliJ IDEA.
  User: nag
  Date: 9/14/21
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Txr-Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</head>
<body class="container">

<hr/>
    Txr-service
<hr/>

<div class="row">
    <div class="col-4"></div>
    <div class=" col-offset-4 col-4">
        <form action="txr" method="POST">
            <div class="form-group">
                <label>Amount</label>
                <input type="number" name="amount" class="form-control">
            </div>
            <div class="form-group">
                <label>From Account</label>
                <input type="number" name="fromAccNum" class="form-control">
            </div>
            <div class="form-group">
                <label>To Account</label>
                <input type="number" name="toAccNum" class="form-control">
            </div>
            <br/>
            <button class="btn btn-primary">Txr</button>
        </form>
    </div>
</div>


</body>
</html>
