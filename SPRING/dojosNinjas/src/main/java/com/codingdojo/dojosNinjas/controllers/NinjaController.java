package com.codingdojo.dojosNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.codingdojo.dojosNinjas.models.Ninja;
import com.codingdojo.dojosNinjas.services.DojoService;
import com.codingdojo.dojosNinjas.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	//VIEW FORM TO ADD NEW NINJA
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("newNinja") Ninja newNinja, Model model) {
		model.addAttribute("allDojos", dojoService.allDojos());
		return "ninjasNew.jsp";
	}
	
	//ADD NEW NINJA
	@PostMapping("/ninjas/new/create")
	public String createNinja(@Valid @ModelAttribute("newNinja") Ninja newNinja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninjasNew.jsp";
		}
		else {
			ninjaService.createNinja(newNinja);
			return "redirect:/dojos/" + newNinja.getDojo().getId();
		}
	}	
	
}
