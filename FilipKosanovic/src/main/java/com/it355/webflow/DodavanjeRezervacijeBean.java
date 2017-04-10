/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.webflow;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Filip Wolve
 */
public class DodavanjeRezervacijeBean implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer brOdraslih;
    private Integer brDece;
    private String datumDolaska;
    private String datumOdlaska;
    private String prezime;
    private String ime;
    private Double cena;
    private String kartica;
    private Integer brKartice;
    private Double cenaUkupna;

    public Double getCenaUkupna() {
        return cenaUkupna;
    }

    public void setCenaUkupna(Double cenaUkupna) {
        cenaUkupna = cena * 3;
        this.cenaUkupna = cenaUkupna;
    }

    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getBrOdraslih() {
        return brOdraslih;
    }

    public Integer getBrDece() {
        return brDece;
    }

    public String getDatumDolaska() {
        return datumDolaska;
    }

    public String getDatumOdlaska() {
        return datumOdlaska;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public Double getCena() {
        return cena;
    }

    public String getKartica() {
        return kartica;
    }

    public Integer getBrKartice() {
        return brKartice;
    }

    public void setBrOdraslih(Integer brOdraslih) {
        this.brOdraslih = brOdraslih;
    }

    public void setBrDece(Integer brDece) {
        this.brDece = brDece;
    }

    public void setDatumDolaska(String datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public void setDatumOdlaska(String datumOdlaska) {
        this.datumOdlaska = datumOdlaska;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public void setKartica(String kartica) {
        this.kartica = kartica;
    }

    public void setBrKartice(Integer brKartice) {
        this.brKartice = brKartice;
    }

   
    
    @Override public String toString() {
        return "DodavanjeRezervacijeBean [brOdraslih=" + brOdraslih + ", brDece=" + brDece + ", datumDolaska=" 
                + datumDolaska + ", datumOdlaska=" + datumOdlaska + ", prezime=" + prezime + ", ime=" + ime + ", cena=" + cena + ", kartica=" + kartica + ", brKartice=" + brKartice + "]"; 
    }
}