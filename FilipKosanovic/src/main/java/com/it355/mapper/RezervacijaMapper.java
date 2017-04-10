/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.mapper;

import com.it355.model.Rezervacija;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Filip Wolve
 */
public class RezervacijaMapper implements RowMapper<Rezervacija>{

    @Override
    public Rezervacija mapRow(ResultSet rs, int i) throws SQLException {
        Rezervacija rezervacija = new Rezervacija();
        rezervacija.setId(rs.getInt("id"));
        rezervacija.setBrOdraslih(rs.getInt("brOdraslih"));
        rezervacija.setBrDece(rs.getInt("brDece"));
        rezervacija.setDanDolaska(rs.getString("danDolaska"));
        rezervacija.setDanOdlaska(rs.getString("danOdlaska"));
        rezervacija.setPrezime(rs.getString("prezime"));
        rezervacija.setIme(rs.getString("ime"));
        rezervacija.setCenaNaVece(rs.getDouble("cenaNaVece"));
        rezervacija.setVrstaKartice(rs.getString("vrstaKartice"));
        rezervacija.setBrKartice(rs.getInt("brKartice"));
        return rezervacija;
    }
    
}
