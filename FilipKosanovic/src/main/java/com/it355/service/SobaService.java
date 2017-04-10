/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service;

import com.it355.model.Soba;
import java.util.List;

/**
 *
 * @author Filip Wolve
 */
public interface SobaService {
    public int getCount();
    public List<Soba> getAllSobe();
    public boolean addSoba(Soba soba);
    public List<Soba> getSobaByBeds(int numberOfBeds);
}
