
public class User {

	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public User(String name) {
		this.name=name;
	}
	
	public void UserSendMessege(String message)
	{
		ChatRoom.showMessage(this ,message);
		
		}
	
	
	
}
