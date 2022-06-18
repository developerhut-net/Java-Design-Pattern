package com.developerhut.factory;

public class CarFactory {

	public Car getCar(CarModel carModel) {
		
		Car car = null;
		
		switch(carModel) {
		
			case LUXURY:
				car = new LuxuryCar();
				break;
				
			case MINI:
				car = new MiniCar();
				break;
				
			case SEDAN:
				car = new SedanCar();
				break;
				
		}
		
		return car;
	}
}
