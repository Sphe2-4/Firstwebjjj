
//book class 
public class Book{
  // creating book objects
	int id;
	String title, author;
	Boolean isBorrowed;

// this part of the code gives the entered values in the main method to the objects created in the Book class 
	Book(int id, String title, String author){
		this.id = id;
		this.title = title;
		this.author = author;
		this.isBorrowed = false;

	}

  // the borrowBook method is used to mark a book as borrowed
  //if the book is not borrowed it displays a message that the book is anavailable
	void borrowBook(){

		if (!isBorrowed){
			isBorrowed = true;
			System.out.println(title + " has been borrowed!");
			
		} else {
			System.out.println(title +"is already borrowed.");
		}
	}
 // the returnBook method is called to mark a specific  object in the book arraylist as returned 
  // if the book was not marked as borrowed it displays a message to indicate thet it was not borrowed
	void returnBook(){
		if(isBorrowed){
			isBorrowed = false;
			System.out.println(title + " has been returned.");
		} else {

			System.out.println(title + "was not borrowed");
			}
	
	
	}
	
	@Override //used to make sure the displayed message does not give an error
	public String toString(){

		return id + "."+ title + " by " + author + (isBorrowed ? "(Borrowed)": "");
	}



}
