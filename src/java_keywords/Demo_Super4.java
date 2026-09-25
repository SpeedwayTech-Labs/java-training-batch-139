package java_keywords;

public class Demo_Super4 {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Child3 c3 = new Child3();

	}

}
class Parent3{
	Parent3(String name){
		System.out.println("Parent : "+name);
	}
}
class Child3 extends Parent3{
	
	Child3(){
		
		super("Vijay");
		System.out.println("This is Child Class Constructor");
		
	}
	
}