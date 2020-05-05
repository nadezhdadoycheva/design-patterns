package Observer;

import java.util.ArrayList;
import java.util.List;

public class Athlete implements Observable {

	private List<Observer> observers= new ArrayList<Observer>();
	private String exercise;
	
	
	@Override
	public void subscribe(Observer observer) {
		observer.SetExercise(this);
		this.observers.add(observer);

	}

	
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
	
		return exercise;
	}

	public void SetExercise(String exercise)
	{
		this.exercise = exercise;
		this.notifyObservers();
	}
}
