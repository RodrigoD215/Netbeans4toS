
<%-- 
    Document   : resultados
    Created on : 29/10/2018, 01:22:40 PM
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td colspan="3">Resultados</td>
            </tr>      
            <tr>
                <td><c:out value="${num1}" /></td>         
            <td>
            <c:choose>
                <c:when test="${ope=='mul'}" >
                    <c:out value="Multiplicacion x 1: ${num1 * 1}" />
                    <c:out value="Multiplicacion x 2: ${num1 * 2}" />
                    <c:out value="Multiplicacion x 3: ${num1 * 3}" />
                    <c:out value="Multiplicacion x 4: ${num1 * 4}" />
                    <c:out value="Multiplicacion x 5: ${num1 * 5}" />
                    <c:out value="Multiplicacion x 6: ${num1 * 6}" />
                    <c:out value="Multiplicacion x 7: ${num1 * 7}" />
                    <c:out value="Multiplicacion x 8: ${num1 * 8}" />
                    <c:out value="Multiplicacion x 9: ${num1 * 9}" />
                    <c:out value="Multiplicacion x 10: ${num1 * 10}" />
                    <c:out value="Multiplicacion x 11: ${num1 * 11}" />
                    <c:out value="Multiplicacion x 12: ${num1 * 12}" />                    
                </c:when>             
                <c:otherwise>
                    <c:out value="Digito incorrecto" />
                </c:otherwise>
            </c:choose>
            </td>
           </tr>
        </table>
    </body>
</html>

