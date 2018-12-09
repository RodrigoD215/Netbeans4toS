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
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td colspan="3">Resultados</td>
            </tr>
            <td>
            <c:choose>
                <c:when test="${ope=='mul'}" >
                    <h1><c:out value="Tabla de Multiplicar del Numero ${num1}" /></h1><br>
                    <center>
                    <c:out value="Multiplicacion x 01 : ${num1 * 1}" />
                            
                            <c:choose>
                               <c:when test="${num1*1%2==0}">
                                 <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                               </c:when>                            
                               <c:otherwise>
                                  <input TYPE=checkbox name=Impar VALUE=valorImpar>
                               </c:otherwise>
                           </c:choose>                   
                                                        
                    <br>
                    
                    <c:out value="Multiplicacion x 02 : ${num1 * 2}" />
                            
                               <c:choose>
                                   <c:when test="${num1*2%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                    
                    <c:out value="Multiplicacion x 03 : ${num1 * 3}" />
                    
                                <c:choose>
                                   <c:when test="${num1*3%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                      
                    <br>
                    
                    <c:out value="Multiplicacion x 04 : ${num1 * 4}" />
                    
                               <c:choose>
                                   <c:when test="${num1*4%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                                         
                    <br>                   
                 
                    <c:out value="Multiplicacion x 05 : ${num1 * 5}" />
                    
                               <c:choose>
                                   <c:when test="${num1*5%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                    
                    <c:out value="Multiplicacion x 06 : ${num1 * 6}" />
                                                           
                               <c:choose>
                                   <c:when test="${num1*6%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                    
                    <c:out value="Multiplicacion x 07 : ${num1 * 7}" />
                                        
                               <c:choose>
                                   <c:when test="${num1*7%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                    
                    <c:out value="Multiplicacion x 08 : ${num1 * 8}" />
                                                           
                               <c:choose>
                                   <c:when test="${num1*8%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                    
                    <c:out value="Multiplicacion x 09 : ${num1 * 9}" />
                                        
                               <c:choose>
                                   <c:when test="${num1*9%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                                        
                    <c:out value="Multiplicacion x 10 : ${num1 * 10}" />
                                                          
                               <c:choose>
                                   <c:when test="${num1*10%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                    
                    <c:out value="Multiplicacion x 11 : ${num1 * 11}" />
                                                            
                               <c:choose>
                                   <c:when test="${num1*11%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                  
                    <c:out value="Multiplicacion x 12 : ${num1 * 12}" />
                                                            
                               <c:choose>
                                   <c:when test="${num1*12%2==0}">
                                     <input type="checkbox" name="Par" value="valorPar" checked="true"/>
                                   </c:when>                            
                                   <c:otherwise>
                                      <input TYPE=checkbox name=Impar VALUE=valorImpar>
                                   </c:otherwise>
                               </c:choose> 
                                       
                    <br>
                                        
                     </center>
                </c:when>
                <c:when test="${ope=='entre'}" >
                <h1><c:out value="Numeros Primos entre ${num1} y ${num2}" /></h1><br>
                                            
                           
                    <c:set var="upperLimit" value="${20}"/>
                    <c:forEach var="i" begin="${num1}" end="${num2}">
                     <c:set var="isPrime" value="${true}"/>
                     <c:forEach var="j" begin="${2}" end="${i-1}">
                      <c:if test="${i%j == 0}">
                       <c:set var="isPrime" value="${false}"/>
                      </c:if>
                     </c:forEach>
                     <c:choose>
                      <c:when test="${isPrime}">
                                           
                       <select name="listaPrimos" size="1">

                         <option value="Numeros Primos">${i}</option>

                        </select>
                       
                      </c:when>
                     </c:choose>
                    </c:forEach>
                    
                </c:when>
                
                <c:otherwise>
                    <c:out value="Operador incorrecto" />
                </c:otherwise>
            </c:choose>
            </td>
        </table>
    </body>
</html>
