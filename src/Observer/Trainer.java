package Observer;

public class Trainer {

	Athlete athlete;
	public Trainer(Athlete athlete)
	{
		this.athlete = athlete;
	}
	public void ChangeExercise(String newExercise)
	{
	 this.athlete.SetExercise(newExercise);
	}
}
