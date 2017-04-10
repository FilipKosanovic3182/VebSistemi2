/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service.impl;

import com.it355.dao.SobaDao;
import com.it355.model.Soba;
import com.it355.service.SobaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Filip Wolve
 */
public class SobaServiceImpl implements SobaService{
    @Autowired
    SobaDao sobaDao;
    @Override
    public int getCount() {
        return sobaDao.getCount();
    }

    @Override
    public List<Soba> getAllSobe() {
        return sobaDao.getAllSobe();
    }

    @Override
    public boolean addSoba(Soba soba) {
        return sobaDao.addSoba(soba);
    }

    @Override
    public List<Soba> getSobaByBeds(int numberOfBeds) {
        return sobaDao.getSobaByBeds(numberOfBeds);
    }
    
}
