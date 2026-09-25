package java_keywords;

public class DemoStatic {

	public static void main(String[] args) {
		// How to Access Non-static Member Inside Static Method
		System.out.println("This is Begnning");

      Demo2.show();
	}

}
class Demo2{
	
	int number = 200;
	
	static void show() {
		Demo2 d2 = new Demo2();
		System.out.println(d2.number);
	
	}
}