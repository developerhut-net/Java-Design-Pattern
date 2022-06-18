package com.developerhut.factory;

public class LuxuryCar implements Car {

	CarModel model = CarModel.LUXURY;

	@Override
	public void drive() {
		System.out.println("Driving "+this.model+" car");
	}
	
}
