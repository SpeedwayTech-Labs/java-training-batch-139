package java_keywords;

public class DemoStaticMethod {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Calculator.add();
		
	    Demo.show(); // we are handling static variable
		
		Demo d1 = new Demo();   // we are handling non static variable
		System.out.println(d1.y);
		

	}

}
class Calculator{
	
	static void add() {
		int a = 10 ;
		int b = 20 ;
		System.out.println(a+b);
	}
}
// static variable , methods ------> class
// non static variable , methods -----> object

class Demo{
	
	static int x = 10 ;
	
	int y = 20 ;
	
	static void show() {
		System.out.println(x);
	}
}


