package access_modifier;

public class DefaultDemo {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Student s1 = new Student();
		s1.displayCity();

	}

}
class Student{
	
	String city = "This is Banglore";
	
	void displayCity() {
		System.out.println("City : "+city);
	}	
}