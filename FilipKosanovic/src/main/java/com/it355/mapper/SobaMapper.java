/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.mapper;

import com.it355.model.Soba;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


/**
 *
 * @author Filip Wolve
 */
public class SobaMapper implements RowMapper<Soba>{
    @Override 
    public Soba mapRow(ResultSet rs, int arg1) throws SQLException { 
        Soba soba=new Soba(); 
        soba.setId(rs.getInt("id")); 
        soba.setBrKreveta(rs.getInt("brKreveta"));
        soba.setVelicina(rs.getInt("velicina"));
        soba.setKupatilo(rs.getBoolean("kupatilo")); 
        soba.setTv(rs.getBoolean("tv"));
        soba.setKlima(rs.getBoolean("klima"));
        soba.setCena(rs.getDouble("cena"));
        return soba;
    }
}