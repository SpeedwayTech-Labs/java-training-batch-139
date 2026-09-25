package Interview;

public class DemoReverseSpecificWord {

	public static void main(String[] args) {
		
		String input = "This is Banglore" ;
		//ouput = This is erolgnaB
		String[] words = input.split(" ");
		//This
		// is
		// Banglore
		
		String output ="";
		
		for(String word : words) {
			
			if(word.equals("Banglore")) {
				String rev ="";
				for(int i = word.length()-1 ;i>=0 ; i--) {
					rev +=word.charAt(i);
				}
				output+=rev+" ";
			}else {
				output += word+" ";
			}
		}
		System.out.println(output);
		

	}

}
