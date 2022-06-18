package com.developerhut.abstractfactory;

public class Tractor extends Truck {

	public Tractor(Location location) {
		super(TruckModel.TRACTOR, location);
	}

	@Override
	public void drive() {
		System.out.println("Driving the " + this.model + " truck at location " + this.location);
	}

}
