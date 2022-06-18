package com.developerhut.abstractfactory;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarModel.SEDAN, location);
	}

	@Override
	public void drive() {
		System.out.println("Driving the " + this.model + " car at location " + this.location);
	}

}
