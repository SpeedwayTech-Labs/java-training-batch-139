package array;

public class DemoArray4 {

	public static void main(String[] args) {
		
		// Integer Array
		int[] num = {10,20,30,}; 
		
		// Double Array 
		double[] salary = {2000.00, 25000.500,2000.00};
		System.out.println(salary[2]);
		
		// character Array
		char[] ch = {'A','B','C'};
		
		// String Array
		String[] str = {"Pune","Mumbai","Banglore","Chennai"}; 
		
		str[1] ="Delhi";  // arrays are mutable
		
		for(int i = 0 ; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
	}

}
