package constructor;

public class DemoConstPara {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Company c1 = new Company(101,"Rahul","Pune",20000);
		Company c2 = new Company(102,"Vijay","Pune",30000);

	}

}
class Company{
	
	Company(int id , String name ,String address,double salary){   // this is parameterized constructor
		System.out.println(id +" "+name+" "+address+" "+salary);
		
	}
}