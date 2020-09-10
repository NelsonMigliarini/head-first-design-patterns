package x02.observer.observable.concrete;

import java.util.ArrayList;
import java.util.List;

import x02.observer.observable.Observable;
import x02.observer.observer.Observer;

/**
 * @author Nelson Migliarini
 */
public class WeatherData implements Observable {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index >= 0)
			observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers)
			observer.update(this);
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/**
	 * @return the observers
	 */
	public List<Observer> getObservers() {
		return observers;
	}

	/**
	 * @param observers the observers to set
	 */
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
