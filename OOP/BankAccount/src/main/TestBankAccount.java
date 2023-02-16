package main;

public class TestBankAccount {

    public static void main(String[] args) {
    	
    	BankAccount myAccount = new BankAccount(0.00, 0.00);
    
    
    	myAccount.depositCheckings(100);
    	myAccount.depositSavings(450);
    	
    	myAccount.withdrawalSavings(50);
    	myAccount.withdrawalCheckings(20);
    	
    	System.out.println("Total Checking Balance: $" + myAccount.getCheckingBalance());
    	System.out.println("Total Savings Balance: $" + myAccount.getSavingsBalance());
    	
    }

}
