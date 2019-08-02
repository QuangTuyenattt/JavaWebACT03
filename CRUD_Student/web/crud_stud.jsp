<%-- 
    Document   : crud_stud
    Created on : Jul 28, 2019, 3:30:28 PM
    Author     : Dell M4700
--%>

<%@page import="java.util.List"%>
<%@page import="com.java.web.Student.Student"%>
<%@page import="com.java.web.Student.Student_Model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">ho ten</th>
                    <th scope="col">khoa</th>
                    <th scope="col">lop</th>
                    <th scope="col"> chuc nang </th>
                </tr>
            </thead>
            <tbody>
                <%
                    Student_Model model = new Student_Model();
                    List<Student> students = model.getStudents();

                    for (Student stud : students) {%>
                <tr>
                    <td> <%= stud.getId()%> </td>
                    <td> <%= stud.getHoten()%> </td>
                    <td> <%= stud.getKhoa()%> </td>
                    <td> <%= stud.getLop()%> </td>
                    <td>
                        <a href="sua.html" ><button type="button" class="btn btn-primary">Sua </button></a> 
                        <a><button class="btn btn-danger">Xoa</button></a>
                    </td>
                </tr>        
                <% }%>
            </tbody>
        </table>
            <a href="index.html"><button class="btn-success">Them moi </button></a>
    </body>
</html>
