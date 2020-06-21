
public class StandByState implements State {
	 private static final String StateName = "StandBy";

	    @Override
	    public void applyState(Desk Desk) {
	        Desk.setState(this);
	    }

	    @Override
	    public String getStateName() {
	        return StateName;
	    }
}
