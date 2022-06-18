package com.developerhut.factory;

public class CarClient {

	public static void main(String[] args) {

		CarFactory factory = new CarFactory();
		
		Car car = factory.getCar(CarModel.LUXURY);
		car.drive();
		
		car = factory.getCar(CarModel.MINI);
		car.drive();
		
		car = factory.getCar(CarModel.SEDAN);
		car.drive();
		
	}

}
