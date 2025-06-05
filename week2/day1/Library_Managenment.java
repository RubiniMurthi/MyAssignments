package week2.day1;

public class Library_Managenment {

	public static void main(String[] args) {
		Library lmAction = new Library();
		String book = lmAction.addBook("Book added succesfully");
		System.out.println(book);
		String issuebook = lmAction.issuebook("Book issued successfully");
		System.out.println(issuebook);

	}

}
