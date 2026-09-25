package string;

public class DemoStringMethods {

	public static void main(String[] args) {
		
	System.out.println("This is Beginning");
	
	String str = "This is Banglore";
	
	// 1. String Length
	int len = str.length();
	System.out.println("Length of String is : "+len);
	
	// 2. char at index
	char ch =str.charAt(5);
	System.out.println("Character at index : "+ch);
	
	// 3. sub string
	System.out.println("String Sub String : "+str.substring(0,6));
	
	// 4. concat
	String newstr=str.concat(" Wel-Come !");
	System.out.println(newstr);
	
	// 5. Equals Method
	String str2 = "This is Pune";
	String str3 = "this is pune";
	System.out.println(str2 == str3);
	System.out.println(str2.equals(str3));
	System.out.println(str2.equalsIgnoreCase(str3));
	
	// 6. compareTO
	String str4 = "ABCD"; // 1 2 3 4
	String str5 = "ABCD";//  1 2 3 4
	String str6 ="DCBA"; //- 4 3 2 1
	System.out.println(str4.compareTo(str5));
	System.out.println(str5.compareTo(str6));
	
	// 7. UpperCase
	String str7 = "this is chennai";
	System.out.println(str7.toUpperCase());
	
	// 8. LowerCase
	String str8 = "THIS IS MUMBAI";
	System.out.println(str8.toLowerCase());
	
	// 9. Trim is used to remove white spaces
	String str9 = "     This is GOA     ";
	System.out.println(str9);
	System.out.println(str9.trim()+" Welcome to GOA ");
	
	// 10 . replace 
   String str10 = "This is Java";
   System.out.println(str10.replace('J', 'K'));
   
   // 11. split
   String str11 = "This is FullStack Automation";
   // this
   // is
   // FillStack
   // Automation
   String[] sub = str11.split(" ");
   
   for(String st : sub) {
	   System.out.println(st);
   }
   // 12. starwith
   String str12 = "Hello";
   System.out.println(str12.startsWith("He"));
   System.out.println(str12.endsWith("ll"));
   
   // for(dataType variable : arrayOr Collection)
	
   String[] city = {"Pune","Mumbai","Delhi","Banglore"};
   //System.out.println(city);
   
   for(String ct : city) { // take one city from the String array per iteration
	   
	   System.out.println(ct);  
   }
   System.out.println("\n");
   
   for(int i = 0 ; i<city.length;i++) {
	   
	   System.out.println(city[i]);
   }
   
   String word = "Java";
   for(char letter : word.toCharArray()) {
	   System.out.println(letter);
   }

	}

}
