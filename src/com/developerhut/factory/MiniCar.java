package com.developerhut.factory;

public class MiniCar implements Car {

	CarModel model = CarModel.MINI;

	@Override
	public void drive() {
		System.out.println("Driving "+this.model+" car");
	}
	
}
