package oops_concepts;

public class Demo_Poly_Overr {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Cite c1 = new Pune();
		c1.showCity();
		Cite c2 = new Mumbai();
		c2.showCity();
		
		Cite c3 = new Banglore();
		c3.showCity();
		
		Cite c4 = new Chennai();
		c4.showCity();
		

	}

}
class Cite{
	
	void showCity() {
		System.out.println("City : Not specified");
	}
	
}
class Pune extends Cite{
	void showCity() {
		System.out.println("This is Pune");
	}
}
class Mumbai extends Cite{
	void showCity() {
		System.out.println("This is Mumbai");
	}
}
class Banglore extends Cite{
	void showCity() {
		System.out.println("This is Banglore");
	}
}
class Chennai extends Cite{
	void showCity() {
		System.out.println("This is Chennai");
	}
}