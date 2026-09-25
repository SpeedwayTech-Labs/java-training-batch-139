package control_statement;

public class ElseIfExample {

	public static void main(String[] args) {
		
		int marks = 35 ;
		
		if(marks >= 90) {
			System.out.println("GRADE A+");
		}else if(marks >=75) {
			System.out.println("GRADE A");
		}else if(marks >=60) {
			System.out.println("GRADE B");
		}else if(marks >=40) {
			System.out.println("GRADE C");
		}else {
			System.out.println("FAIL");
		}

	}

}
