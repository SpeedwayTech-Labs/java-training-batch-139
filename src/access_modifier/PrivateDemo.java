package access_modifier;

public class PrivateDemo {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		BankAccount ba = new BankAccount();
		ba.displayAccount();

	}

}
// A private member can be accessed only inside the same class 
class BankAccount{
	
	private int balance = 10000; // variable
	
	private void showBalance() {  // method 
		System.out.println("Balance : "+balance);
	}
	public void displayAccount() {
		showBalance();
	}
}