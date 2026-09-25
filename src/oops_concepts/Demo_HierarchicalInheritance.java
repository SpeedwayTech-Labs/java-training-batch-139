package oops_concepts;

public class Demo_HierarchicalInheritance {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		SavingAcc sa = new SavingAcc();
		sa.showBank();
		sa.showAcc();
		
		CurrentAcc ca = new CurrentAcc();
		ca.showBank();
		ca.showAccType();
		
		

	}

}

// parent class
class Banking{
	
	String BankName ="SBI Bank";
	void showBank() {
		System.out.println("This is : "+BankName);
	}
}
// child -1 
class SavingAcc extends Banking{
	
	double balance = 30000;
    void showAcc() {
    	System.out.println("This is my Saving Account");
    	System.out.println("This is Balance of Saving Acc : "+balance);
    }
	
}
// child -2
class CurrentAcc extends Banking{
	
	double balance = 60000;
	void showAccType() {
		System.out.println("This is my Current Account");
		System.out.println("This is Current Acc Balance : "+balance);
	}
}