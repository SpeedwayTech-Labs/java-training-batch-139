package control_statement;

public class NestedIf {

	public static void main(String[] args) {
		
		String username = "admin";
		
		String password ="admin@123";
		
		if(username.equals("admin")) {
			
			if(password.equals("admin@123")) {
				
				System.out.println("Login Successful");
			}else {
				System.out.println("Invalid UN and PW");
			}
		}
		
		}

	}

