
public class userFactory extends Factory {

	public User createUser(String name) {
		
		return new User(name);
	}

}
