import java.util.ArrayList;
import java.util.List;

public class Boy implements Observer {
	private List<Observable> Desks = new ArrayList<>();
    private String name;

    public Boy(String name){
        this.name = name;
    }

    @Override
    public void update() {
        if(Desks.isEmpty()){
            System.out.println("Nothing to ship");
            return;
        }

        getShipment(Desks);
    }

    @Override
    public void setDesk(Observable observable) {
        this.Desks.add(observable);
    }

    private void getShipment(List<Observable> observables){
        for(Observable observable : observables){
            if(observable.getUpdate().equals("Preparation")) {
                System.out.println(this.name + " gets the shipment!");
            }
        }
    }
}
