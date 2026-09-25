package ExceptionHandling;

public class DemoException3 {

	public static void main(String[] args) {

		try {
			int result = 10 / 0 ;
			
			System.out.println(result);
		}
		catch(Exception e ) {
			System.out.println( e );
		}
		finally {
			System.out.println("This is Final block");
			System.out.println("This block always get execute");
		}
		
	// final ----> keyword var , class , method 
	// finally ----> block  ----> clep up
	// finalize() ----> method	

	}

}
