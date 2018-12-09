<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Login:</title>
        <style type="text/css">
            .formError { background-color: #FFC; }
        </style>
    </head>
    <body>
        <h1>Formulario de Login.</h1>  

        <form:form modelAttribute="user" action="result" method="POST">
            <table>
                <tr>            
                    <td><form:label path="dni">DNI:</form:label></td>
                    <td><form:input path="dni" cssErrorClass="formError"/> </td>
                    <td><form:errors path="dni"/></td>
                </tr>
                <tr>
                    <td><form:label path="nombre">Nombre:</form:label></td>
                    <td><form:input path="nombre" cssErrorClass="formError"/></td>
                    <td><form:errors path="nombre"/></td>
                </tr>
                <tr>
                    <td><form:label path="correo">Correo:</form:label></td>
                    <td><form:input path="correo" cssErrorClass="formError" /></td>
                    <td><form:errors path="correo"/></td>
                </tr>
                <tr>
                    <td><form:label path="clave">Clave:</form:label></td>
                    <td><form:input path="clave" type="password" cssErrorClass="formError"/></td>
                    <td><form:errors path="clave"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="tipo" >Tipo:</form:label></td>
                    <td>
                    <form:select path="tipo">
                        <form:option value="admin" label="Admin" />
                        <form:option value="tecsup" label="Tecsup" />
                        </form:select>
                    </td>
                    <td><form:errors path="tipo"/></td>
                </tr>
            </table>
            <input type="submit" value="Enviar">
        </form:form>     

    </body>
</html>
