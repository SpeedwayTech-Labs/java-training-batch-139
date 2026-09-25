package access_modifier;

public class PublicDemo {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.showCity();		

	}

}

class Employee{
	
	public String city ="This is Pune"; // variable public 
	
	public void showCity() {  // Method is public 
		System.out.println(city);
	}
}

// public : accessible from everywhere
// private : accessible only inside the same class
// protected: accessible in the same package and in child classes
// default : accessible only inside the same package






