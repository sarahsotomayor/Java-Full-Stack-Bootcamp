package com.codingdojo.expenses.controllers;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingdojo.expenses.models.Expense;
import com.codingdojo.expenses.services.ExpenseService;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "redirect:/expenses";
	}
	
	@Autowired 
	private ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public String expenseDashboard(@ModelAttribute("newExpense") Expense newExpense, Model model) {
		//return all expenses from DB
		List<Expense> allExpenses = expenseService.allExpenses();
		//store list in model
		model.addAttribute("allExpenses", allExpenses);
		return "expenseDashboard.jsp";
	}
	
	@PostMapping("/expenses/new")
	public String create(@Valid @ModelAttribute("newExpense") Expense newExpense, BindingResult result)
	//line 39 is the same as doing line 29 & 33
	{
		if(result.hasErrors()) {
			return "expenseDashboard.jsp";
		}
		else {
			expenseService.createExpense(newExpense);
			return "redirect:/expenses";
		}
	}
	
	@RequestMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		//Expense expense = expenseService.findExpense(id); (not needed with shorthand)
		model.addAttribute("expense", expenseService.findExpense(id));
		return "expenseEdit.jsp";
	}
	
	@PutMapping("/expenses/{id}")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result)
	{
		if(result.hasErrors()) {
			return "expenseEdit.jsp";
		}
		else {
			expenseService.update(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("expenses/{id}/delete")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}
	
	@GetMapping("expenses/view/{id}")
	public String viewExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "expenseDetails.jsp";
	}
}
