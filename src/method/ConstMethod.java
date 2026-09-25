package method;

public class ConstMethod {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		BankAccount BA = new BankAccount("Rahul",10000);
		BA.displayAccInfo();
		BA.deposit(5000);
		BA.displayAccInfo();
		BA.withdraw(2000);
		BA.displayAccInfo();
		System.out.println("\n =================");
		BankAccount BA2 = new BankAccount("Narayan",20000);
		BA2.displayAccInfo();
		BA2.deposit(20000);
		BA2.displayAccInfo();
		BA2.withdraw(5000);
		BA2.displayAccInfo();
		
		

	}

}
class BankAccount{
	String name;
	double balance;
	
	BankAccount(String name , double balance){
		this.name=name;
		this.balance=balance;
	}
	void deposit(double amount) {
		balance = balance + amount;
	}
	void withdraw(double amount) {
		balance = balance - amount;
	}
	void displayAccInfo() {
		System.out.println("Account Holder : "+name);
		System.out.println("Balance : "+balance);
	}
}