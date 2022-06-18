package com.developerhut.abstractfactory;

public class TowTruck extends Truck {

	public TowTruck(Location location) {
		super(TruckModel.TOW_TRUCK, location);
	}

	@Override
	public void drive() {
		System.out.println("Driving the " + this.model + " truck at location " + this.location);
	}

}
