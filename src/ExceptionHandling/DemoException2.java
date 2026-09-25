package ExceptionHandling;

public class DemoException2 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		try {
		
		int[] arr = {1,2,3,4,5}; 
		         //  0 1 2 3 4
		System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			int div = 10/0;
			System.out.println(div);
		}
	   catch(Exception e) {
		   System.out.println(e);
	   }
		int a = 10 ;
		
		int b = 20 ;
		 
		int c = a + b;
		
		System.out.println("This is Addition A and B : "+c);
		
		System.out.println("Probgram To Be Continues.....");
	}

}
