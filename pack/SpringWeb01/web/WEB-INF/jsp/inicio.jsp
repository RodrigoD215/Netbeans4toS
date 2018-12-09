<%-- 
    Document   : inicio
    Created on : 06/11/2017, 05:36:38 PM
    Author     : Juancarlos
--%>


<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Estas en la página de inicio.jsp</h1>
        Número1 es : <c:out value="${num1x}"/><p></p>
        Número2 es : <c:out value="${num2x}"/><p></p>
        La suma es : <c:out value="${num1x+num2x}"/>
    </body>
</html>
