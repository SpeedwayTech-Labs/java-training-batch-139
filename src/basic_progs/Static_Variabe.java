package basic_progs;

public class Static_Variabe {

	
	static int a = 20 ;
	
	static int b = 20 ;
	
	static int c = a + b;
	
	public static void main(String[] args) {
	
		System.out.println("This is addition of A and B :"+Static_Variabe.c);
		
		System.out.println(SpeedwayTech.str);

	}

}
class SpeedwayTech{
	
	static String str = "This is Banglore";
	
	
	
}