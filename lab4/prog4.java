class Book {
	String bookName;
	String ISBN;
	String authorName;
	String publisher;

	book(String bn, String ISBN, String author, String pub) {
		setbookName(bn);
		setISBN(ISBN);
		setAuthorName(author);
		setPublisher(pub);
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	void setAuthorName(String author) {
		this.authorName = author;
	}

	void setPublisher(String pub) {
		this.publisher = pub;
	}

	String getBookName() {
		return bookName;
	}

	
}


class BookDemo {
	Book books[30] = new Book();
}