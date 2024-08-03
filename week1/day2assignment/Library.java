package week1.day2assignment;

public class Library {
	
	public String addBook (String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	 public void issueBook() {
		 
		 System.out.println("Book issued successfully");
		 
	 }
	 
	 public static void main(String[] args) {
		
		 Library lb=new Library();
	
		 lb.addBook("String");
		 lb.issueBook();
		 
	}
	

}
