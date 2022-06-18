package com.developerhut.abstractfactory;

public class IndiaFourWheelerFactory extends FourWheelerFactory {

	public Car createCar(CarModel model) {

		Car car = null;

		switch (model) {
		
			case SEDAN:
				car = new LuxuryCar(Location.INDIA);
				break;
	
			default:
				car = new DefaultCar(Location.INDIA);
				break;
		}

		return car;
	}

	public Truck createTruck(TruckModel model) {

		Truck truck = null;

		switch (model) {
			case TRACTOR:
				truck = new TowTruck(Location.INDIA);
				break;
	
			default:
				truck = new DefaultTruck(Location.INDIA);
				break;
		}

		return truck;
	}

}
