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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table>
                <tr>
                    <td>Broj odraslih</td>
                    <td>${loginBean.brOdraslih}</td>
                </tr>
                <tr>
                    <td>Broj dece</td>
                    <td>${loginBean.brDece}</td>
                </tr>
                <tr>
                    <td>Dan dolaska</td>
                    <td>${loginBean.datumDolaska}</td>
                </tr>
                <tr>
                    <td>Dan odlaska</td>
                    <td>${loginBean.datumOdlaska}</td>
                </tr>
                <tr>
                    <td>Prezime</td>
                    <td>${loginBean.prezime}</td>
                </tr>
                <tr>
                    <td>Ime</td>
                    <td>${loginBean.ime}</td>
                </tr>
                <tr>
                    <td>Cena</td>
                    <td>${loginBean.cenaUkupna}</td>
                </tr>
                <tr>
                    <td>Vrsta kartice za placanje:</td>
                    <td>${loginBean.kartica}</td>
                </tr>
                <tr>
                    <td>Broj kartice</td>
                    <td>${loginBean.brKartice}</td>
                </tr>
                <tr>
                    <td colspan="2">
                        Uspesno ste izvrsili rezervaciju sa ovim podacima.
                    </td>
                </tr>
                
            </table>
    </body>
</html>
