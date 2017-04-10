/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.filipkosanovic;

import com.it355.dao.RezervacijaDao;
import com.it355.dao.SobaDao;
import com.it355.dodaj.SobaDodaj;
import com.it355.model.Soba;
import com.it355.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Filip Wolve
 */
@Controller
public class SobaController {
    
    @Autowired
    private SobaDao sobaDao;
    
    @Autowired
    private RezervacijaDao rezervacijaDao;
    
    @Autowired 
    private SobaDodaj sobaDodaj;
    

    @RequestMapping( value ="/dodajRezervaciju", method = RequestMethod.GET)
    public ModelAndView formRezervacijaAdd(ModelAndView model){
        model.addObject("rezervacija", new Rezervacija());
        model.setViewName("form_dodavanje_rez_Controller");
        return model;
        //return new ModelAndView("form_dodavanje_soba", "command", new Soba());
    }
    
    @RequestMapping(value = "/prikaziDodajRezervaciju", method = RequestMethod.POST)
    public ModelAndView addRezervacija(@ModelAttribute("rezervacija") Rezervacija rez, ModelAndView model) {
        model.addObject("object", rez); 
        rez.setId(rezervacijaDao.getCount()+1); 
        rezervacijaDao.addRezervacija(rez);
        model.setViewName("prikazDodateRez_Controller");
        return model;
    }
    
    
    
    @RequestMapping( value ="/dodajSobu", method = RequestMethod.GET)
    public ModelAndView formaSoba(ModelAndView model){
        System.out.println("Dodajemo sobu!");
        sobaDodaj.addSoba();
        model.addObject("soba", new Soba());
        model.setViewName("form_dodavanje_soba");
        model.addObject("command");
        return model;
        //return new ModelAndView("form_dodavanje_soba", "command", new Soba());
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
        soba.setId(sobaDao.getCount()+1);
        sobaDao.addSoba(soba);
        sobaDodaj.addSoba();
        return "prikazDodateSobe";
    }
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET) public ModelAndView defaultPage() {
        ModelAndView model = new ModelAndView(); 
        System.out.println("Ne izbacuje nista");
        model.addObject("message", "Ovo je strana kojoj svi mogu da pristupe!"); 
        model.setViewName("hello"); 
        return model;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET) public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView(); 
        model.addObject("message", "Ovo je strana za admine!"); 
        model.setViewName("admin");
        return model;
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET) 
    public ModelAndView login(@RequestParam(value = "error", required = false) 
            String error, @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView(); 
        
        if (error != null) { model.addObject("error", "Losi login podaci!"); }
        if (logout != null) { model.addObject("msg", "Izlogovani ste."); } 
        model.setViewName("login");
        return model;
    }
    @RequestMapping(value = "/403", method = RequestMethod.GET) public ModelAndView accesssDenied() {
        ModelAndView model = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
        if (!(auth instanceof AnonymousAuthenticationToken)) { 
            UserDetails userDetail = (UserDetails) auth.getPrincipal(); 
            System.out.println(userDetail);
            model.addObject("username", userDetail.getUsername());
        }
        model.setViewName("403"); return model;
    }
}
