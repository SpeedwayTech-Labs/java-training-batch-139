package java_keywords;

public class Demo_Super_This {

	public static void main(String[] args) {
	   System.out.println("This is Beginning");
	   
	   Child4 c4 = new Child4();
	   c4.display();

	}

}
class Parent4{
	String name = "Vijay";
	
	void show() {
		System.out.println("This is Parent Method");
	}
}
class Child4 extends Parent4{
	String name = "Rahul";
	
	void show() {
		System.out.println("This is Child Method");
		
	}
	void display() {
		System.out.println(this.name);
		System.out.println(super.name);
		
		this.show();
		super.show();
		
	}
}