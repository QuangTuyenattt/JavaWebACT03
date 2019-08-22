<%-- 
    Document   : editBook.
    Created on : Aug 22, 2019, 3:42:10 PM
    Author     : Dell M4700
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            #main {
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                Books Manager
            </a>
        </nav>    
        <div class="container" id="main">
            <form action="EditBookServlet" method="POST">
                <div class="form-group row">
                    <label for="title" class="col-sm-2 col-form-label">Id</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="id" name="id" readonly="true" value="${book.id}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="title" class="col-sm-2 col-form-label">Tên sách</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="title" name="title" placeholder="Đại số tập 1" value="${book.title}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="author" class="col-sm-2 col-form-label">Tác giả</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="author" name="author" placeholder="Nguyễn Văn An" value="${book.author}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="price" class="col-sm-2 col-form-label">Giá</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="price" name="price" placeholder="10.00" value="${book.price}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="quantity" class="col-sm-2 col-form-label">Số lượng</label>
                    <div class="col-sm-10">
                        <input type="number" class="form-control" id="quantity" name="quantity" placeholder="100" value="${book.quantity}">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">GỬI</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
