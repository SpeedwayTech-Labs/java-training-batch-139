package method;

public class DemoMethodOverload {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		Calculators c1 = new Calculators();
		c1.add(20, 40);
		c1.add(20, 30, 40);
		c1.add(30, 60);
		c1.display(2000,"Viajy");
		c1.display("prity",50000,"Pune",9890776655l,"COMP");

	}

}
class Calculators{
	
	void add(int a , int b) {
		System.out.println(a+b);
	}
	void add(int a , int b , int c) {
		System.out.println(a+b+c);
	}
	void add(double a , double b) {
		System.out.println(a+b);
	}
	void display (int salary , String name){
		System.out.println(name+" "+salary);
	}
	void display(String name , int salary , String add , long mob , String Dept) {
		System.out.println(salary+" "+name+" "+add+" "+mob+" "+Dept);
	}
	
}