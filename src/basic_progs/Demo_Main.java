package basic_progs;

public class Demo_Main {

	public static void main(String[] args) {
	
		System.out.print("  This is SpeedwayTech   ");
		System.out.println("This is Beginning");
		
	
		
		Two t2 = new Two();
		t2.banglore();
		
		Three t3 = new Three();
		t3.chennai();
		
		Four f4 = new Four();
		f4.pune();
		
		Five f5 = new Five();
		f5.mumbai();
		
		
		MyClass my = new MyClass();
		my.sujeet();

	}

}
class Two{
	
	void banglore() {
		System.out.println("This is Banglore");
	}
}
class Three{
	void chennai() {
		System.out.println("This is Chennai");
	}
}
class Four{
	void pune() {
		System.out.println("This is Pune");
	}
}
class Five{
	void mumbai() {
		System.out.println("This is Mumbai");
	}
}
class MyClass{
	void sujeet() {
		System.out.println("This is Sujeet Class");
	}
}