package Command;

public class Onlineviewer {

	private String exercise;
	private String onlineViewerUsernme;
	
	public Onlineviewer(String onlineViewerUsername) {
	  this.onlineViewerUsernme=onlineViewerUsername	;
	}
	public String getOnlineViewerUsernme() {
		return onlineViewerUsernme;
	}
	
	public void setOnlineViewerUsernme(String onlineViewerUsernme) {
		this.onlineViewerUsernme = onlineViewerUsernme;
	}
	
	public void setExercise(String exercise) {
		this.exercise=exercise;
		System.out.println("Online viewer "+ this.onlineViewerUsernme + " change exercise to "+ this.exercise);
		
	}

}
