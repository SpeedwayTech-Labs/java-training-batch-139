package string;

public class DemoAllString {

	public static void main(String[] args) {
		// String ----> immutable
		String str = "Java";  // created a string object ---> SCP
		str.concat(" Selenium");
		System.out.println(str);
		
		// StringBuffer ---> Mutable
		// StringBuffer is synchronized
		
		StringBuffer sb = new StringBuffer("Java");  // created 
		sb.append(" Selenium");
		System.out.println(sb);
		
		// StringBuilder ----> Mutable
		// StringBuilder ---> non-synchronized
		StringBuilder sb1 = new StringBuilder("Java"); // created
		sb1.append(" Selenium");
		System.out.println(sb1);
		
		
		

	}

}
