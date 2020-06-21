
public class AbroadDesk extends Desk {

	 public AbroadDesk(String name, State state){
	        this.level = Desk.Abroad;
	        this.setName(name);
	        this.setState(state);
	    }

	    @Override
	    protected void sendShipment(String shipment) {
	        if(shipment.equals("Abroad")){
	            PreparationState preparationState = new PreparationState();
	            preparationState.applyState(this);
	            System.out.println("AbroadDesk gives the shipment away");
	            this.notifyObservers();
	        }
	        else{
	            StandByState standByState = new StandByState();
	            standByState.applyState(this);
	            System.out.println("AbroadDesk can't give this shipment away!");
	        }
	    }
}
