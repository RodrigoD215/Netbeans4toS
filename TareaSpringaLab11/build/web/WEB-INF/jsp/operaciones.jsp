<%-- 
    Document   : operaciones
    Created on : 06/11/2017, 06:09:32 PM
    Author     : Juancarlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Operaciones</h1>
        
            Número 1 : <c:out value="${num1}"/><p></p>
            Número 2 : <c:out value="${num2}"/><p></p>
            Resultado : <c:out value="${resultado}"/><p></p>
            
    </body>
</html>
