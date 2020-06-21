
public class CityDesk extends Desk {

	public CityDesk(String name, State state){
        this.level = Desk.City;
        this.setName(name);
        this.setState(state);
    }

    @Override
    protected void sendShipment(String shipment) {
        if(shipment.equals("Local")){
            PreparationState preparationState = new PreparationState();
            preparationState.applyState(this);
            System.out.println("CityDesk gives the shipment away!");
            this.notifyObservers();
        }
        else{
            StandByState standByState = new StandByState();
            standByState.applyState(this);
            System.out.println("CityDesk can't give the shipment away!");
        }
    }
}
