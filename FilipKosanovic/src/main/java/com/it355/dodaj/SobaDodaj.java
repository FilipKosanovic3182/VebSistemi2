/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dodaj;

/**
 *
 * @author Filip Wolve
 */
public interface SobaDodaj {
    public void addSoba(); 
    public String addSobaRet(); 
    public void addSobaThrowException() throws Exception; 
    public void addSobaAround(String name);
}
