
public class Bot {
	private static Bot bot;
	
	private Bot() {}
	
	public static Bot getBot() {
		if(bot==null) {
			bot=new Bot();
		}
		return bot;
	}
	
	public void sendMessage() {
		System.out.println("The message from bot is: The word cat is forbidden!");
	}
	
	public void removeUser(User user)
	{
		ChatRoom.removeUser(user);
	}
	
}
