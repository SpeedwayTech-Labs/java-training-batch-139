package method;

public class DemoMethod2 {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Demo d1 = new Demo();
		d1.greet();

		Demo2 d2 = new Demo2();
		d2.greet2(" Abhijeet ");
	}

}
class Demo{
	void greet() {
		System.out.println("Welcome to Java");
	}
}
class Demo2{
	void greet2(String name) {
		System.out.println("Wel-Come "+name);
	}
}