package array;

public class ArrayEvenNum {

	public static void main(String[] args) {
		
		int[] num = {10,15,20,25,30};
		// output : 10 20 30
		
		for(int i = 0 ; i<num.length;i++) {
			
			if(num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
		
		int[] numbers = {10,20,30,40,50};
		
		for(int i = numbers.length-1 ; i>=0 ; i-- ) {
			System.out.print(" "+numbers[i]);
		}

	}

}
