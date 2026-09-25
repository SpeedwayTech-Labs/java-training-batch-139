package method;

public class DemoMethod {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Calculator c1 = new Calculator();
	
		System.out.println("Addition of A and B : "+c1.add(20, 40));
		System.out.println("Addition of A and B : "+c1.add(40, 50));
		System.out.println("Addition of A and B : "+c1.add(100,200));
		
		City c2 = new City();
		c2.banglore();
		c2.chennai();
		c2.pune();
		c2.mumbai();
		

	}

}
class Calculator{
  
	int add(int a , int b) {
		return a + b;
	}
}
class City{
	public void banglore() {
		System.out.println("This is Banglore");
	}
	public void chennai() {
		System.out.println("This is Chennai");
	}
	public void pune() {
		System.out.println("This is Pune");
	}
	public void mumbai() {
		System.out.println("This is Mumbai");
	}
}