package access_modifier;

public class Demo_Private {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		ExamplePrivate ep = new ExamplePrivate();
		ep.accessCity();

	}

}
class ExamplePrivate{
	
	private String city = "This is Pune";
	
	private void displayCity() {
		System.out.println(city);
	}
	void accessCity() {
		displayCity();  // 
	}
}