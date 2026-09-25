package access_modifier;

public class ProtectedDemo {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
	Son s1 = new Son();
	s1.display();
		
		//Father f1 = new Father();
		//f1.showProperty();

	}

}
// A protected memeber can be accessed by a child class through inheritance
class Father{
	
	protected String property = "Family House";
	
	protected void showProperty() {
		System.out.println("Property : "+property);
	}
}
class Son extends Father{
	public void display() {
		System.out.println("SON can access : "+property);
		showProperty();
	}
	
}