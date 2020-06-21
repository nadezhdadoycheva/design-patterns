import java.util.ArrayList;
import java.util.List;


public abstract class Desk implements Observable{

	    public static int Abroad = 2;
	    public static int Country = 2;
	    public static int City = 2;
	    public String name;

	    private List<Observer> observers = new ArrayList<>();
	    private State state;

	    protected int level;
	    protected Desk nextDesk;

	    public void setNextDesk(Desk nextDesk){
	        this.nextDesk = nextDesk;
	    }

	    public void receiveShipment(int level, String shipment){

	        if(this.level <= level){
	            this.sendShipment(shipment);
	        }

	        if(this.nextDesk != null){
	            this.nextDesk.receiveShipment(level, shipment);
	        }
	    }

	    @Override
	    public void subscribe(Observer observer) {
	        this.observers.add(observer);
	        observer.setDesk(this);
	    }

	    @Override
	    public void unsubscribe(Observer observer) {
	        this.observers.remove(observer);
	    }

	    @Override
	    public void notifyObservers() {
	        for(Observer observer : this.observers){
	            observer.update();
	        }
	    }

	    @Override
	    public String getUpdate() {
	        return this.state.getStateName();
	    }

	    abstract protected void sendShipment(String shipment);

	    public State getState() {
	        return state;
	    }

	    public void setState(State state) {
	        this.state = state;
	    }

	    public void setName(String name){
	        this.name = name;
	    }

	    public String getName(){
	        return this.name;
	    }
}
