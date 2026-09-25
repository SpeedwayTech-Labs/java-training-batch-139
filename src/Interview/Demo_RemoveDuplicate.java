package Interview;

public class Demo_RemoveDuplicate {

	public static void main(String[] args) {
		
		String input = "programming";
		// output : progamin
		
		String output =  "";
		
		for(int i = 0 ; i< input.length();i++) {
			char ch = input.charAt(i);
			
			if(output.indexOf(ch) == -1) {
				 
				output += ch;
			}
		}
		System.out.println("Removed Duplicate Character : "+output);

	}

}
