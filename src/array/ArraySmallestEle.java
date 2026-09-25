package array;

public class ArraySmallestEle {

	public static void main(String[] args) {
	
		int[] num = {20,30,10,90,50};
		
		// output : 10 
		
		int smallest = num[0];  // assume first element is smallest

		for(int i = 1 ; i<num.length;i++) {
			
			if(num[i]<smallest) {
				
				smallest = num[i];
			}
		}
		System.out.println("This is Smallest element :  "+smallest);

	}

}
