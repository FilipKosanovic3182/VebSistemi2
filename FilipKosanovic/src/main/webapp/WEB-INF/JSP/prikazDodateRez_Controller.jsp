<%-- 
    Document   : Prikaz dodate rezervacije
    Created on : Apr 1, 2017, 4:41:25 PM
    Author     : Filip Wolve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz dodate Rezervacije</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table>
                <tr>
                    <td>Broj odraslih</td>
                    <td>${object.brOdraslih}</td>
                </tr>
                <tr>
                    <td>Broj dece</td>
                    <td>${object.brDece}</td>
                </tr>
                <tr>
                    <td>Dan dolaska</td>
                    <td>${object.danDolaska}</td>
                </tr>
                <tr>
                    <td>Dan odlaska</td>
                    <td>${object.danOdlaska}</td>
                </tr>
                <tr>
                    <td>Prezime</td>
                    <td>${object.prezime}</td>
                </tr>
                <tr>
                    <td>Ime</td>
                    <td>${object.ime}</td>
                </tr>
                <tr>
                    <td>Cena</td>
                    <td>${object.cenaNaVece}</td>
                </tr>
                <tr>
                    <td>Vrsta kartice za placanje:</td>
                    <td>${object.vrstaKartice}</td>
                </tr>
                <tr>
                    <td>Broj kartice</td>
                    <td>${object.brKartice}</td>
                </tr>
                <tr>
                    <td colspan="2">
                        Uspesno ste izvrsili rezervaciju sa ovim podacima.
                    </td>
                </tr>
                
            </table>
    </body>
</html>
