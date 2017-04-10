/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

import java.io.Serializable;

/**
 *
 * @author Filip Wolve
 */
@SuppressWarnings("serial")
public class Soba implements Serializable{
    private Integer brKreveta;
    private Integer velicina;
    private Boolean kupatilo;
    private Boolean tv;
    private Boolean klima;
    private Double cena;
    private Integer id;
    
    public Soba(){}
    
    public Soba(Integer id, Integer brKreveta, Integer velicina, Boolean kupatilo, Boolean tv, Boolean klima, Double cena){
        this.id = id;
        this.brKreveta = brKreveta;
        this.velicina = velicina;
        this.kupatilo = kupatilo;
        this.tv = tv;
        this.klima = klima;
        this.cena = cena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getBrKreveta() {
        return brKreveta;
    }

    public Integer getVelicina() {
        return velicina;
    }

    public Boolean getKupatilo() {
        return kupatilo;
    }

    public Boolean getTv() {
        return tv;
    }

    public Boolean getKlima() {
        return klima;
    }

    public Double getCena() {
        return cena;
    }

    public void setBrKreveta(Integer brKreveta) {
        this.brKreveta = brKreveta;
    }

    public void setVelicina(Integer velicina) {
        this.velicina = velicina;
    }

    public void setKupatilo(Boolean kupatilo) {
        this.kupatilo = kupatilo;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
    }

    public void setKlima(Boolean klima) {
        this.klima = klima;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    
    
    
    
}
