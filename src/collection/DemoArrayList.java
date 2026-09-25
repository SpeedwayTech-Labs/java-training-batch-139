package collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {

		List<String> city = new ArrayList<>();
		// List ----> Interface ------> ArrayList----> class
		
		city.add("Pune");
		city.add("Mumbai");
		city.add("Banglore");
		city.add("Chennai");
		
		System.out.println("List of City : "+city);
		
		// access only one element for arraylist
		System.out.println("Access Only One Element : "+city.get(2));
		
		// i want to add one more 
		city.add("GOA");
		System.out.println("List of City : "+city);
		
		// i want to add one more same element like duplicate 
		city.add("Pune");
		System.out.println("List of City : "+city);
		
		// i want to remove element
		city.remove(0);
		System.out.println("Removed element on 0 index : "+city);
		
		// i want to add element on 2nd position
		city.add(2,"Delhi");
		System.out.println(city);
		city.set(3, "Hyd");
		System.out.println(city);
		
		city.set(0,"Pune");  // by using set we can replace array list element
		System.out.println(city);
		
	
		
		System.out.println(city.get(3));
		
		System.out.println("===== Iterating all city =====");
		for(String ct : city) {
			System.out.println(ct+" ");
		}

	}

}
