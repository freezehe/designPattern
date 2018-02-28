package com.freeze.test2;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	}

	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
}
