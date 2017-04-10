/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dao;

import com.it355.model.Rezervacija;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Filip Wolve
 */
public interface RezervacijaDao {
    public int getCount();
    public List<Rezervacija> getAllRezervacije();
    public boolean addRezervacija(Rezervacija rezervacija);
    public List<Rezervacija> getRezervacijaByDanDolaska (String danDolaska);
}
