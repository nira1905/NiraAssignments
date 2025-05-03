package week1.day2;

public class Library {
	
	public void addBook(String bookTitle)
	{
	System.out.println("Book added successfully");
	}
	
    public void issueBook()
    {
    	System.out.println("Book issued");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Library lib=new Library();
//	System.out.println(lib.addBook("Enid Blyton"));
	lib.addBook(null);
	lib.issueBook();
	}

}
