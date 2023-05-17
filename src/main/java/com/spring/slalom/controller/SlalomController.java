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
        return "listOfAllTricks";
    }


    @GetMapping("/addTrick")
    public String addTrickBlank(Model model) {
        //jeigu Model 'number' nepraeina validacijos per jį grąžinamos validacijos klaidos į View
        model.addAttribute("addTr", new Trick());
        //grąžiname JSP failą, kuris turi būti talpinamas "webapp -> WEB-INF ->  JSP" folderi
        return "addTrick";
    }


   @PostMapping("/addt")
    public String addTrick(@ModelAttribute("addTr")Trick trick,@RequestParam HashMap<String, String> inputForm, Model model){
       String 	trick_name= inputForm.get("trick_name");
        String 	trick_type= inputForm.get("trick_type");

     //   char trick_level= inputForm.get("trick_level") != null ? inputForm.get("trick_level").charAt(0):' ';
       char trick_level= inputForm.get("trick_level").charAt(0);

      //  if(inputForm.get("trick_score") != null && !inputForm.get("trick_score").isEmpty()){
            int trick_score = Integer.parseInt(inputForm.get("trick_score"));


        boolean official_score = Boolean.parseBoolean(inputForm.get("official_score"));
        String 	trick_name2= inputForm.get("trick_name2");
        String 	link= inputForm.get("link");


       trickDAO.insertEntity(new Trick(trick_name,trick_type,trick_level,trick_score,official_score,trick_name2,link));
       model.addAttribute("tricks2",trickDAO.findEntities() );
        return "listOfAllTricks";
    }

    @RequestMapping(method=RequestMethod.GET, value="/delete{id}")
    public String deleteById(@RequestParam("id") int id,Model model) {
        trickDAO.removeEntityById(id);
        model.addAttribute("tricks2", trickDAO.findEntities());
        return "listOfAllTricks";
    }

    @RequestMapping(method=RequestMethod.GET, value="/show{id}")
    public String getById(@RequestParam("id") int id,Model model){
        model.addAttribute("trick3",trickDAO.findEntityById(id));
        return "trick";
    }
    @RequestMapping(method=RequestMethod.GET, value="/update{id}")
    public String updateById(@RequestParam("id") int id,Model model){
        model.addAttribute("trick4",trickDAO.findEntityById(id));
        return "update";
    }

    @RequestMapping(method=RequestMethod.POST, value="/updateTrick")
    public String updateTrick(@ModelAttribute("trick4")Trick trick){
        trickDAO.updateEntity(trick);
        return "redirect:/show?id="+trick.getId();
    }

}
