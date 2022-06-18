package com.developerhut.abstractfactory;

public class USAFourWheelerFactory extends FourWheelerFactory {

	public Car createCar(CarModel model) {

		Car car = null;

		switch (model) {
		
			case LUXURY:
				car = new LuxuryCar(Location.USA);
				break;
	
			case SEDAN:
				car = new SedanCar(Location.USA);
				break;
				
			default:
				car = new DefaultCar(Location.USA);
				break;
		}

		return car;
	}

	public Truck createTruck(TruckModel model) {

		Truck truck = null;

		switch (model) {
			case TOW_TRUCK:
				truck = new TowTruck(Location.USA);
				break;
	
			default:
				truck = new DefaultTruck(Location.USA);
				break;
		}

		return truck;
	}

}
