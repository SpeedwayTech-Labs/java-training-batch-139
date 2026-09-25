package Interview;

public class DemoTogggleCase {

	public static void main(String[] args) {
		
		String input = "InTeRvieW";
		// iNtErVIEw
		
		StringBuilder output = new StringBuilder();
		for(char ch : input.toCharArray()) {
			if(Character.isUpperCase(ch)) {
			   output.append(Character.toLowerCase(ch));
			}else {
				output.append(Character.toUpperCase(ch));
			}
		}
		System.out.println("Output : "+output.toString());
		System.out.println("Input :  "+input);

	}

}
