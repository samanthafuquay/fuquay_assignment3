package fuquay_problem2;

public class SavingsAccount {
	static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance){
		this.setSavingsBalance(savingsBalance);
	}

	public double calculateMonthlyInterest(double savingsBalance, double aunnualInterestRate) {
		double monthlyInterest =0;
		monthlyInterest = (savingsBalance * aunnualInterestRate) /12;
		return monthlyInterest;
	}
	static void modifyInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	

}
/*
 class SavingsAccount
 	- static variable annualInterestRate(stores the annual interest rate for all account holders)
 	-private instance variable savingsBalance (indicating the amount the saver currently has
 	on deposit
 	-create a constructor for SavingsAccount 
 		takes in a float called balance
 		
 	-method calculateMonthlyInterest (to calculate the monthly interest)
 		multiplying the savingsBalance by annualInterestRate divided by 12
 		add this interest to the savingsBalance
 		
 	-static method modifyInterestRate(that sets the annualInterestRate to a new value)
 	

*/
/*
Create class SavingsAccount. Use a static variable annualInterestRate to store the 
annual interest rate for all account holders. Each object of the class contains a 
private instance variable savingsBalance indicating the amount the saver currently has on 
deposit. Provide method calculateMonthlyInterest to calculate the monthly interest by 
multiplying the savingsBalance by annualInterestRate divided by 12—this interest should 
be added to savingsBalance. Provide a static method modifyInterestRate that sets the 
annualInterestRate to a new value.
Write a program called SavingsAccountTest to test class SavingsAccount. 
Instantiate two SavingsAccount objects, saver1 and saver2, with balances 
of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate 
the monthly interest for each of 12 months and print the monthly balances for both savers. 
Next, set the annualInterestRate to 5%, calculate the next month’s interest and print 
the new balances for both savers.

*/