package constructor;

public class DemoConst2 {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Student s1 = new Student();
		
		GenZ z1 = new GenZ();

	}

}
class Student{
	
	Student(){
		
		System.out.println("This is Student class");
	}
}
class GenZ{
	
	{
		System.out.println("This is GenZ class ");
	}
}