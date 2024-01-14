import java.util.Scanner;
class Book {
	String bookName;
	String ISBN;
	String authorName;
	String publisher;

	Book(String bn, String ISBN, String author, String pub) {
		setBookName(bn);
		setISBN(ISBN);
		setAuthorName(author);
		setPublisher(pub);
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getISBN() {
 		return ISBN;
 	}

	public void setAuthorName(String author) {
		this.authorName = author;
	}

	public String getAuthorName() {
 		return authorName;
 	}

	public String getPublisher() {
 		return publisher;
 	}

	public void setPublisher(String pub) {
		this.publisher = pub;
	}

	String getBookInfo() {
		
		String bookinfo = String.format("Book Name: %s\nISBN: %s\nAuthor: %s\nPublisher: %s",bookName,ISBN,authorName,publisher);
		return bookinfo;
	}
}


class BookDemo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Book[] obj = new Book[30];
		System.out.print("Enter number of books: ");
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Book "+ (i+1) + " details");
		
			System.out.print("Book Name: ");
			String bookName = scan.nextLine();
			System.out.print("ISBN: ");
			String ISBN = scan.nextLine();			
			System.out.print("Author: ");
			String Author = scan.nextLine();
			System.out.print("Publisher: ");
			String publisher = scan.nextLine();
			obj[i] = new Book(bookName, ISBN, Author, publisher);
		}
		for(int j = 0; j < n; j++) {
			System.out.println("\nBook "  + (j+1) + " information");
			System.out.println(obj[j].getBookInfo());
			
		}
		scan.close();
		
		
	}
	
	

}