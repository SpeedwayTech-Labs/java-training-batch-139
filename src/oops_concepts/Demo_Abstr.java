package oops_concepts;

public class Demo_Abstr {

	public static void main(String[] args) {
		BankAcc12 saving = new SavingAcc123();
		saving.deposite(2000);
		saving.displayBalance();
		saving.withdraw(4000);
		saving.displayBalance();
		saving.withdraw(9000);
		saving.displayBalance();
		
		System.out.println("\n");
		BankAcc12 current = new CurrentAcc123() ;
		
		current.deposite(5000);
		current.displayBalance();
		current.withdraw(10000);
		current.displayBalance();	
		}
	}

