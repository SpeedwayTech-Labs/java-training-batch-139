package access_modifier;

public class Demo_Default {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		DefaultExample de = new DefaultExample();
		de.displayCity();

	}

}
class DefaultExample{
	
	String city = "This is Banglore";
	
	void displayCity() {
		System.out.println(city);
	}
}