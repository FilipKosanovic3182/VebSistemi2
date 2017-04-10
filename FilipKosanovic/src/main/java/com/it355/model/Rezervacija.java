/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Filip Wolve
 */
@SuppressWarnings("serial")
public class Rezervacija implements Serializable{
    private Integer id;
    private Integer brOdraslih;
    private Integer brDece;
    private String danDolaska;
    private String danOdlaska;
    private String prezime;
    private String ime;
    private Double cenaNaVece;
    private String vrstaKartice;
    private Integer brKartice;

    public Integer getId() {
        return id;
    }

    public Integer getBrOdraslih() {
        return brOdraslih;
    }

    public Integer getBrDece() {
        return brDece;
    }

    public String getDanDolaska() {
        return danDolaska;
    }

    public String getDanOdlaska() {
        return danOdlaska;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public Double getCenaNaVece() {
        return cenaNaVece;
    }

    public String getVrstaKartice() {
        return vrstaKartice;
    }

    public Integer getBrKartice() {
        return brKartice;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrOdraslih(Integer brOdraslih) {
        this.brOdraslih = brOdraslih;
    }

    public void setBrDece(Integer brDece) {
        this.brDece = brDece;
    }

    public void setDanDolaska(String danDolaska) {
        this.danDolaska = danDolaska;
    }

    public void setDanOdlaska(String danOdlaska) {
        this.danOdlaska = danOdlaska;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setCenaNaVece(Double cenaNaVece) {
        this.cenaNaVece = cenaNaVece;
    }

    public void setVrstaKartice(String vrstaKartice) {
        this.vrstaKartice = vrstaKartice;
    }

    public void setBrKartice(Integer brKartice) {
        this.brKartice = brKartice;
    }

    @Override
    public String toString() {
        return "Rezervacija[" + "id=" + id + ", brOdraslih=" + brOdraslih + ", brDece=" + brDece + ", danDolaska=" + danDolaska + ", danOdlaska=" + danOdlaska + ", prezime=" + prezime + ", ime=" + ime + ", cenaNaVece=" + cenaNaVece + ", vrstaKartice=" + vrstaKartice + ", brKartice=" + brKartice + ']';
    }
    
    
    
}
