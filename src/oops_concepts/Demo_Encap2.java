package oops_concepts;

public class Demo_Encap2 {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		SBIBank sb = new SBIBank(10000);
		System.out.println("Initial Balance : "+sb.getBalance());
		
		sb.deposit(5000);
		System.out.println("Current Balance : "+sb.getBalance());
		
		sb.withdraw(2000);
		System.out.println("Current Balance : "+sb.getBalance());
		
		sb.withdraw(14000);
		System.out.println("Current Balance : "+sb.getBalance());
		

	}

}
class SBIBank{
	
	private double balance;
	
	public SBIBank(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	// method to deposit
	public void deposit(double amount) {
		if(amount > 0 ) {
			balance += amount;
			System.out.println("Amount Deposited : "+amount);
				
			}else {
			System.out.println("Amount deposited should be positive");
		}
	}
		public void withdraw(double amount) {
			if(amount > 0 && amount <= balance) {
				balance -= amount;
				System.out.println("Amount withdraw : "+amount);
				
			}else {
				System.out.println("Invalid amount or insufficient balance");
			}
		}
		}
	
	
