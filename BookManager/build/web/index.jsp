<%-- 
    Document   : index
    Created on : Aug 18, 2019, 3:07:45 PM
    Author     : Dell M4700
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Home Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>

                </ul>

            </div>
        </nav>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">Tên sách</th>
                    <th scope="col">Tác giả</th>
                    <th scope="col">Giá</th>
                    <th scope="col"> Số Lượng </th>
                    <th scope="col"> Chức năng</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${book}">
                <tr>
                    <td> ${item.id} </td>
                    <td> ${item.title} </td>
                    <td> ${item.author} </td>
                    <td> ${item.price}</td>
                    <td> ${item.quantity} </td>
                    <td>
                            <a href="GetBookServlet?id=${item.id}" class="btn btn-primary">Sửa</a>
                            <a href="DeleteBookServlet?id=${item.id}" onclick="remove()" class="btn btn-danger">Xóa</a>
                        </td>
                </tr>
                </c:forEach>       
                
            </tbody>

        </table>
        <a href="add.jsp"><button class="btn-success">Them moi </button></a>

    </body>
</html>
