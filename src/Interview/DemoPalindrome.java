package Interview;

public class DemoPalindrome {

	public static void main(String[] args) {
		
		String str = "madam"; 
		
		String rev = "";
		
		for(int i = str.length()-1 ;i>=0 ; i--) {
			
			rev += str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("This is Palindrome");
		}else {
			System.out.println("This is Not Palindrome");
		}
		
		
	}

}
