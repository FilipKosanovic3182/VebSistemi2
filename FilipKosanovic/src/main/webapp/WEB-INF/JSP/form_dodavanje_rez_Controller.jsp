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
        
        <form:form method="POST" action="prikaziDodajRezervaciju" modelAttribute="rezervacija">
            <table>
                <tr>
                    <td>Broj odraslih</td>
                    <td><form:input path="brOdraslih" type="number" name="brOdraslih" /></td>
                </tr>
                <tr>
                    <td>Broj dece</td>
                    <td><form:input path="brDece" type="number" name="brDece" /></td>
                </tr>
                <tr>
                    <td>Dan dolaska</td>
                    <td><form:input path="danDolaska" type="date" name="danDolaska" /></td>
                </tr>
                <tr>
                    <td>Dan odlaska</td>
                    <td><form:input path="danOdlaska" type="date" name="danOdlaska" /></td>
                </tr>
                <tr>
                    <td>Prezime</td>
                    <td><form:input path="prezime" type="text" maxlength="20" name="prezime" /></td>
                </tr>
                <tr>
                    <td>Ime</td>
                    <td><form:input path="ime" type="text" maxlength="20" name="ime" /></td>
                </tr>
                <tr>
                    <td>Cena na vece</td>
                    <td><form:input path="cenaNaVece" type="number" value="70" name="cenaNaVece"/></td>
                </tr>
                <tr>
                    <td>Vrsta kartice za placanje:</td>
                    <td><form:select path="vrstaKartice" name="vrstaKartice">
                            <form:option value="Electron">Electron</form:option>
                            <form:option value="Visa">Visa</form:option>
                            <form:option value="Mastercard">Mastercard</form:option>
                            <form:option value="Maestro">Maestro</form:option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>Broj kartice</td>
                    <td><form:input path="brKartice" type="number" name="brKartice" /></td>
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
