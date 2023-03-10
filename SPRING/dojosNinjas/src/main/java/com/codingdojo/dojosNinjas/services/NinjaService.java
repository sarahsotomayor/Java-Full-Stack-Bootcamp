package com.codingdojo.dojosNinjas.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.dojosNinjas.models.Ninja;
import com.codingdojo.dojosNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {


	@Autowired
	private NinjaRepository ninjaRepository;
	
	//return all ninja
	public List<Ninja>allNinjas(){
		return ninjaRepository.findAll();
	}
	
	//create new ninja
	public Ninja createNinja(Ninja b) {
		return ninjaRepository.save(b);
	}
}
