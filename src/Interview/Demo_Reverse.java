package Interview;

public class Demo_Reverse {

	public static void main(String[] args) {
		
		// Method -1
		String str = "Automation";
		
		int len = str.length();
		System.out.println(len);
		char ch[]=str.toCharArray();
		
		for(int i = len-1 ; i>=0 ;i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println("\n"+" "+"Method -1 ");
		// Method -2
		
		String str2 = "Selenium";
		String reverse="";
		
		for(int i = str2.length()-1 ; i>=0 ; i--) {
			reverse += str2.charAt(i);
		}
		System.out.println("Revers String : "+reverse);
		
		

	}

}
