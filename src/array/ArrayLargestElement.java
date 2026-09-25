package array;

public class ArrayLargestElement {

	public static void main(String[] args) {
		
		int[] num = {120,30,170,40,90,50,100};
		
		int largest = num[0];  // assume first value is largest
		
		for(int i = 1 ; i<num.length;i++) {
			
			if(num[i]>largest) {
				
				largest = num[i];
			}
		}
		System.out.println("This is the largest value of array : "+largest);
		

	}

}
