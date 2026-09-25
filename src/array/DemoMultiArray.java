package array;

public class DemoMultiArray {

	public static void main(String[] args) {
		
		int a[][] = new int[2][3];
		
		a[0][0] = 1 ;
		a[0][1] = 2 ;
		a[0][2] = 3 ;
		a[1][0] = 4 ;
		a[1][1] = 5 ;
		a[1][2] = 6 ;
		
  
		for(int r = 0 ; r<2;r++) { // row
			
			for(int c = 0 ; c<3 ; c++) { // coloum
				
				System.out.println(a[r][c]);
			}
		}

	}

}
