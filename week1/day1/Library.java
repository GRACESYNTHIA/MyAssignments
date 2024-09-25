package week1.day1;

public class Library {

	String addbook(String bookTitle) {
		System.out.println("Book added sucessfully");
		return "bookTitle";
	}

	void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library book = new Library();
		book.addbook("bookTitle");
		book.issueBook();

	}

}
