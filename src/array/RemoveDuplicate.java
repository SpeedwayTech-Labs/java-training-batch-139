package array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] input = {4,5,6,4,2,5,6,8};
		// output : 4 5 6 2 8
		
		// find length of arrya
		
		int len = input.length;
		System.out.println(len);
		
		System.out.println("Unique Elements : ");
		
		for(int i = 0 ; i< len; i++) {
			
			boolean isDuplicate = false;
			
			// check if element appeared before 
			
			for(int j = 0 ; j < i ; j++) {
				
				if(input[i] == input[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(input[i]+" ");
			}
		}

	}

}
