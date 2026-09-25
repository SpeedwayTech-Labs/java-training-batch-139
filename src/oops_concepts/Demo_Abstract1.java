package oops_concepts;

public class Demo_Abstract1 {

	public static void main(String[] args) {
	 System.out.println("This is Beginning");
	 
	 int amount = 10000;
	 
	 Payment atm = new ATMPayment();
	 atm.showPaymentInfo();
	 atm.makePayment(5000);
	 
    Payment CreditCard = new CreditCard();
    
    CreditCard.showPaymentInfo();
    CreditCard.makePayment(2000);
    
    Payment UPI = new UPIPayemnt();
    UPI.showPaymentInfo();
    UPI.makePayment(1000);
    
	}

}
abstract class Payment{
	
	abstract void makePayment(int amount) ;
		
	public void showPaymentInfo() {
		System.out.println("Processing Payment . Plz Wait.....");
	}
	}
class ATMPayment extends Payment{

	@Override
	void makePayment(int amount) {
		System.out.println("Payment of Rs ."+amount+" made by using ATM");
	}
}
class  CreditCard extends Payment{

	@Override
	void makePayment(int amount) {
		System.out.println("Payment of Rs. "+amount+" made by using CreditCard");
	}
}
class  UPIPayemnt extends Payment{

	@Override
	void makePayment(int amount) {
		System.out.println("Payment of Rs. "+amount+" made by using UPI ");
	}
}

	
	