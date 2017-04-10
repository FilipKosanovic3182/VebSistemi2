<%-- 
    Document   : form_dodavanje_rezervacije
    Created on : Apr 1, 2017, 4:09:22 PM
    Author     : Filip Wolve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodavanje rezervacije</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form:form method="POST" action="${flowExecutionUrl}">
            <input type="hidden" name="_eventId" value="performRezervacija"> 
                    <input type="hidden" name="_eventId" value="performRezervacija">
                    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
            <table>
                <tr>
                    <td>Broj odraslih</td>
                    <td><input type="number" name="brOdraslih" ></td>
                </tr>
                <tr>
                    <td>Broj dece</td>
                    <td><input type="number" name="brDece"></td>
                </tr>
                <tr>
                    <td>Dan dolaska</td>
                    <td><input type="date" name="datumDolaska"></td>
                </tr>
                <tr>
                    <td>Dan odlaska</td>
                    <td><input type="date" name="datumOdlaska"></td>
                </tr>
                <tr>
                    <td>Prezime</td>
                    <td><input type="text" maxlength="20" name="prezime"></td>
                </tr>
                <tr>
                    <td>Ime</td>
                    <td><input type="text" maxlength="20" name="ime"></td>
                </tr>
                <tr>
                    <td>Cena na vece</td>
                    <td><input type="number" value="70" name="cena" disabled></td>
                </tr>
                <tr>
                    <td>Vrsta kartice za placanje:</td>
                    <td><select name="kartica">
                            <option value="Electron">Electron</option>
                            <option value="Visa">Visa</option>
                            <option value="Mastercard">Mastercard</option>
                            <option value="Maestro">Maestro</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Broj kartice</td>
                    <td><input type="number" name="brKartice"></td>
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
