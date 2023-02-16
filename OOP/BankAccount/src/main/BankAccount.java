package main;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	
	//static class members
	private static int numberOfAccounts = 0;
	private static double totalAmountStored = 0;
	
	//constructor
	public static double total() {
		return totalAmountStored;
	}
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numberOfAccounts++;
		totalAmountStored++;
	}
	
	//getters
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	//setters
	public void setCheckingBalance(double checkingAccount) {
		this.checkingBalance = checkingAccount;
	}
	
	public void setSavingsBalance(double savingsAccount) {
		this.savingsBalance = savingsAccount;
	}
	
	//methods to deposit
	public double depositCheckings(double amount) {
		checkingBalance += amount;
		return checkingBalance;
	}
	
	public double depositSavings(double amount) {
		savingsBalance += amount;
		return savingsBalance;
	}
	
	//methods to withdrawal
	public double withdrawalCheckings(double amount) {
		checkingBalance -= amount;
		return checkingBalance;
	}

	public double withdrawalSavings(double amount) {
		savingsBalance -= amount;
		return savingsBalance;
	}
	
}
