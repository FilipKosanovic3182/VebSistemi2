/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.filipkosanovic;

import com.it355.dodaj.SobaDodaj;
import com.it355.model.Soba;
import com.it355.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Filip Wolve
 */
@Controller
public class SobaController {
    
    @Autowired 
    private SobaDodaj sobaDodaj;

    
    @RequestMapping( value ="/dodajSobu", method = RequestMethod.GET)
    public ModelAndView formaSoba(){
        System.out.println("Dodajemo sobu!");
        sobaDodaj.addSoba();
        return new ModelAndView("form_dodavanje_soba", "command", new Soba());
    }
    
    @RequestMapping(value = "/addRoom", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute Soba soba, ModelMap model) {
        System.out.println("Sad cemo da prikazemo dodatu sobu!");
        model.addAttribute("brKreveta", soba.getBrKreveta());
        model.addAttribute("velicina", soba.getVelicina());
        model.addAttribute("kupatilo", soba.getKupatilo());
        model.addAttribute("tv", soba.getTv());
        model.addAttribute("klima", soba.getKlima());
        model.addAttribute("cena", soba.getCena());
        sobaDodaj.addSoba();
        return "prikazDodateSobe";
    }
    
}
