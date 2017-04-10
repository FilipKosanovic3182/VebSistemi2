/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service;

import com.it355.model.Rezervacija;
import java.util.List;

/**
 *
 * @author Filip Wolve
 */
public interface RezervacijaService {
    public int getCount();
    public List<Rezervacija> getAllRezervacije();
    public boolean addRezervacija(Rezervacija rezervacija);
    public List<Rezervacija> getRezervacijaByDanDolaska (String danDolaska);
}
