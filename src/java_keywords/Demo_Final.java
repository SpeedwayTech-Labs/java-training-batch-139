package java_keywords;

public class Demo_Final {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		//final int num = 10;    // variable
		int num=20;
		num=100;
		
		System.out.println(num);
		
		Bank b1 = new Bank();
		b1.display();
		
		Calculator1 cl = new Calculator1();
		cl.calculator();

	}

}
class Bank{
	
	final int AccNum = 10101;
	
	void display() {
		System.out.println("This is Final Account Num: "+AccNum);
	}
}
class Parent5{
	
	//final void show() {  // method as final you can not overried that method
		 void show() { 
		System.out.println("This is Banglore");
	}
	
}
class Child5 extends Parent5{
	
	void show() {
		
		System.out.println("This is Chennai");
	}
}

//final class Calculator1{
class Calculator1{
	
	void calculator() {
		System.out.println("This is Calculation class");
	}
}
class Math extends Calculator1{
	void display() {
		System.out.println("This is Math class");
	}
}