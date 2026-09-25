package Interview;

public class Demo_SwapNum {

	public static void main(String[] args) {
		
		int a = 5 ;
		
		int b = 10 ;
		
		// a = 10 , b = 5;
		
		System.out.println("a : "+a +" b : "+b);
		
//		int c = a ;
//		// c = 5
//		a=b ; // 10
//		b = c ; //  5
		
		a = a + b ; // 15
		b = a - b ; // 15-10 = 5
		a = a - b ; // 15 - 5 = 10
		System.out.println("a  : "+ a +" b : "+b);

	}

}
