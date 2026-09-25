package array;

public class DemoArray5 {

	public static void main(String[] args) {
		
		int[] salaries = {30000,45000,50000,35000,60000}; // store salaries
		
		for(int i = 0 ; i< salaries.length; i++) {  // visit to each element of array
		
		System.out.println("Employee " + (i + 1) +" salary : "+salaries[i]);

	}
		System.out.println("\n");
		
		String[] browsers = {"Chrome ","Firefox","Edge"};
		
		for(int i = 0 ; i<browsers.length;i++) {
			System.out.println("Running test on : "+browsers[i]);
		}
		// array is used to store test data , UN , PW , expected values , browser names
		// URLs , product names , API for Status codes
	}
}
