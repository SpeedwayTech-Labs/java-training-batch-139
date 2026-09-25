package constructor;

public class Demo_Const4 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		India i1 = new India();

	}

}
class Employee{
	
	int id ;
	String name ;
	{
		System.out.println(id);
		System.out.println(name);
	}
}
class India{
	India(){
		System.out.println("This is Banglore");
		System.out.println("This is Chennai");
		System.out.println("This is Pune");
		System.out.println("This is Mumbai");
	}
}