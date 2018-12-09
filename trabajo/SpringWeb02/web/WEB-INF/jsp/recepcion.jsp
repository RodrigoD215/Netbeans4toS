<%-- 
    Document   : recepcion
    Created on : 13/11/2017, 05:58:31 PM
    Author     : Juancarlos
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de recepcion de datpos</h1>
        Número 1: <c:out value="${numero1}"/><br />
        Número 2: <c:out value="${numero2}"/><br />
        Operacion: <c:out value="${operacion}"/><br />
        Resultado: <c:out value="${resul}"/><br />
    </body>
</html>
