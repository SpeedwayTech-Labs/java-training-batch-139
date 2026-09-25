package basic_progs;

import java.util.Date;
import java.util.Scanner;

public class Demo_Scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you Name : ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter you Employee ID :");
		int id = sc.nextInt();
		System.out.println(id);
		
		// two digit addition
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int sum = 0 ;
		
		sum = num1 + num2;
		
		System.out.println("Sum of num1 and num2 : "+sum);
		
		// Date class
		Date dt = new Date();
		System.out.println(dt.toString());
		
		
		// Math
		int a = 5 ;
		
		int b = 10 ;
		
		System.out.println(Math.max(a, b));
		System.out.println("Square root of 5 : "+Math.sqrt(a));
		

	}

}
