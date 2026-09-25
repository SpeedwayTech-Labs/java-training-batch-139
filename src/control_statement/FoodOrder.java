package control_statement;

public class FoodOrder {

	public static void main(String[] args) {
		
		int choice = 4 ;
		
		switch (choice){
		
		case 1 :
			System.out.println("you selected Pizza");
		break;	
		
		case 2 :
			System.out.println("you selected Burger");
		break;	
		
		case 3 :
			System.out.println("you selected Sandwich");
		break;	
			
		default:
			System.out.println("Invalid Choice");
		}

	}

}
