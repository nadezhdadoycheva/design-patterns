package Command;

public class LieDownCommand implements Command {

   private Athlete athlete;
	
	public LieDownCommand(Athlete athlete) {
		this.athlete=athlete;
	}
	@Override
	public void execute() {
		athlete.SetExercise("Lie Down");

	}
}
