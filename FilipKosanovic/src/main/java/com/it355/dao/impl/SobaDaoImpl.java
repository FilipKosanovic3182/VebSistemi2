/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dao.impl;

import com.it355.dao.SobaDao;
import com.it355.mapper.SobaMapper;
import com.it355.model.Soba;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Filip Wolve
 */
public class SobaDaoImpl implements SobaDao{
    private JdbcTemplate jdbcTemplate; 
    @SuppressWarnings("unused") 
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource; 
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override 
    public int getCount() { 
        String sql = "SELECT COUNT(*) FROM soba"; 
        int count = jdbcTemplate.queryForObject(sql, Integer.class); 
        return count; 
    }

    @Override
    public List<Soba> getAllSobe() {
        String sql= "SELECT * FROM soba"; 
        List<Soba> sobe= jdbcTemplate.query(sql, new SobaMapper()); 
        return sobe; 
    }

    @Override
    @Transactional
    public boolean addSoba(Soba soba) {
        String sql = "INSERT INTO soba " + "(id, brKreveta, velicina, kupatilo, tv, klima, cena) VALUES (?, ?, ?, ?, ?, ?, ?)"; 
        jdbcTemplate.update(sql, new Object[] {
            soba.getId(), 
            soba.getBrKreveta(), 
            soba.getVelicina(),
            soba.getKupatilo(),
            soba.getTv(),
            soba.getKlima(),
            soba.getCena()
        });
        return true; 
    }

    @Override
    public List<Soba> getSobaByBeds(int numberOfBeds) {
        String sql= "SELECT * FROM soba WHERE brKreveta =" + numberOfBeds; 
        List<Soba> sobe= jdbcTemplate.query(sql, new SobaMapper()); 
        return sobe; 
    }

}