package com.developerhut.abstractfactory;

public abstract class Truck implements FourWheeler {

	TruckModel model;
	Location location;

	public Truck(TruckModel model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}

}
