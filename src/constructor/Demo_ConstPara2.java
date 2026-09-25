package constructor;

public class Demo_ConstPara2 {

	public static void main(String[] args) {
	
       
		Banking p1 = new Banking(1234,"Vijay","Pune");
		
		Banking p2 = new Banking(1235,"Prity","Delhi");
		
		Banking p3 = new Banking(1274,"Neelima","Banglore");
	}

}
class Banking{
	
	Banking(int accNum , String name , String add) {
		
		System.out.println(accNum+" "+name+" "+add);
	
	}
}