package com.codingdojo.bookClub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.codingdojo.bookClub.models.LoginUser;
import com.codingdojo.bookClub.models.User;
import com.codingdojo.bookClub.services.BookService;
import com.codingdojo.bookClub.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private BookService bookService;

	//LOGIN & REGISTRATION PAGE
	@GetMapping("/")
	public String logreg(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "logReg.jsp";
	}
	
	
	//REGISTER 
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
		//run register method to then check for errors
		//you can call it anything as long as it is not the same as above
			//User user  not same as User newUser
		User newUser = userService.createUser(user, result);
		
		//if new user is null(has errors), re-renders logReg template
		if(newUser == null) {
			//must include login user attribute because there is a login user form on that page
			model.addAttribute("loginUser", new LoginUser());
			return "logReg.jsp";
		}
		
		//add user to DB and login using session
		session.setAttribute("userId", newUser.getId());
		return "redirect:/books";
	}
	
	
	//LOGIN
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser, BindingResult result, Model model, HttpSession session) {
		//run login method
		User user = userService.login(loginUser, result);
		if (user == null) {
			model.addAttribute("user", new User());
			return "logReg.jsp";
		}
		session.setAttribute("userId", user.getId());
		return "redirect:/books";
	}
	
	
	//DASHBOARD
	@GetMapping("/books")
	public String dashboard(Model model, HttpSession session, RedirectAttributes redirect) {
		//add session check so someone cannot use routes if not logged in
		if (session.getAttribute("userId") == null) {
			//add flash messaging
			redirect.addFlashAttribute("error", "You must be logged in to do that.");
			return "redirect:/";
		}
		Long id = (Long) session.getAttribute("userId");
		User loggedUser = userService.findById(id);
		model.addAttribute("userLoggedIn", loggedUser);
		
		//returning all books from DB
		model.addAttribute("allBooks", bookService.allBooks());
		return "books.jsp";
	}
	
	
	//LOGOUT
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userId", null);
		// you can also do the following instead: session.invalidate();
		return "redirect:/";
	}
	
}
