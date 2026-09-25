package basic_progs;

public class Instance_Variable {
	
	int a = 20 ;
	
	int b = 20 ;
	
	int c = a + b;
	
	public static void main(String[] args) {
		
		Instance_Variable iv = new Instance_Variable();
		
		System.out.println("This is Addition of a and b :"+iv.c);
		
		India i1 = new India();
		i1.show();
		System.out.println(i1.name);
	
	}

}
class India{
	
	String name = "Sujeet";
	
	void show() {
		System.out.println("This is India Class");
	}
}
