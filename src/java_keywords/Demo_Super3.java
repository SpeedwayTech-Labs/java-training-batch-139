package java_keywords;

public class Demo_Super3 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Child2 c2 = new Child2();

	}

}
class Parent2{
	
	Parent2(){   // this is constructor
		System.out.println("This is Delhi");
	}
	
}
class Child2 extends Parent2{
	
	Child2(){  // this is constructor
		super();
		System.out.println("This is GOA");
	}
}