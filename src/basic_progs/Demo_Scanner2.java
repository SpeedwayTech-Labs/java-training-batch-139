package basic_progs;

import java.util.Scanner;

public class Demo_Scanner2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// take user input
		System.out.println("Enter you Name : ");
		String Name = sc.nextLine();
		
		System.out.println("Enter you Age : ");
		int Age = sc.nextInt();
		
		System.out.println("Enter you Salary : ");
		double salary = sc.nextDouble();
		
		//Display output
		System.out.println("====== \n User Deatils ====");
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
		System.out.println("Salary : "+salary);
		
		sc.close();
	}

}
// Open an account 
// Deposite Amount
// withdraw amount
// check balance
