package com.developerhut.abstractfactory;

public class DefaultCar extends Car {

	public DefaultCar(Location location) {
		super(CarModel.DEFAULT, location);
	}

	@Override
	public void drive() {
		System.out.println("Car not available for location " + this.location);
	}

}
