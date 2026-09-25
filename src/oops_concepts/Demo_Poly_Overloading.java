package oops_concepts;

public class Demo_Poly_Overloading {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		DepositeAccount da = new DepositeAccount();
		da.deposite(5000);
		da.deposite(7000,"UPI");
		da.deposite(2000, "ATM Machine");
		da.deposite(4000,"Internet Banking");

	}

}
class DepositeAccount{
	
	private double balance = 30000;
	
	void deposite(double amount) {
		balance += amount;
		System.out.println("Cash Deposite : "+amount);
		System.out.println("Balance is : "+balance);
		}
	void deposite(double amount , String mode) {
		balance += amount;
		System.out.println(mode+" payment deposit :"+amount);
		System.out.println("Blance : "+balance);
	}
	}
