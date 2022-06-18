package com.developerhut.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
		CarModel carModel = CarModel.LUXURY;
		TruckModel truckModel = TruckModel.TOW_TRUCK;
		Location location = Location.INDIA;
		
		Car car = null;
		Truck truck = null;
		
		FourWheelerFactory factory = FourWheelerFactory.getFactory(location);
		
		car = factory.createCar(carModel);
		truck = factory.createTruck(truckModel);
				
		car.drive();
		truck.drive();
	}

}
