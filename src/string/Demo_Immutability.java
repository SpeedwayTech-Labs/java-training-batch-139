package string;

public class Demo_Immutability {

	public static void main(String[] args) {
		
		String str = "This is Pune";
		System.out.println(str);
		str=str.concat(" Wel-Come !");
	    System.out.println(str);
	    
	    
	    String str1 = "Mumbai"; // SCP
	    String str2 = "Mumbai";  // refer t0 str1
	    String str3 = new String("Mumbai");  // Heap
	    
	    System.out.println(str1 == str2 ); // T
	    System.out.println(str1 == str3); // f
	    System.out.println(str2.equals(str3)); // T

	}

}
