
public abstract class Factory {

	userFactory userFactory;
	
	public User createUser(String name)
	{
		return userFactory.createUser(name);
	}
	
}
