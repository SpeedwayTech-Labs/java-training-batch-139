package array;

import java.util.Arrays;

public class ArryaMethods {

	public static void main(String[] args) {
		
		//1. sort()
		
		int[] num = {70,80,60,40,50,30,20,10,90};
		
		for(int i = 0 ; i<num.length;i++) {
			Arrays.sort(num);
			System.out.print(num[i]+" ");
		}
		
		// 2. Equals()
		int[] arr1 = {90,80,70,60,50};
		int[] arr2 = {90,80,70,60,51};
		System.out.println("\n");
		boolean array = Arrays.equals(arr1, arr2);
		System.out.println("check this arrays : "+array);
		
		// 3. copy of array
		
		int[] num2 = Arrays.copyOf(num,num.length);
		for(int i = 0 ; i<num.length;i++) {
			System.out.print(num2[i]+" ");
		}
	
	}

}
