package demo_pack;

import demo_pack2.Five;

public class One {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		Two t2 = new Two();
		t2.banglore();
		
		Three t3 = new Three();
		t3.chennai();
		t3.pune();
		
		Four f4 = new Four();
		f4.mumbai();
		f4.goa();
		
		Five f5 = new Five();
		f5.USA();

	}

}
class Two{
	public void banglore() {
		System.out.println("This is Banglore");
	}
}
class Three{
	public void chennai() {
		System.out.println("This is Chennai");
	}
	public void pune() {
		System.out.println("This is Pune");
	}
}