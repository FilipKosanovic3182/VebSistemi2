<%-- 
    Document   : form_dodavanje_soba
    Created on : Feb 16, 2017, 1:09:14 AM
    Author     : Filip Wolve
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodavanje soba</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form:form method="POST" action="addRoom" modelAttribute="soba" >
            <table>
                <tr>
                    <td><form:label path="brKreveta"><spring:message code="soba.brKreveta"/></form:label></td>
                    <td><form:input path="brKreveta" type="number"/></td>
                </tr>
                <tr>
                    <td><form:label path="velicina"><spring:message code="soba.velicina"/></form:label></td>
                    <td><form:input path="velicina" type="number"/></td>
                </tr>
                <tr>
                    <td><form:label path="kupatilo"><spring:message code="soba.kupatilo" /></form:label></td>
                    <td><form:checkbox path="kupatilo" /></td>
                </tr>
                <tr>
                    <td><form:label path="tv"><spring:message code="soba.tv" /></form:label></td>
                    <td><form:checkbox path="tv" /></td>
                </tr>
                <tr>
                    <td><form:label path="klima"><spring:message code="soba.klima" /></form:label></td>
                    <td><form:checkbox path="klima" /></td>
                </tr>
                <tr>
                    <td><form:label path="cena"><spring:message code="soba.cena" /></form:label></td>
                    <td><form:input path="cena" type="number" step="0.01"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Pošalji"/>
                    </td>
                </tr>
                
            </table>
</form:form> 
    </body>
</html>
