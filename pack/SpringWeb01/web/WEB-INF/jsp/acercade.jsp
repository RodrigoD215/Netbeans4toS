<%-- 
    Document   : acercade
    Created on : 06/11/2017, 05:41:12 PM
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
        <h1>Acerca de...</h1>
        
            Nombre es : <c:out value="${nombre}"/><p></p>
            Especialidad es : <c:out value="${especialidad}"/><p></p>
            Semestre : <c:out value="${semestre}"/><p></p>
            Telefono : <c:out value="${telefono}"/><p></p>
            Hoby : <c:out value="${hoby}"/><p></p>
            </body>
</html>
