<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Datos de la Solicitud.</h1> 
        
        <p>Tipo de Documento:<c:out value="${user.TDoc}"/></p>
        <p>N° de Documento:<c:out value="${user.DNI}"/></p>
        <p>Apellido Paterno:<c:out value="${user.apellidoPaterno}"/></p>
        <p>Apellido Materno:<c:out value="${user.apellidoMaterno}"/></p>
        <p>Nombres:<c:out value="${user.nameP}"/></p>
        <p>Fecha de Nacimiento:<c:out value="${user.fechaN}"/>-<c:out value="${user.fechaU}"/>-<c:out value="${user.fechaA}"/></p>
        <p>Sexo: <c:out value="${user.sexo}"/></p>
        <p>Estado Civil:<c:out value="${user.tado}"/></p>
        <p>Situacion Lavoral: <c:out value="${user.country}"/></p>
        <p>RUC del Empleador:<c:out value="${user.id}"/></p>
        <p>Terminos y Condiciones:<c:out value="${user.info}"/></p>
        </center>                        
    </body>
</html>
