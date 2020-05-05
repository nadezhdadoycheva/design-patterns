package Observer;

public class MainObeserver {

	public static void main(String[] args) {
		Athlete athlete=new Athlete();
		Trainer trainer = new Trainer(athlete);
		Observer v1= new OnlineViewer("Viewer 1");
		Observer v2= new OnlineViewer("Viewer 2");
		Observer v3= new OnlineViewer("Viewer 3");
		
		athlete.subscribe(v1);
		athlete.subscribe(v2);
		athlete.subscribe(v3);
		
		trainer.ChangeExercise("Get up");
		trainer.ChangeExercise("Lie down");
	}

}
