package constructor;

public class Demo_Const_Overload {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Emp e1 = new Emp(102,"Sujeet");
		Emp e2 = new Emp(103,"Abhijeet",98907654321l);
		Emp e3 = new Emp(104,"Vijay",9890776655l,"COMP");
		Emp e4 = new Emp(105,"Rahul",989077665544l,"ETC","Pune");

	}

}
class Emp{
	
	int id ;
	String name;
	long mob;
	String Dept;
	String Address;
	
	Emp(int i , String n){
		id = i ;
		name = n;
		System.out.println(i+" "+n);
	}
	Emp(int i , String n , long m){
		id=i;
		name= n;
		mob=m;
		System.out.println(i+" "+n+" "+m);
	}
	Emp(int i , String n ,long m,String d){
		id=i;
		name=n;
		mob=m;
		Dept = d;
		System.out.println(i+" "+n+" "+m+" "+d);
	}
	Emp(int i , String n ,long m,String d ,String Add){
		id=i;
		name=n;
		mob=m;
		Dept = d;
		Address = Add;
		System.out.println(i+" "+n+" "+m+" "+d+" "+Add);
	}
}