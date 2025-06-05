package week2.day1;

public class Library {
	
	public String addBook(String bookTitle) {
		return bookTitle;	

	}

	public String issuebook(String name) {
        return name;
	}
	public static void main(String[] args) {
		Library libAction = new Library();
		String book = libAction.addBook("Book added successfuly");
        System.out.println(book);
        String issuebook = libAction.issuebook("Book issued successfully");
        System.out.println(issuebook);
	}

}
