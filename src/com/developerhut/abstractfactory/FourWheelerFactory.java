package com.developerhut.abstractfactory;

public abstract class FourWheelerFactory {

	public abstract Car createCar(CarModel model);
	
	public abstract Truck createTruck(TruckModel model);
	
	public static FourWheelerFactory getFactory(Location location) {
		
		FourWheelerFactory factory = null;
		
		switch (location) {
		
			case USA:
				factory = new USAFourWheelerFactory();
				break;
	
			case INDIA:
				factory = new IndiaFourWheelerFactory();
				break;
				
			default:
				break;
		}
		
		return factory;
		
	}
	
}
