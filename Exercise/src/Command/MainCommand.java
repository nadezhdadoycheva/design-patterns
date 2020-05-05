package Command;

public class MainCommand {

	public static void main(String[] args) {
		Trainer trainer=new Trainer();
		Athlete athlete=new Athlete();
	    Onlineviewer v1=new Onlineviewer("Viewer 1");
		Onlineviewer v2=new Onlineviewer("Viewer 2");
		Onlineviewer v3=new Onlineviewer("Viewer 3");
		
		athlete.subscribe(v1);
		athlete.subscribe(v2);
		athlete.subscribe(v3);
		
		Command GetUp=new GetUpCommand(athlete);
		Command lieDown=new LieDownCommand(athlete);
		
		trainer.SetCommand(GetUp);
		trainer.ChangeExercise();
		
		trainer.SetCommand(lieDown);
		trainer.ChangeExercise();
		

	}

}
