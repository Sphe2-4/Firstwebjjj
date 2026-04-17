// the imports make the default class ArrayList and Scanner available for all packages associated with this current   
import java.util.ArrayList;
import java.util.Scanner;

// the library class is used  to store parse and pass information 
class Library {
// decleairng an arrayList to store books and members objects
	ArrayList<Book> books = new ArrayList<>();
	ArrayList<Member> members = new ArrayList<>();
// a method to parse added books
	void addBook(Book book){

    // using the add opperator to add inputed information to the "books" array list  
		books.add(book);
    

	}
//a method that adds members to the "member" arraylist
	void addMember(Member member){
		members.add(member);
	}

// show books method to display all books captured
	void showBooks(){
// using a for loop to display othe stored books in books   
		for (Book b : books) {
		
			System.out.println(b);
			
		}
	
	}
//  show members method to display captured information on members
	void showMembers(){
// for loop to display members stored in the member arraylist
		for (Member m : members){
	
			System.out.println(m);
	
		}
	
	}
	
/ 
//   
	Book findBookById(int id){

		for (Book b : books) {
			if (b.id == id) return b;
		}
		return null; //does not return anything since the prigram is only searching for  book id
	}	

}
//the main class stores all the input code and all code starts running here 
public class Main{
	// main method is required for the program to run
	public static void main(String[] args){
	// creating a keyboard input
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		
		
		
		
	// initial values. NB : not compulsury you can always add values later in the console 
		library.addBook( new Book(1,"1984","George Orwell"));
		library.addBook( new Book(2,"to kill a mockingbird ", "Harper Lee"));
		library.addMember(new Member(1, "Jesus"));
		library.addMember(new Member(2, "Dumisani"));

	//	loop ot keep the system working

		while (true) {


        //  !!! displaying menu options !!!


			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
			System.out.println("1. Show Books");
			System.out.println("2. Show Members");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. add new book");
			System.out.println("6. add new user");
			System.out.println("7. Exit");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
			System.out.print("Choose an option: ");

			//  !!! choice input !!!
		//data type ||  calling the sc object
		//   |              |
			int choice = sc.nextInt();
		// 			|       
		//		variable name

			//  !!! menu selection !!!
			
			
			while (!(choice <= 7 && choice >= 1)){
			
			
				System.out.print("Choose a valid option: ");
				
				choice = sc.nextInt();
			}
		//switch decision making opperator	
		//  	^
		//		|
		//		|
		//		|
			switch (choice) {
				//		^
				//		|
				//		|
				//	variable to be matched
				
				
				
				
			// this case displays the books stored	
				case 1:
		//		^	 ^
		//      |	  \
		//		|	  this is the value that should be matched with the variable 
		//		|		
		//	 case keyword is used a if statement
		
		
		// this runs whn the variable matches
					library.showBooks();

//separators the  System.out.println is used to separate the console display
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
					break;
//this case displays stored members
				case 2:
					library.showMembers();

					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
					break;
// this case is used to search for a book by ID 
          
//it indicates weather the book is borrowed
				case 3:
					System.out.print("Enter book ID to borrow: ");
					int borrowId = sc.nextInt();
					Book borrowBook = library.findBookById(borrowId);
					if (borrowBook != null) { 
						borrowBook.borrowBook();
					} else { System.out.println(" Book not found.");}
 
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
					break;
					
					
					
					
					
				// this case sets book as borrowed 
				case 4 :
					System.out.println("Enter book ID to borrow: ");
					int id = sc.nextInt();
					Book returnBook = library.findBookById(id);
					if (returnBook != null) returnBook.returnBook();
					else System.out.println("book ain't found!!!");

					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
					break;
					
					
					
					
				// this case allows you to add new book when 4 is clicked
				case 5 :
				
					
					System.out.println("enter new book ID");
					int newId = sc.nextInt();
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +"\n");

                    sc.nextLine();
                    System.out.print("Enter book title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String newAuthor = sc.nextLine();
                    library.addBook(new Book(newId, newTitle, newAuthor));
                    System.out.println("Book added successfully!");


					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
                    break;
					
					
					

				//this case adds new member
				case 6 :
					System.out.println("enter new member id : ");
					int newMemberId = sc.nextInt();
					System.out.println("enter new member name : ");
					String newMember = sc.nextLine();
              
                    library.addMember(new Member(newMemberId, newMember));
                    System.out.println("new member added successfully!");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
                    break;

				
					
				// closes the loop
				case 7 : 
					System.out.println("goodbye! : )");
					System.out.println(":):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:): ");

					sc.close(); 
					return;

// the default statement is executed when there is no vailid matching case 
				default:

					System.out.println("invalid option");
					System.out.println(":):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:):(:): ");
			}
		}
	}
}
