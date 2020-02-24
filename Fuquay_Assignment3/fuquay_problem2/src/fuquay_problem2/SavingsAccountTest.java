package fuquay_problem2;

public class SavingsAccountTest {

	public static void main(String[] args) {
	SavingsAccount saver1 = new SavingsAccount(2000.00);
	SavingsAccount saver2 = new SavingsAccount(3000.00);
	SavingsAccount.annualInterestRate =.04;
	for(int i=1; i<13; i++) {
		double newBalance =saver1.getSavingsBalance() + 
			saver1.calculateMonthlyInterest(saver1.getSavingsBalance(), 
			SavingsAccount.annualInterestRate);
		saver1.setSavingsBalance(newBalance);
		System.out.printf("Saver1 Month %d balance = %.2f\n ",i,saver1.getSavingsBalance());
	}
	for(int i=1; i<13; i++) {
		double newBalance =saver2.getSavingsBalance() + 
			saver2.calculateMonthlyInterest(saver2.getSavingsBalance(), 
			SavingsAccount.annualInterestRate);
		saver2.setSavingsBalance(newBalance);
		System.out.printf("Saver2 Month %d balance = %.2f\n ",i,saver2.getSavingsBalance());
	}
	double newInterestRate = .05;
	SavingsAccount.modifyInterestRate(newInterestRate);
	double newBalance1 =saver1.getSavingsBalance() + 
			saver1.calculateMonthlyInterest(saver1.getSavingsBalance(), 
			SavingsAccount.annualInterestRate);
	saver1.setSavingsBalance(newBalance1);
	System.out.printf("Saver1 new months balance is %.2f\n",saver1.getSavingsBalance());
	double newBalance2 =saver2.getSavingsBalance() + 
			saver2.calculateMonthlyInterest(saver2.getSavingsBalance(), 
			SavingsAccount.annualInterestRate);
	saver2.setSavingsBalance(newBalance2);
	System.out.printf("Saver2 new months balance is %.2f\n",saver2.getSavingsBalance());
	

	}

}
/*
 -write a program called SavingsAccountTest to test class SavingsAccount
-Instantiate two SavingsAccount objects, saver1, saver2 with balances of 
of $2000.00 and $3000.00, respectively.
-set aunnualInterestRate to 4%
-calculate the monthly interest for each of 12 months
-and print the monthly balances for both savers
-call modifyInterestRate
-set the annualInterestRate to 5% 
-calculate the next months interest
-print new balances for both savers.
*/