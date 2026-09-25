package string;

public class Demo_StringMethods2 {

	public static void main(String[] args) {
		// SEARCHING METHODS
		
		String str = "Java Programming";
		
		// conatins()
		System.out.println(str.contains("Program"));
		
		// find the first matching char
		String str2 = "banana";
		System.out.println(str2.indexOf('a'));// find the first matching character
		
		//searches forward from the given index
		System.out.println(str2.indexOf('n',3));
		
		System.out.println(str2.indexOf("na"));
		
		

	}
}
