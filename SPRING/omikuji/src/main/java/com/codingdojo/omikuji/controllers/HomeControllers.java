package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeControllers {
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
    
    @RequestMapping("/omikuji")
    public String form(Model model) {
        return "omikujiForm.jsp";
    }
    
    @GetMapping("/omikuji/show")
    public String show(Model model, HttpSession session) {
		String results = (String) session.getAttribute("formData");
		model.addAttribute("results", results);
		System.out.println(results);
        return "showOmikuji.jsp";
    }
    
    @PostMapping("/form")
    public String processForm(
    		@RequestParam(value="number") int number,
    		@RequestParam(value="city") String city, 
    		@RequestParam(value="name") String name, 
    		@RequestParam(value="hobby") String hobby, 
    		@RequestParam(value="livingThing") String livingThing, 
    		@RequestParam(value="compliment") String compliment, 
    		HttpSession session
    		) {
		String formData = String.format(
				"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.",
				number, city, name, hobby, livingThing, compliment);
		session.setAttribute("formData", formData);
		System.out.println(formData);
    	return "redirect:/omikuji/show";
    }
}