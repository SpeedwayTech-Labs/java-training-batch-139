package string;

public class Demo_String2 {

	public static void main(String[] args) {
	
		String str1 = "Java";  // SCP
		String str2 = "Java" ;    // str2 ----> str1---> string obj
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("Selenium");  // HEAP
		String str4 = new String("Selenium");  // HEAP
		
		System.out.println(str3 == str4); // == is operator it is compare refer
		System.out.println(str3.equals(str4)); // .equals() is meant for content comp.
		
		
		

	}

}
