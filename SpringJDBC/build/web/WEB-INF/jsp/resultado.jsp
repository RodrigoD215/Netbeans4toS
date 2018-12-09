<%-- 
    Document   : listado
    Created on : 20/11/2017, 03:37:56 PM
    Author     : Juancarlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
        <c:choose>
    <c:when test="${msm.equals('nel')}">
       <div class="jumbotron">
                 <center><h1>No se encontró ninguna coincidencia.</h1></center>
             </div>
        <br />
    </c:when>    
    <c:otherwise>
            <div class="row">
                <a href="<c:url value="agregar.htm"/>" class="btn btn-success">
                    Insertar
                </a>
                </div>
            <p></p>
            <table class="table table-bordered table-striped table-hover">
                
                
                    <thead>
                        <tr>
                            <td>Usuario</td>
                            <td>Clave</td>
                            <td>Nombres</td>
                            <td>Direccion</td>
                            <td>Telefono</td>
                            <td>Correo</td>
                            <td>Opciones</td>
                        </tr>
                    </thead>
                    <tbody>
                    
                    <c:forEach items="${datos}" var="dato">
                        <tr>
                            <td><c:out value="${dato.usuario}"/></td>
                            <td><c:out value="${dato.clave}"/></td>
                            <td><c:out value="${dato.nombres}"/></td>
                            <td><c:out value="${dato.direccion}"/></td>
                            <td><c:out value="${dato.telefono}"/></td>
                            <td><c:out value="${dato.correo}"/></td>
                            <td>
                            <a href="<c:url value="editar.htm?id=${dato.codigo}"/>" class="btn btn-primary">Editar</a>    
                            <a href="<c:url value="eliminar.htm?id=${dato.codigo}"/>" class="btn btn-secondary">Eliminar</a>
                            </td>
                        </tr>
                        
                    </c:forEach>
                    </tbody>
                
                
            </table>
       
    </c:otherwise>
</c:choose>
        </div>
    </body>
</html>
