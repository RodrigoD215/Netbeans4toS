<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitar Nueva Tarjeta BCP.</title>
        <style type="text/css">
            .formError { background-color: #FFC; }
        </style>
    </head>
    <body>
        <center>
        <h1>Solicitar Nueva Tarjeta BCP.</h1>  

        <form:form modelAttribute="user" action="result" method="POST">
            <table>

                                          
                <tr>            
                    <td><form:label path="TDoc">Tipo de Documento:</form:label></td>
                    <td><form:radiobutton path="TDoc" cssErrorClass="formError" value="DNI."/>DNI</td>
                    <td><form:radiobutton path="TDoc" cssErrorClass="formError" value="Carnet de Extranjeria."/>Carnet de Extranjeria</td>
                    <td><form:errors path="TDoc" style="color:red;" /></td>
                </tr>
                          
                <tr>            
                    <td><form:label path="DNI">N° de Documento:</form:label></td>
                    <td><form:input path="DNI" cssErrorClass="formError"/> </td>
                    <td><form:errors path="DNI" style="color:red;" /></td>
                </tr>
                <tr>            
                    <td><form:label path="apellidoPaterno">Apellido Paterno:</form:label></td>
                    <td><form:input path="apellidoPaterno" cssErrorClass="formError"/> </td>
                    <td><form:errors path="apellidoPaterno" style="color:red;"/></td>
                </tr>
                <tr>            
                    <td><form:label path="apellidoMaterno">Apellido Materno:</form:label></td>
                    <td><form:input path="apellidoMaterno" cssErrorClass="formError"/> </td>
                    <td><form:errors path="apellidoMaterno" style="color:red;" /></td>
                </tr>
                <tr>
                    <td><form:label path="nameP">Nombres:</form:label></td>
                    <td><form:input path="nameP" cssErrorClass="formError"/></td>
                    <td><form:errors path="nameP" style="color:red;"/></td>
                </tr>

                <tr>
                    <td><form:label path="fechaN" >Fecha de Nacimiento:</form:label></td>
                    <td>
                <form:select path="fechaN">
                        <form:option value="01" label="01" />
                        <form:option value="02" label="02" />
                        <form:option value="03" label="03" />
                        <form:option value="04" label="04" />
                        <form:option value="05" label="05" />
                        <form:option value="06" label="06" />
                        <form:option value="07" label="07" />
                        <form:option value="08" label="08" />
                        <form:option value="09" label="09" />
                        <form:option value="10" label="10" />
                        <form:option value="11" label="11" />
                        <form:option value="12" label="12" />
                        <form:option value="13" label="13" />
                        <form:option value="14" label="14" />
                        <form:option value="15" label="15" />
                        <form:option value="16" label="16" />
                        <form:option value="17" label="17" />
                        <form:option value="18" label="18" />
                        <form:option value="19" label="19" />
                        <form:option value="20" label="20" />
                        <form:option value="21" label="21" />
                        <form:option value="22" label="22" />
                        <form:option value="23" label="23" />
                        <form:option value="24" label="24" />
                        <form:option value="25" label="25" />
                        <form:option value="26" label="26" />
                        <form:option value="27" label="27" />
                        <form:option value="28" label="28" />
                        <form:option value="29" label="29" />
                        <form:option value="30" label="30" />
                        <form:option value="31" label="31" />
                        <form:errors path="fechaN"/>
                </form:select>
                        <form:select path="fechaU">
                        <form:option value="01" label="01" />
                        <form:option value="02" label="02" />
                        <form:option value="03" label="03" />
                        <form:option value="04" label="04" />
                        <form:option value="05" label="05" />
                        <form:option value="06" label="06" />
                        <form:option value="07" label="07" />
                        <form:option value="08" label="08" />
                        <form:option value="09" label="09" />
                        <form:option value="10" label="10" />
                        <form:option value="11" label="11" />
                        <form:option value="12" label="12" />
                        <form:errors path="fechaU"/>
                </form:select>
                <form:select path="fechaA">
                        <form:option value="2010" label="2010" />
                        <form:option value="2011" label="2011" />
                        <form:errors path="fechaA"/>
                </form:select>
                        
                        </td>
                </tr>
                
                <tr>            
                    <td><form:label path="sexo">Sexo:</form:label></td>
                    <td><form:radiobutton path="sexo" cssErrorClass="formError" value="Masculino."/>Masculino</td>
                    <td><form:radiobutton path="sexo" cssErrorClass="formError" value="Femenino."/>Femenino</td>
                    <td><form:errors path="TDoc" style="color:red;"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="tado" >Estado Civil:</form:label></td>
                    <td>
                            <form:select path="tado">
                                    <form:option value="Soltero." label="Soltero" />
                                    <form:option value="Casado." label="Casado." />
                                    <form:errors path="tado" style="color:red;"/>
                            </form:select>                   
                    </td>
                </tr>
                <tr>
                    <td><form:label path="country" >Situacion Laboral</form:label></td>
                    <td>
                    <form:select path="country">
                            <form:options items="${countries}"></form:options>
                    </form:select>                    
                    </td>
                    <td><form:errors path="country" style="color:red;"/></td>
                </tr>
                                                                            
                <tr>            
                    <td><form:label path="id">RUC del Empleador:</form:label></td>
                    <td><form:input path="id" cssErrorClass="formError"/> </td>
                    <td><form:errors path="id" style="color:red;"/></td>
                </tr>
                
                <tr>            
                    <td><form:label path="info">Terminos y Condiciones:</form:label></td>
                    <td><form:checkbox path="info" value="Acepto los Terminos y Condiciones."/>Acepto</td>
                    <td><form:errors path="info"/></td>
                </tr>                           
            </table>
            <input type="submit" value="Solicitar Tarjeta">
        </form:form>   
            
        </center>

    </body>
</html>
