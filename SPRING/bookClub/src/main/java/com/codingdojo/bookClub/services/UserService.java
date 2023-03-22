package com.codingdojo.bookClub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.codingdojo.bookClub.models.LoginUser;
import com.codingdojo.bookClub.models.User;
import com.codingdojo.bookClub.repositories.UserRepository;

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
		//add BCrypt
		String hashPW = BCrypt.hashpw(u.getPassword(), BCrypt.gensalt());
		u.setPassword(hashPW);
		return userRepository.save(u);
	}
	
	//LOGIN USER
	public User login(LoginUser l, BindingResult result) {
		Optional<User> optUser = userRepository.findByEmail(l.getEmail());
		if (optUser.isEmpty()) {
			return null;
		}
		User user = optUser.get();
		if (!BCrypt.checkpw(l.getPassword(), user.getPassword())) {
			return null;
		}
		return user;
	}
	
	//GET ONE USER BY ID
	public User findById(Long id) {
		Optional<User> potentialUser = userRepository.findById(id);
		if (potentialUser.isPresent()) {
			return potentialUser.get();
		}
		return null;
	}
}
