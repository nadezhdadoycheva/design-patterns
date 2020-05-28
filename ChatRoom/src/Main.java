
public class Main {

	public static void main(String[] args) {
		Factory factory =new userFactory();
		User first=factory.createUser("Petq");
		User second=factory.createUser("Tina");
		User third=factory.createUser("Lidiq");
		
		ChatRoom.addUser(first);
		ChatRoom.addUser(second);
		ChatRoom.addUser(third);
		
		first.UserSendMessege("I am new here");
		second.UserSendMessege("I have used this platform for a while");
		third.UserSendMessege("Me too");
		
		second.UserSendMessege("Do you have a pet.");
		second.UserSendMessege("addBot");
		third.UserSendMessege("I have a cat");
		
		
	}

}
