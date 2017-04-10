/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dao.impl;

import com.it355.dao.RezervacijaDao;
import com.it355.mapper.RezervacijaMapper;
import com.it355.model.Rezervacija;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Filip Wolve
 */
public class RezervacijaDaoImpl implements RezervacijaDao{
    
    private JdbcTemplate jdbcTemplate; 
    @SuppressWarnings("unused") 
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource; 
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM rezervacije"; 
        int count = jdbcTemplate.queryForObject(sql, Integer.class); 
        return count; 
    }

    @Override
    public List<Rezervacija> getAllRezervacije() {
        String sql= "SELECT * FROM rezervacije"; 
        List<Rezervacija> rezervacije= jdbcTemplate.query(sql, new RezervacijaMapper()); 
        return rezervacije;
    }

    @Override
    public boolean addRezervacija(Rezervacija rezervacija) {
        String sql = "INSERT INTO rezervacije " + "(id, brOdraslih, brDece, danDolaska, danOdlaska, prezime, ime, cenaNaVece, vrstaKartice, brKartice) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
        jdbcTemplate.update(sql, new Object[] {
            rezervacija.getId(), 
            rezervacija.getBrOdraslih(), 
            rezervacija.getBrDece(),
            rezervacija.getDanDolaska(),
            rezervacija.getDanOdlaska(),
            rezervacija.getPrezime(),
            rezervacija.getIme(),
            rezervacija.getCenaNaVece(),
            rezervacija.getVrstaKartice(),
            rezervacija.getBrKartice()
        });
        return true; 
    }

    @Override
    public List<Rezervacija> getRezervacijaByDanDolaska(String danDolaska) {
        String sql= "SELECT * FROM rezervacije WHERE danDolaska =" + danDolaska; 
        List<Rezervacija> rezervacije= jdbcTemplate.query(sql, new RezervacijaMapper()); 
        return rezervacije; 
    }
    
}
