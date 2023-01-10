package com.nil.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("petrolEngine")
	private Engine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}

	public void journey(String startCity, String endCity) {
		engine.start();
		System.out.println("Journey started from city " + startCity);
		engine.stop();
		System.out.println("Journey stop at city " + endCity);
	}
}
