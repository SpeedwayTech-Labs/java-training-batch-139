package java_keywords;

public class DemoStaticVar {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Counter c1 = new Counter();
		c1.displayCount();
		Counter c2 = new Counter();
		c2.displayCount();

	}

}
class Counter{
	
	static int count = 0 ;

	Counter(){
		count++;
	}
	void displayCount() {
		System.out.println("Count : "+count);
	}
}