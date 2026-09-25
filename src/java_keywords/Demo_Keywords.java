package java_keywords;

public class Demo_Keywords {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Student2 s1 = new Student2("Mumbai");
		s1.display();

	}

}
class Person{
	String city ="This is Pune and this is my City";
	
	Person(){
		System.out.println("This is Person Constructor");
	}
	void showCity() {
		System.out.println("Person City : "+city);
	}
}
class Student2 extends Person{
	String city;
	static String college ="ABC College";
	final int rollNum = 101 ;
	
	Student2(String city){
		
		super();
		
		this.city=city;
	}
	void display() {
		System.out.println("Student City : "+this.city);
		System.out.println("Parent City : "+super.city);
		System.out.println("College : "+Student2.college);
		System.out.println("Roll Number : "+rollNum);
		
		super.showCity();
	}
}