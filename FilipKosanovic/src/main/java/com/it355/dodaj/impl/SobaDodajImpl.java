/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dodaj.impl;

import com.it355.dodaj.SobaDodaj;

/**
 *
 * @author Filip Wolve
 */
public class SobaDodajImpl implements SobaDodaj{

    @Override
    public void addSoba() {
        System.out.println("Dodajem sobu!");
    }

    @Override
    public String addSobaRet() {
        System.out.println("Dodajem sobu i vracam vrednost"); 
        return "dodato";
    }

    @Override
    public void addSobaThrowException() throws Exception {
        System.out.println("dodajem sobu, ali bacicu gresku"); 
        throw new Exception("Generic error!");
    }

    @Override
    public void addSobaAround(String brKreveta) {
        System.out.println("dodajem sobu sa brojem kreveta: " + brKreveta);
    }
    
}
