package array;

public class DemoArray2 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		System.out.println("changes");
		
		int[] age = {10,20,30,40,50,60,70,44,44,23,64,77,43,90,23,78};
		
        // 1. length
		int len = age.length;
		System.out.println("This is Lenght of Array : "+len);
		
		for(int i =len-1 ; i>0 ; i--) {
			System.out.print(" "+age[i]);
		}

	}

}
