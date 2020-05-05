package Command;

public class Trainer {

	private Command command;
	
	public void SetCommand(Command command) {
		this.command=command;
	}
	
	public void ChangeExercise() {
		System.out.println("The trainer changed the exercise!");
		this.command.execute();
	}
	
}
