package com.developerhut.abstractfactory;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarModel.LUXURY, location);
	}

	@Override
	public void drive() {
		System.out.println("Driving the " + this.model + " car at location " + this.location);
	}

}
