package week1.day3;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
		
	}

	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Library L =new Library();
     String boo = L.addBook("Book");
     System.out.println(boo);
     
     L.issueBook();
     
	}

}