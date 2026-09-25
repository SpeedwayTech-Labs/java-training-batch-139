package constructor;

public class Demo_Const5 {

	public static void main(String[] args) {
		System.out.println("This is Bgeinning");
		
		City2 pune = new City2("Pune",70000);
		City2 banglore = new City2("Banglore",80000);
		pune.displayInfo();
		banglore.displayInfo();

	}

}
class City2{
	
	String cityName;
	int population;
	
	City2(String name , int pop){
		cityName = name;
		population =pop;
	}
	void displayInfo() {
		System.out.println("City Name : "+cityName);
		System.out.println("Population : "+population);
	}
	
}