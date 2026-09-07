package JavaPart2Assignment;

 class P051_BookClass {
	
	 static int totalNoOfBooks;
	
	 String title;
	 String author;
	 String isbn;
	 
	 boolean isBorrowed;
	 
	 static {//class initializer
		 totalNoOfBooks =0;
	 }
	 { // object initializer
		 totalNoOfBooks++;
	 }
	 P051_BookClass( String isbn,String title,String author){
		 this.title=title;
		 this.author= author;
		 this.isbn = isbn;
	 }
	 
	 P051_BookClass(String isbn){
		 this(isbn ,"Unknown","Unknown");
	 }
	 
	 static int getTotalNoOfBooks() {
		 return totalNoOfBooks;
	 }
	 public void borrowBook() {
		 if(isBorrowed) {
		    System.out.println(this.title +" Book is already Borrowed");
		 }
		 else {
			 System.out.println("Enjoy the Book "+this.title);
			 this.isBorrowed = true;
		 }
	 }
	 public void returnBook() {
		 if(isBorrowed) {
			 this.isBorrowed = false;
			 System.out.println("Hope You Enjoyed the "+this.title +", Please Leave a Review");
		 }
		 else {
			 System.out.println( this.title +" is already present in the Library");
		 }
	 }
	 public static void main(String[] args) {
		 P051_BookClass designOfThings = new P051_BookClass("1","Poem","Author1");
		 System.out.println("Total No Of Book "+P051_BookClass.getTotalNoOfBooks());
		 P051_BookClass myBook = new P051_BookClass("2","Story","Author2");
		// System.out.println(P051_BookClass.getTotalNoOfBooks());
		 designOfThings.borrowBook();
		 myBook.borrowBook();
		 designOfThings.borrowBook();	
		 designOfThings.borrowBook();
		 designOfThings.returnBook();
		 myBook.returnBook();
		 designOfThings.borrowBook();
		 designOfThings.borrowBook();
	}
 }