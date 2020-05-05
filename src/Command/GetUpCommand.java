package Command;

public class GetUpCommand implements Command {

	private Athlete athlete;
	
	public GetUpCommand(Athlete athlete) {
		this.athlete=athlete;
	}
	@Override
	public void execute() {
		athlete.SetExercise("Get Up");

	}

}
