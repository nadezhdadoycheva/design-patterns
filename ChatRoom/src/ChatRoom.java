import java.util.ArrayList;

public class ChatRoom {
	public static ArrayList users=new ArrayList<User>();
    public static Bot bot;
    
    public static void addUser(User user) {
			users.add(user);
		
	}
	
	public static void removeUser(User user) {
		
		if(user!= null && users.contains(user)) {
			users.remove(user);
			System.out.println(user.getName() + " has been removed from the chat!");
			
		}
	}
    
    public static void showMessage(User user,String Message) 
    {
    	System.out.println(user.getName() +"  " + Message);
    	
    	if(bot != null && Message.contains("cat")){
			bot.removeUser(user);
			bot.sendMessage();			
		}
    	else if(Message.equals("addBot")){
			bot = Bot.getBot();		
		}
    	
    }
}
