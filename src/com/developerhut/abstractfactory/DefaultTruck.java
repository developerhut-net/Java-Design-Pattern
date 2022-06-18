package com.developerhut.abstractfactory;

public class DefaultTruck extends Truck {

	public DefaultTruck(Location location) {
		super(TruckModel.TOW_TRUCK, location);
	}

	@Override
	public void drive() {
		System.out.println("Truck not available for location " + this.location);
	}

}
