// member class

class Member{
  // member objects to store member information
	int memberId;
	String name;
//this part of the code passes the information entered into the member objects in the member class 
	Member(int memberId, String name){

		this.memberId = memberId;
		this.name = name;
	}
	@Override
	public String toString(){
		return memberId + "." + name;

	}


}
