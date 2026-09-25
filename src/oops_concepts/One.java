package oops_concepts;

abstract class One {
	
	void city() {
		System.out.println("This is Banglore");
		System.out.println("This is Chennai");
		System.out.println("This is Pune");
		System.out.println("This is Mumbai");
	}

}
class Two extends One{
	public static void main(String[] args) {
		One o1 = new Two();
		o1.city();
	}
}