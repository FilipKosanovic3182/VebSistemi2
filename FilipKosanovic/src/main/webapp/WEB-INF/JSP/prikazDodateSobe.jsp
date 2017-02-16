<%-- 
    Document   : prikazDodateSobe
    Created on : Feb 16, 2017, 7:26:25 PM
    Author     : Filip Wolve
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodata soba</title>
    </head>
    <body>
        <table>
            <th><td colspan="2"><h2>Dodata soba:</h2></td></th>
            <tr>
                <td><spring:message code="soba.brKreveta" />
                <td><label>${brKreveta}</label></td>
            </tr>
            <tr>
                <td><spring:message code="soba.velicina" />
                <td><label>${velicina}</label></td>
            </tr>
            <tr>
                <td><spring:message code="soba.kupatilo" />
                <td><label>${kupatilo}</label></td>
            </tr>
            <tr>
                <td><spring:message code="soba.tv" />
                <td><label>${tv}</label></td>
            </tr>
            <tr>
                <td><spring:message code="soba.klima" />
                <td><label>${klima}</label></td>
            </tr>
            <tr>
                <td><spring:message code="soba.cena" />
                <td><label>${cena}</label></td>
            </tr>
        </table>
    </body>
</html>
