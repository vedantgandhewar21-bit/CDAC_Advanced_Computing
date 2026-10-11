package Package;

public class MainMethod {
	public static void main(String[] args) {
		
	
   Book b1 = new Book("Java","Fusukwingnui","adfhhjg");
   
   Book b2 = new Book("C++", "Josh","cwejfhhf");
   System.out.println(Book.getTotalBooks());
   b1.borrowBook();
   b2.borrowBook();

   
   
   b1.returnBook();

}
}