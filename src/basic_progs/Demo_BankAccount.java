package basic_progs;

import java.util.Scanner;

public class Demo_BankAccount {
	
	// Instance Variable
	String AccountHolder;
	int accountNumber;
	double balance;
	
	// Method to set account deatils
	public void setAccountDetails(String name , int accNumber,double initialBalance) {
		AccountHolder = name;
		accountNumber = accNumber;
		balance = initialBalance;
	}
	// Method to deposit money
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited : "+amount);
	}
	// Method to withdraw money
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdraw : "+amount);
	}
	// Method to display account deatils
	public void displayAccount() {
		System.out.println("\n----- Account Details ----------");
		System.out.println(" Account Holder : "+AccountHolder);
		System.out.println(" Account Number : "+accountNumber);
		System.out.println("Balance : "+balance);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Demo_BankAccount DB = new Demo_BankAccount();
		
		System.out.println("Enter Account Holder Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Account Number : ");
		int accNumber = sc.nextInt();
		
		System.out.println("Enter Initial Balance : ");
		double initialBalance = sc.nextDouble();
		
		DB.setAccountDetails(name, accNumber, initialBalance);
		
		// deposit
		System.out.println("Enter amount to deposite : ");
		double depositeAmount = sc.nextDouble();
		DB.deposit(depositeAmount);
		
		// withdraw
		System.out.println("Enter amount to withdraw : ");
		double withdrawAmount = sc.nextDouble();
		DB.withdraw(withdrawAmount);
		
		DB.displayAccount();
		
		sc.close();

	}

}
