package x02.observer.observer.concrete;

import x02.observer.observable.Observable;
import x02.observer.observable.concrete.WeatherData;
import x02.observer.observer.DisplayElement;
import x02.observer.observer.Observer;

/**
 * @author Nelson Migliarini
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Observable observable;

	/**
	 * @param temperature
	 * @param humidity
	 * @param weatherData
	 */
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.registerObserver(this);
	}

	@Override
	public void update(Observable observable) {
		if(observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
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
	 * @return the weatherData
	 */
	public Observable getWeatherData() {
		return observable;
	}

	/**
	 * @param weatherData the weatherData to set
	 */
	public void setWeatherData(Observable observable) {
		this.observable = observable;
	}
}
