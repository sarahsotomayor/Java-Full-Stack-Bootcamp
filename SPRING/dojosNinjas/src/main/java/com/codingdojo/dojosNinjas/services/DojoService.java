package com.codingdojo.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosNinjas.models.Dojo;
import com.codingdojo.dojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepository;
	
	//return all dojos
	public List<Dojo>allDojos(){
		return dojoRepository.findAll();
	}
	
	//create new dojo
	public Dojo createDojo(Dojo b) {
		return dojoRepository.save(b);
	}
	
	//retrieves one dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo>optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
}
