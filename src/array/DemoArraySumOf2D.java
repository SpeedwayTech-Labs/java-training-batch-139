package array;

public class DemoArraySumOf2D {

	public static void main(String[] args) {
	
		int[][] matrix = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
				};
		
		int sum = 0 ;
		
		for(int r = 0 ; r<matrix.length;r++) {
			
			for(int c = 0 ; c<matrix[r].length;c++) {
				
				sum += matrix[r][c];
			}
		}
		System.out.println("Totalk Sum = "+sum);

	}

}
