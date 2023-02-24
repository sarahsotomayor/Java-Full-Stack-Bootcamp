package com.codingdojo.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fruityloops.models.Fruit;

@Controller
public class FruitControllers {
    
    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Kiwi", 1.5));
        fruits.add(new Fruit("Mango", 2.0));
        fruits.add(new Fruit("Goji Berries", 4.0));
        fruits.add(new Fruit("Guava", .75));
        model.addAttribute("fruits", fruits);
        return "index.jsp";
    }
    
}
