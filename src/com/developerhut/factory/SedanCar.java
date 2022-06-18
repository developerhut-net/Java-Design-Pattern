package com.developerhut.factory;

public class SedanCar implements Car {

	CarModel model = CarModel.SEDAN;

	@Override
	public void drive() {
		System.out.println("Driving "+this.model+" car");
	}
	
}
