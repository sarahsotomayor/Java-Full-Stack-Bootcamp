package com.codingdojo.expenses.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.expenses.models.Expense;
import com.codingdojo.expenses.repositories.ExpenseRepository;

@Service
public class ExpenseService {
    // adding the expense repository as a dependency
    
	//private final ExpenseRepository bookRepository;
    
    //public ExpenseService(ExpenseRepository expenseRepository) {
    //    this.expenseRepository = expenseRepository;
	
	//easier to read and quicker than above:
	@Autowired
	private ExpenseRepository expenseRepository;
	
    // returns all the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    
    // creates an expense
    public Expense createExpense(Expense b) {
        return expenseRepository.save(b);
    }
    
    //retrieves an expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    
    //updates
    public Expense update(Expense b) {
        return expenseRepository.save(b);
    }
	
	//deletes
	public void delete(Long id) {
		expenseRepository.deleteById(id);
	}
}
