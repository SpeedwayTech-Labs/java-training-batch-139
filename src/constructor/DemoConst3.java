package constructor;

public class DemoConst3 {

	public static void main(String[] args) {
	
		Std s1 = new Std();
		s1.name="Sujeet";
		s1.age=33;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		Std2 s2 = new Std2();
		System.out.println(s2.name);
		System.out.println(s2.age);
		
	}

}
// without constructor
class Std{
	
	String name;
	int age;
}
// with constructor 
class Std2{
	
	String name;
	int age;
	
	Std2(){
		name="Vijay";
		age=22;
	}
}