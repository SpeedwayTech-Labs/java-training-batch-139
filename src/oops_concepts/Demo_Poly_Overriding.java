package oops_concepts;

public class Demo_Poly_Overriding {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		AxisBank ab = new AxisSavingAcc();
		ab.showAccountType();
		ab.showBalance();
		
		AxisBank ab2 = new AxisCurrentAcc();
		ab2.showAccountType();
		ab2.showBalance();

	}

}
class AxisBank{
	
	double balance = 30000;
	
	void showAccountType() {
		System.out.println("Account Type : General");
	}
	void showBalance() {
		System.out.println("Balance : "+balance);
	}
}
class AxisSavingAcc extends AxisBank{
	
	void showAccountType() {
		System.out.println("Account Type : Axis Bank Saving Account");
	}
	
}
class AxisCurrentAcc extends AxisBank{
	void showAccountType() {
		System.out.println("Account Type : Axis Bak Current Account");
	}
}