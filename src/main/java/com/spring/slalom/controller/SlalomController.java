package com.spring.slalom.controller;


import com.spring.slalom.model.Trick;
import com.spring.slalom.model.TrickDAO;
import com.spring.slalom.model.TrickDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@EnableAutoConfiguration

public class SlalomController {

    @Autowired
    @Qualifier("TrickDAO")
    public TrickDAO trickDAO;
    @GetMapping("/")
    public String homePage(Model model) {
    /*    List<Trick> trickList = trickDAO.findEntities();
        System.out.println("Trick sąrašas:");
        for (Trick trick : trickList) {
            System.out.println(trick.toString());
        } */  // konsolėje tikrinti
        model.addAttribute("tricks2",trickDAO.findEntities() );
        return "listOfAllTricks3";
    }

}
