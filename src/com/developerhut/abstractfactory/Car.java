package com.developerhut.abstractfactory;

public abstract class Car implements FourWheeler {

	CarModel model;
	Location location;

	public Car(CarModel model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}

}
