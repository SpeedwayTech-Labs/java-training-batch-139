package java_keywords;

public class Demo_This {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		Student s1 = new Student("sujeet",101);
		s1.display();
		
		City c1 = new City();
		c1.chennai();
		
		Value v1 = new Value();
		
		Car c2 = new Car();
		c2.getdetails();
		
		Software s2 = new Software();
		s2.show();
		
		Man m1 = new Man();
		m1.vijay();
		
		Prity p1 = new Prity();

	}

}
class Student{
	
	String name ;
	int id ;
	
	Student(String name , int id ){
		this.name=name;   // 'this.name' refer to the current class instance variable 
		this.id = id ;
	}
	void display() {
		System.out.println(name+" "+id);
	}
}
class City{
	public void banglore() {  // banglore method
		System.out.println("This is Banglore");
	}
	public void chennai() { // chennai method
		System.out.println("This is Chennai");
		this.banglore();    // this keyword to call current class method
	}
}
class Value{
	Value(int num){
		System.out.println("This is Number : "+num);
	}
	Value(){
		this(100);  // this keyword to call current class constructor 
	}
}
class Car{
	 Car getdetails() {
	  	 System.out.println("This is Tata Motors Car");
		 return this ;   // this key word used to call the current class object
	 }
}
class Software{
	public void print(Software Testing) {
		System.out.println("Object : "+Testing);
	}
	public void show() {
		print(this);     // this keywod to apss the current class object
	}
}

class Man{
	public void mahesh() {
		System.out.println("this is Mahesh");
	}
   public void vijay() {
	   System.out.println("this is Vijay");
	   this.mahesh();
   }
	
}
class Prity{
    
	Prity(String car){
		System.out.println("This is my Car"+car);
	}
	Prity(){
		this("BMW X1");
	}
}