package oops_concepts;

public class SavingAcc123 implements BankAcc12{
	
	private double balance = 10000;

	@Override
	public void deposite(double amount) {
		balance += amount;
		System.out.println("Amount Deposited : "+amount+" Into Saving Account");
		
	}

	@Override
	public void withdraw(double amount) {
      if(balance >= amount) {
    	  balance -= amount;
    	  System.out.println("Amount Withdraw : "+amount+"From Saving Account");
      }else {
    	  System.out.println("Insufficient balance in Saving Account");
      }
		
	}

	@Override
	public void displayBalance() {
	System.out.println("This is your current Balance : "+balance);
		
	}

}
class CurrentAcc123 implements BankAcc12{
	
	private double balance = 100000;

	@Override
	public void deposite(double amount) {
		balance += amount;
		System.out.println("Amount Deposited : "+amount+" Into Current Account");
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance >= amount) {
	    	  balance -= amount;
	    	  System.out.println("Amount Withdraw : "+amount+"From Current Account");
	      }else {
	    	  System.out.println("Insufficient balance in Current Account");
	      }
		
	}

	@Override
	public void displayBalance() {
		
		System.out.println("This is your current Balance : "+balance);
	}
	
}