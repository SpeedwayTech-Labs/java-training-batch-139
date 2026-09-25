package collection;

import java.util.ArrayList;

public class DemoArray {

	public static void main(String[] args) {
	
		int[] num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		System.out.println(num[4]);
		
		String[] str = new String[3];
		
		str[0] = "Pune";
		str[1] = "Mumbai";
		str[2] = "Banglore";
	    //str[3] = "Chennai";
	    
	    System.out.println(str[2]);
	    
	    ArrayList<String> city = new ArrayList<String>();
	    System.out.println(city.getClass().getName());
	    
	    city.add("Pune");
	    city.add("Mumbai");
	    city.add("Banglore");
	    city.add("Chennai");
	    
	    System.out.println(city);
	    
	    city.add("Pune"); //duplicate 
	    System.out.println(city);
	    ArrayList<Integer> number = new ArrayList<Integer>();
	    
	    number.add(10);
	    number.add(20);
	    number.add(30);
	    number.add(40);
	    number.add(20);
	    System.out.println(number);
		

	}

}
