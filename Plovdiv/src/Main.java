
public class Main {
	 
	private static Desk getChain(){
	        StandByState standByState = new StandByState();
	        Desk abroad = new AbroadDesk("Abroad", standByState);
	        Desk country = new CountryDesk("Country", standByState);
	        Desk city = new CityDesk("City", standByState);

	        Observer boy = new Boy("Ivan");

	        abroad.subscribe(boy);
	        city.subscribe(boy);
	        country.subscribe(boy);

	        city.setNextDesk(country);
	        country.setNextDesk(abroad);
	        return city;
	    }

	    public static void main(String[] args) {
	        Desk DeskChain = getChain();

	        DeskChain.receiveShipment(2, "Abroad");
	    }
}
