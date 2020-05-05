package Command;

import java.util.ArrayList;
import java.util.List;

public class Athlete {

	
    private String exercise;
    private List<Onlineviewer> onlineViewers=new ArrayList<Onlineviewer>();
	
	public void SetExercise(String exercise) {
		this.exercise=exercise;
		for(Onlineviewer viewer: this.onlineViewers) {
			viewer.setExercise(this.exercise);
		}
		
	}
	public void subscribe(Onlineviewer onlineviewer) {
		this.onlineViewers.add(onlineviewer);
	}

  
}
