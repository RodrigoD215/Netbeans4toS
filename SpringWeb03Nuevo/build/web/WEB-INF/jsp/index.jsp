<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
         <div class="container">
             <div class="jumbotron">
                 <center><h1>Bienvenidos a la página de Granda!!!!</h1></center>
             </div>
             
            
            <div class="panel panel-primary">
                <div class="panel-heading">Búsqueda de usuarios</div>
                <div class="panel-body">
                   
                        <form:form method="post" commandName="datos">
                           <center><h2>¡Ingrese el nombre del usuario a buscar!</h2></center>
                            <p>
                                <form:label path="nombres">Nombres:</form:label>
                                <form:input path="nombres" cssClass="form-control" />
                            </p>
                           
                            <hr />
                            <input type="submit" value="Buscar" class="btn btn-danger" />
                        </form:form>
                </div>
            </div>
        </div>
        
    </body>
</html>