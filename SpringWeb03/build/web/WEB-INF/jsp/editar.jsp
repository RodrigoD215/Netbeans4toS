<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Spring CRUD</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="<c:url value="/listado.htm" />">Listado de Usuarios</a></li>
                <li class="active">Editar</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading">Formulario</div>
                <div class="panel-body">
                   
                        <form:form method="post" commandName="datos">
                            <h1>Complete el formulario</h1>
                            <p>
                                <form:label path="nombres">Nombres:</form:label>
                                <form:input path="nombres" cssClass="form-control" />
                            </p>
                            <p>
                                <form:label path="apellidos">Apellidos:</form:label>
                                <form:input path="apellidos" cssClass="form-control" />
                            </p>
                            <p>
                                <form:label path="telefono">Telefono</form:label>
                                <form:input path="telefono" cssClass="form-control" />
                            </p>
                            <p>
                                <form:select path="sexo" cssClass="form-control">
                                    <option value="M">Masculino</option>
                                    <option value="F">Femenino</option>
                                </form:select>
                            </p>
                            <hr />
                            <input type="submit" value="Guardar" class="btn btn-danger" />
                        </form:form>
                </div>
            </div>
        </div>
    </body>
</html>

