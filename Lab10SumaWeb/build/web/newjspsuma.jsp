<%-- 
    Document   : newjspsuma
    Created on : 26/10/2018, 12:28:47 PM
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Multiplicacion Rodrigo Duenas.</title>
</head>
<body>
 <h2>Multiplicacion:</h2>
 <form action="newjspsuma.jsp" method="POST">
     <table>
         <tr>
             <td>Ingrese el Primer numero: </td>
             <td><input type="text" name="numero1"></td>
         </tr>
         <tr>
             <td>Ingrese el Segundo numero: </td></span>
             <td><input type="text" name="numero2"></td>
         </tr>
         <tr>
             <td>
                 <input type="submit" name ="enviar" value="Multiplicar">
             </td>
         </tr>
     </table>
 </form>
</body>
</html>

<%
if(request.getParameter("enviar") != null)
{
    int num1 = Integer.parseInt(request.getParameter("numero1"));
    int num2 = Integer.parseInt(request.getParameter("numero2"));
    int suma = num1*num2; out.print("La multiplicacion es : " + suma );
}
%>
