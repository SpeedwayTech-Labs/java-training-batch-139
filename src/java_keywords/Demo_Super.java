package java_keywords;

public class Demo_Super {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
        
		Child c1 = new Child();
		c1.display();
	}

}
// Parent class
class Parent{
	String city = "This is Pune";   // variable 
}
// child class
class Child extends Parent{
	
	String city = "This is Mumbai";
	
	void display() {   // method 
		System.out.println(city);
		System.out.println(super.city);  // super keyword use to call parent class variable
		
	}
}