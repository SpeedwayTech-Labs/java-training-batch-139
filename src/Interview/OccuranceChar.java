package Interview;

public class OccuranceChar {

	public static void main(String[] args) {
		
		String input = "aaaabbbcc";
		//output : a3b2c2
		
		String output = "";
		
		int count = 1;
		
		for(int i = 1 ; i<input.length(); i++ ) {
			// condition 1  current char == previous char
		if(input.charAt(i) == input.charAt(i-1)) {
			count++;
			// condition 2 current char != previous char
		}else {
				output += input.charAt(i-1)+String.valueOf(count);
				count = 1;
			}
		}
		
		output += input.charAt(input.length()-1)+String.valueOf(count);
		System.out.println(output);
		}
	

	}


