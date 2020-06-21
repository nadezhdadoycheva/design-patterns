
public class CountryDesk extends Desk {
	
	public CountryDesk(String name, State state){
        this.level = Desk.Country;
        this.setName(name);
        this.setState(state);
    }

    @Override
    protected void sendShipment(String shipment) {
        if(shipment.equals("Country")){
            PreparationState preparationState = new PreparationState();
            preparationState.applyState(this);
            System.out.println("CountryDesk gives the shipment away!");
            this.notifyObservers();
        }
        else{
            StandByState standByState = new StandByState();
            standByState.applyState(this);
            System.out.println("CountryDesk can't give the shipment away!");
        }
    }
}
