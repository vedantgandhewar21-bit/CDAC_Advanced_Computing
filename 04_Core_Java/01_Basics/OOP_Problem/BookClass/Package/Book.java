package Package;

class Book {
	// Instance Variable
	String title;
	String author;
	String isbn;

	// Static Variable
	static int totalBooks;

	// Constructor
	Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		totalBooks++;
	}

	// Instance Method
	public void borrowBook() {
		System.out.println(title+" has been borrowed");
	}

	public void returnBook() {
System.out.println(title +" has been returned.");
	}

	// Static Method
	static int getTotalBooks() {
		return totalBooks;
	}
}
