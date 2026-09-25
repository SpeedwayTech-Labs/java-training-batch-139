package oops_concepts;

public class Demo_SingleInheritance {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		SavingAccount sa = new SavingAccount();
		sa.showBank();
		sa.showAccountType();
		

	}

}
// single inheritance
// parent class
class Bank{
	
	String bankName = "Axis Bank";  // property
	
	void showBank() { // behaviour
		System.out.println("Bank Name : "+ bankName);
	}
	
}
// Child class
class SavingAccount extends Bank{
	double intrestRate = 7.5;
	
	void showAccountType() {
		System.out.println("Account Type : Saving ");
		System.out.println("Intrest Rate : "+intrestRate+" % ");
	}
	
}