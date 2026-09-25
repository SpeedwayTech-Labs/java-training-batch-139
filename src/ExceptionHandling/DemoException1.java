package ExceptionHandling;

public class DemoException1 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		try {
			
			int div = 10/0;
			
			System.out.println(div);
		}
	    catch(ArithmeticException e) {  // Unchecked Exception
	    	System.out.println(e);
	    }
		
		String str = "This is Pune";
	
		System.out.println(str);
		System.out.println("Program to be Continue ... ");

	}
	

}
