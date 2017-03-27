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
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET) public ModelAndView defaultPage() {
        ModelAndView model = new ModelAndView(); 
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
