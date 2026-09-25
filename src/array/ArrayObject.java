package array;

public class ArrayObject {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		Employee e1[] = new Employee[5];
		e1[0] = new Employee(101,"Sujeet");
		e1[1] = new Employee(102,"jeet");
		e1[2] = new Employee(103,"Abhijeet");
		e1[3] = new Employee(104,"Rahul");
		e1[4] = new Employee(105,"Vijay");
		

	}

}
class Employee{
	
	Employee(int id , String name){

		System.out.println("Emp_id = "+id);
		System.out.println("Emp_name = "+name);
	}
}