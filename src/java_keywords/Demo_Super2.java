package java_keywords;

public class Demo_Super2 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Child1 c1 = new Child1();
		c1.display();

	}

}
class Parent1{
	 void show() {
		 System.out.println("This is Banglore");
	 }
}
class Child1 extends Parent1{
	void show() {
		System.out.println("This is Chennai");
	}
	void display() {
		show();
		super.show(); // super keyword to call parent class method
	}
}