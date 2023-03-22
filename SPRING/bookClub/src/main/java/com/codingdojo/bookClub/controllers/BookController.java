package com.codingdojo.bookClub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.bookClub.models.Book;
import com.codingdojo.bookClub.services.BookService;
import com.codingdojo.bookClub.services.UserService;

@Controller
public class BookController {

		@Autowired
		private BookService bookService;
		@Autowired
		private UserService userService;
		
		//VIEW FORM TO ADD NEW BOOK
		@GetMapping("/books/new")
		public String newBookForm(@ModelAttribute("newBook") Book newBook, HttpSession session, RedirectAttributes redirect) {
			//add session check so someone cannot use routes if not logged in
			if (session.getAttribute("userId") == null) {
				//add flash messaging
				redirect.addFlashAttribute("error", "You must be logged in to do that.");
				return "redirect:/";
			}
			return "booksNew.jsp";
		}
		
		//ADD NEW BOOK
		@PostMapping("/books/create")
		public String createBook(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result, HttpSession session) {
			if(result.hasErrors()) {
				return "booksNew.jsp";
			}
			Long userId = (Long) session.getAttribute("userId");
			newBook.setUser(userService.findById(userId));
				bookService.createBook(newBook);
				return "redirect:/books";
		}	
		
		//VIEW BOOK
		@GetMapping("/books/{id}")
		public String viewBook(@PathVariable("id") Long id, Model model, HttpSession session, RedirectAttributes redirect) {
			//add session check so someone cannot use routes if not logged in
			if (session.getAttribute("userId") == null) {
				//add flash messaging
				redirect.addFlashAttribute("error", "You must be logged in to do that.");
				return "redirect:/";
			}
			model.addAttribute("book", bookService.findBook(id));
			return "bookDetails.jsp";
		}
		
		//VIEW FORM TO EDIT BOOK
		@RequestMapping("/books/{id}/edit")
		public String edit(@PathVariable("id") Long id, Model model, HttpSession session, RedirectAttributes redirect) {
			//add session check so someone cannot use routes if not logged in
			if (session.getAttribute("userId") == null) {
				//add flash messaging
				redirect.addFlashAttribute("error", "You must be logged in to do that.");
				return "redirect:/";
			}
			model.addAttribute("book", bookService.findBook(id));
			return "bookEdit.jsp";
		}
		
		//EDIT BOOK 
		@PutMapping("/books/{id}/update")
		public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result){
			if(result.hasErrors()) {
				return "bookEdit.jsp";
			}
			bookService.update(book);
			return "redirect:/books/" + book.getId();
			
		}
		
		//DELETE BOOK 
		@GetMapping("books/{id}/delete")
		public String deleteBook(@PathVariable("id") Long id) {
			bookService.delete(id);
			return "redirect:/books";
		}
		
}
