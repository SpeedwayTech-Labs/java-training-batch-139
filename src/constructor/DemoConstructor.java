package constructor;

public class DemoConstructor {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		City c1 = new City();
		c1.show();

	}

}
class City{
	City(){  // constructor
		System.out.println("This is Banglore");
	}
	void show(){  //method
		System.out.println("This is Chennai");
	}
}