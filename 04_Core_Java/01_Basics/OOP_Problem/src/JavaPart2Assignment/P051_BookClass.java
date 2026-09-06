package JavaPart2Assignment;

 class P051_BookClass {
	
	 static int totalNoOfBooks;
	
	 String title;
	 String author;
	 String isbn;
	 
	 boolean isBorrowed;
	 
	 static {
		 totalNoOfBooks =0;
	 }
	 {
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
		 this.isBorrowed = true;  
	 }
	 public void returnBook() {
		 
	 }
 }