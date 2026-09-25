package control_statement;

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 2028;
		
		if((year % 4 == 0 && year % 100 !=0 ) || (year % 400 == 0)) {
			System.out.println(year +" This is  LEAP year");
		}else {
			System.out.println(year+" This is Not LEAP year");
		}
		
		int num = 9 ;
		
		if( num % 2 == 0 ) {
			System.out.println(num+" this is even number");
		}
		if(num % 2 !=0 ) {
			System.out.println(num+" this is ODD number");
		}

	}

}
