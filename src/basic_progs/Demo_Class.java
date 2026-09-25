package basic_progs;

public class Demo_Class {
	
	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		int a = 100 , b = 300;
		System.out.println(a+" "+b);
		
		String name = " Sujeet ";
		System.out.println(name);
		
		Ind i1 = new Ind();
		i1.show();
		
		Pune p1 = new Pune();
		p1.display();
	System.out.println(p1.add(20, 40));
	
	Data d1 = new Data();
    System.out.println(d1.name="Sujeet");
    System.out.println(d1.address="Pune");
    System.out.println(d1.id=124);
	
	
		
		
	}

}
class Ind{
	
	public void show() {
		System.out.println("This is Banglore");
	}
}
class Pune{
	public void display() {
		System.out.println("This is Pune");
	}
	     int add(int a , int b) {
		return a + b ;
		
	}
}
class Data {
	int id = 100;
	String name = "Abhijeet";
	String address = " Pune";
}