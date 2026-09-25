package constructor;

public class Copy_Constructor {

	public static void main(String[] args) {
	 System.out.println("This is Beginning");
	 
	 Book b1 = new Book("Java Basics",3000);
	 b1.show();
	 
	 Book b2 = new Book(b1);  // copy constructor
	 b2.show();

	}

}
class Book{
	String title;
	int pages;
	
	Book(String str , int pg){
		title = str;
		pages = pg;
	}
	// copy constructor
	Book(Book b){
		title = b.title;
		pages = b.pages;
	}
	void show() {
		System.out.println("Title : "+title+" , pages : "+pages);
	}
}