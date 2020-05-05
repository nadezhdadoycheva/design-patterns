package Observer;

public class OnlineViewer implements Observer {

	private String exercise;
	private Observable athlete;
	private String OnlineViewerUsername;
	
	public OnlineViewer(String onlineViewerUsername) {
		  this.OnlineViewerUsername=onlineViewerUsername	;
		}
		public String getOnlineViewerUsernme() {
			return OnlineViewerUsername;
		}
		
		public void setOnlineViewerUsernme(String onlineViewerUsernme) {
			this.OnlineViewerUsername = onlineViewerUsernme;
		}

	@Override
	public void update() {
		if(athlete==null) {
			System.out.println("There are no viewers!");
			return;
		}
         exercise=athlete.getUpdate();
         System.out.println("Online viewer " + this.OnlineViewerUsername +" change exercise to " + this.exercise);
		
	}

	@Override
	public void SetExercise(Observable athlete) {
		this.athlete=athlete;;

	}

}
