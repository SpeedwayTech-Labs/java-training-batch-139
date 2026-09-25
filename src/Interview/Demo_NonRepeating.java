package Interview;

public class Demo_NonRepeating {

	public static void main(String[] args) {
		
		String input = "swiss";
		// output : w
		
		for(int i = 0 ; i<input.length();i++) {
			char ch = input.charAt(i);
			
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				
				System.out.println("First Non - Repeating char : "+ch);
				break;
			}
		}

	}

}
