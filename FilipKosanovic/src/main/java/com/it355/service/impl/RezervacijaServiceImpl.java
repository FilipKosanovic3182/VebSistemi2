/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service.impl;

import com.it355.dao.RezervacijaDao;
import com.it355.model.Rezervacija;
import com.it355.service.RezervacijaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Filip Wolve
 */
public class RezervacijaServiceImpl implements RezervacijaService{
    @Autowired
    RezervacijaDao rezervacijaDao;
    
    @Override
    public int getCount() {
        return rezervacijaDao.getCount();
    }

    @Override
    public List<Rezervacija> getAllRezervacije() {
        return rezervacijaDao.getAllRezervacije();
    }

    @Override
    public boolean addRezervacija(Rezervacija rezervacija) {
        return rezervacijaDao.addRezervacija(rezervacija);
    }

    @Override
    public List<Rezervacija> getRezervacijaByDanDolaska(String danDolaska) {
        return rezervacijaDao.getRezervacijaByDanDolaska(danDolaska);
    }
    
}
