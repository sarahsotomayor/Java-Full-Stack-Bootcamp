package com.codingdojo.loginRegistration.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.loginRegistration.models.LoginUser;
import com.codingdojo.loginRegistration.models.User;
import com.codingdojo.loginRegistration.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//CREATE USER
	public User createUser(User u, BindingResult result) {
		//check if passwords match in registration
		if (!u.getConfirmPassword().equals(u.getPassword())) {
			result.rejectValue("confirmPassword", null, "Passwords do not match");
		}
		//checks for other errors
		if (result.hasErrors()) {
			return null;
		}
		return userRepository.save(u);
	}
	
	//LOGIN USER
	public User login(LoginUser l, BindingResult result) {
		Optional<User> optUser = userRepository.findByEmail(l.getEmail());
		if (optUser.isEmpty()) {
			return null;
		}
		User user = optUser.get();
		if (!user.getPassword().equals(l.getPassword())) {
			return null;
		}
		return user;
	}
	
	//GET ONE USER BY ID
	public User findById(Long id) {
		Optional<User> optUser = userRepository.findById(id);
		if (optUser.isEmpty()) {
			return null;
		}
		return optUser.get();
	}
}
