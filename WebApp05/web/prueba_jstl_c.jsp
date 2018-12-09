<%-- 
    Document   : prueba_jstl_c
    Created on : 10/09/2018, 12:22:24 PM
    Author     : Rodrigo
--%>

<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <sql:setDataSource var="xcon" driver="com.mysql.cj.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/test1?useSSL=false&serverTimezone=UTC"
                           user="root"
                           password="tecsup"/>
        <sql:query dataSource="${xcon}"
                   sql="select * from t_usuarios"
                   var="result"/>
        <table border="1">
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Clave</th>
                <th>Estado</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.codigo}"/></td>
                    <td><c:out value="${row.nombre}"/></td>
                    <td><c:out value="${row.clave}"/></td>
                    <td><c:out value="${row.estado}"/></td>
                </tr>
            </c:forEach>
                       
        </table>
    </body>
</html>
