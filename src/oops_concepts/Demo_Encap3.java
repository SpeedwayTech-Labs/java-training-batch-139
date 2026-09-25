package oops_concepts;

public class Demo_Encap3 {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		City c1 = new City("Pune",70000);
		c1.displayCityInfo();
		
		
		City c2 = new City("Mumbai",80000);
		c2.displayCityInfo();
		
		
		City c3 = new City("Banglore",60000);
		c3.displayCityInfo();
		
		c2.setPopulation(85000);
		System.out.println("Updated Population of : "+c2.getCityName()+" : "+c2.getPopulation());

	}

}
class City{
	
	private String cityName;
	private int population;
	
	public City(String cityName , int population) {
		this.cityName=cityName;
		this.population=population;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	public void displayCityInfo() {
		System.out.println("City Name : "+cityName+" , Population : "+population);
	}
	
}