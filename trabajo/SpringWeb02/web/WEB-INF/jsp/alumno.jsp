<%-- 
    Document   : alumno
    Created on : 13/11/2017, 04:56:10 PM
    Author     : Juancarlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de Operaciones usando Spring MVC</h1>
        <form:form>
            <form:label path="num1">Primer Término</form:label>
            <form:input path="num1"/>
            <br/><br/>
            <form:label path="num2">Segundo Término</form:label>
            <form:input path="num2"/>
            <br/><br/>
            <form:label path="especialidad">Operaciones</form:label>
            <form:select path="especialidad">
                <form:options items="${especialidades}" />
            </form:select>
            <hr/>
            <form:button>Enviar Operación</form:button>
        </form:form>
    </body>
</html>
