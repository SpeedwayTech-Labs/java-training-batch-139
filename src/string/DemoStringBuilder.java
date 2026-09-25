package string;

public class DemoStringBuilder {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("Java"); // object get created initial value
		System.out.println(sb.getClass().getName());
		
		// 1.append
		sb.append(" Selenium");
		System.out.println(" Append : "+sb);
		
		sb.insert(5," API ");//
		System.out.println("Insert : "+sb);
		
		sb.replace(0, 3, "Python");
		System.out.println("Replace : "+sb);
		
		sb.delete(7, 11);
		System.out.println("Delete : "+sb);
		
		sb.setCharAt(0, 'J');
		System.out.println(" Set Character : "+sb);
		
		System.out.println("Character : "+sb.charAt(3));
		
		System.out.println("Length : "+sb.length());
		
		System.out.println("Index : "+sb.indexOf("Selenium"));
		
		sb.reverse();
		System.out.println("Reverse: "+sb);
		
		String str = "Automation";
		
		StringBuilder sb1 = new StringBuilder(str);
		
		sb1.reverse();
		System.out.println("Reverse  : "+sb1);
		
		
		StringBuilder sb2 = new StringBuilder("Playwright"); // HEAP
		StringBuilder sb3 = new StringBuilder("Playwright"); // HEAP
		
		System.out.println(sb2 == sb3); // ---> refer
		System.out.println(sb2.equals(sb3));  // ----> but here in .equal() is used to refer comp.
		
	}

}
