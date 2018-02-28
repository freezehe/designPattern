package com.freeze.test2;

import java.util.Observable;

public class Main {
	
	public static void main(String[] args) {
		Observable observable = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(observable );
		conditionsDisplay.display();
	}

}
