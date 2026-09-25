package oops_concepts;

public class Demo_Class {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Car c1 = new Car();  // this is car class object create 
		c1.brand="TATA Motors";
		c1.price=50000;
		c1.showDetails();
		
		Car c2 = new Car();  // this is car class object create 
		c2.brand="BMW";
		c2.price=100000;
		c2.showDetails();
		
		
		Prity p1 = new Prity();
		p1.city="Delhi";
		p1.cityID=101;
		p1.displayCity();
		
		Prity p2 = new Prity();
		p2.city="Pune";
		p2.cityID=102;
		p2.displayCity();

	}

}
class Car{
	
	String brand;
	int price;
	
	void showDetails() {
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
	}
}

class Prity{
	String city ;
	int cityID;
	
	void displayCity() {
		System.out.println("City Name :"+city);
		System.out.println("City ID : "+cityID);
	}
}