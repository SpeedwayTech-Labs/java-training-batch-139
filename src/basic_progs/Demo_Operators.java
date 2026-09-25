package basic_progs;

public class Demo_Operators {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		// Arithmetic Operators
		int a = 10 , b = 5 ;
		System.out.println("Arithmetic Operators :");
		System.out.println("a + b = "+(a + b)); // 15
		System.out.println("a - b = "+(a - b)); // 5
		System.out.println("a * b = "+(a * b)); // 50
		System.out.println("a / b = "+(a / b)); // 2
		System.out.println("a % b = "+(a % b)); // 0
		
		// Relational Operators
		System.out.println("\n Relational Operators :");
		System.out.println("a == b : " +(a == b)); // f
		System.out.println("a != b : " +(a != b));// t
		System.out.println("a > b  :" +(a > b));// t
		System.out.println("a < b : " +(a < b));// f
		System.out.println("a >= b : " +(a >= b));// t
		System.out.println("a <= b : " +(a <= b));// f
		
		// logical Operators
		boolean x1 = true , y1 = true;
		boolean x2 = true , y2 = false;
		boolean x3 = false , y3 = true;
		boolean x4 = false , y4 = false;
		System.out.println("\nLogical Operators : ");
		System.out.println("x1 && y1 : "+(x1 && y1));
		System.out.println("x2 && y2 : "+(x2 && y2));
		System.out.println("x3 && y3 : "+(x3 && y3));
		System.out.println("x4 && y4 : "+(x4 && y4));
		
		System.out.println("==== OR ====");
		
		boolean i1 = true , j1 = false;
		boolean i2 = false , j2 = true;
		boolean i3 = true , j3 = true;
		boolean i4 = false , j4 = false;
		
        System.out.println("i1 || j1 : "+( i1 || j1));
        System.out.println("i2 || j2 : "+( i2 || j2));
        System.out.println("i3 || j3 : "+( i3 || j3));
        System.out.println("i4 || j4 : "+( i4 || j4));
        
        
        // Assignment operators
        int c = 10 ;
        System.out.println("\nAssignment Operators ");
        System.out.println("This is value of c : "+c);
        
        c += 5 ; // 10 = 10 + 5 
        System.out.println(" c += 5 : "+c);
        c -= 3 ; // 15 = 15 - 3 
        System.out.println(" c += 3 : "+c);
        c *= 2;
        System.out.println(" c *= 2 :"+ c);
        c /= 2;
        System.out.println(" c /= 2 : "+c);
        c %= 3 ;
        System.out.println(" c %= 3 : "+c);
        
        // Unary Operators:
    
        System.out.println("\nUnary Operators : ");
        int d = 5 ;
        System.out.println(d); //5
        System.out.println(d++); // 5 + 1 // post-increment
        System.out.println(d);
        System.out.println(++d); //pre - increment 
        System.out.println(d);
        
        int e = 10 ;
        System.out.println(e);
        System.out.println(e--); // 9 post - de
        System.out.println(e);
        System.out.println(--e); // pre - decr
        
       
	}

}
