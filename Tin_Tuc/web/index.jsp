<%-- 
    Document   : index
    Created on : Aug 11, 2019, 3:43:18 PM
    Author     : Dell M4700
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="home.css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg ">
            <a class="navbar-brand" href="/Tin_Tuc/NewsServlet">Tin nhanh</a>

        </nav>
        <div class="container">
            <form method="POST" action="search">
                <div class="form-group">
                    <label for="exampleInputEmail1">Search</label>
                    <input type="text" class="form-control" id="txtSearch" name="search"  placeholder="Search .....">

                </div>


                <button type="submit" class="btn btn-primary">Search</button>
            </form>
            
         

            <c:forEach var="item" items="${news}">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">${item.title}</h5>
                        <p class="card-text">${item.summary}</p>
                        <p>Đăng bởi: ${item.author_id}</p>
                    </div>
                </div>
            </c:forEach>

            <nav aria-label="Page navigation example">
                <ul class="pagination">
                    <c:if test="${curr==1}">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${curr>1}">
                        <li class="page-item">
                            <a class="page-link" href="?page=${curr-1}" aria-label="Previous">
                               <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach var="i" begin="1" end="${total}" step="1">
                        <li class="page-item"><a class="page-link" href="?page=${i}">${i}</a></li>

                    </c:forEach>
                    <c:if test="${curr==total}">
                       <li class="page-item">
                        <a class="page-link" href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li> 
                    </c:if>
                    <c:if test="${curr<total}">
                       <li class="page-item">
                        <a class="page-link" href="?page=${curr+1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li> 
                    </c:if>
                    
                </ul>
            </nav>
        </div>

    </body>
</html>
