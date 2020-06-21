
public class PreparationState implements State{
	private static final String StateName = "Preparation";

    @Override
    public void applyState(Desk Desk) {
        Desk.setState(this);
    }

    @Override
    public String getStateName() {
        return StateName;
    }

}
