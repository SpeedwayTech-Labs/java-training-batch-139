package control_statement;

public class IfExample3 {

	public static void main(String[] args) {
		
		int balance = 5000;
		
		int withdrawAmount = 6000;
		
		if(balance >= withdrawAmount) {
			
			System.out.println("Money Withdraw successful");
			
		}else {
			
			System.out.println("Insufficient Balance");
		}

	}

}
