package Interview;

public class WordCount {

	public static void main(String[] args) {

		String str = "Java is Object Oriented Language";
		String[] words=str.split("\\s+");
		
		String longest="";
		System.out.println(" Total Words : "+words.length);
		
		for(String word : words) {
			if(word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println("This is Longest Word : "+longest);
		
	}

}
