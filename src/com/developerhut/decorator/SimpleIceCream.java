package com.developerhut.decorator;

public class SimpleIceCream implements IceCream {

	public SimpleIceCream() {
		System.out.println("Creating the Simple Ice Cream");
	}

	@Override
	public double cost() {
		return 1;
	}

}
