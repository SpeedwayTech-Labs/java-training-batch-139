package array;

public class DemoArray3 {

	public static void main(String[] args) {
		
		int[] marks = new int[5];   // size fixed 
		
		marks[0] = 70 ;
		marks[1] = 75 ;
		marks[2] = 65 ;
		marks[3] = 90 ;
		marks[4] = 80 ;
		//marks[5] = 90 ;
		
//		for(int i = 0 ; i <marks.length ; i++) {
//			
//			System.out.print(" "+marks[i]);
//		}	

		for(int mk : marks) {
			System.out.println(mk);
		}
	}

}
