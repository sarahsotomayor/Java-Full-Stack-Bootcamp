package com.codingdojo.dojosNinjas.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.codingdojo.dojosNinjas.models.Dojo;
import com.codingdojo.dojosNinjas.services.DojoService;

@Controller
public class DojoController {
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/dojos")
	public String dojos(Model model) {
	//RETURN ALL DOJOS
		List<Dojo> allDojos = dojoService.allDojos();
	//STORE LIST IN MODEL
		model.addAttribute("allDojos", allDojos);
		return "dojos.jsp";
	}
	
	//VIEW FORM TO ADD NEW DOJO
	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("newDojo") Dojo newDojo) {
		return "dojosNew.jsp";
	}
	
	//ADD NEW DOJO
	@PostMapping("/dojos/new/create")
	public String createDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, BindingResult result)
	{
		if(result.hasErrors()) {
			return "dojosNew.jsp";
		}
		else {
			dojoService.createDojo(newDojo);
			return "redirect:/dojos";
		}
	}
	
	//VIEW DOJO
	@GetMapping("/dojos/{dojoId}")
	public String viewDojo(@PathVariable("dojoId") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojosViewDojoNinjas.jsp";
	}
}
