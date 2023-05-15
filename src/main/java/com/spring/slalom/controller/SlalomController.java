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

import java.util.HashMap;
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

    @GetMapping("/addTrick")
    public String addTrick(@RequestParam HashMap<String, String> inputForm){
        String 	trick_name= inputForm.get("trick_name");
        String 	trick_type= inputForm.get("trick_type");
        char trick_level= inputForm.get("trick_level").charAt(0);
        int trick_score = Integer.parseInt(inputForm.get("trick_score"));
        boolean official_score = Boolean.parseBoolean(inputForm.get("official_score"));
        String 	trick_name2= inputForm.get("trick_name2");
        String 	link= inputForm.get("link");


        trickDAO.insertEntity(new Trick(trick_name,trick_type,trick_level,trick_score,official_score,trick_name2,link));

        return "listOfAllTricks3";
    }


}
