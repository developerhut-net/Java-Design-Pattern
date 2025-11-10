package com.developerhut.decorator;

public class VanillaFlavour extends IceCreamDecorator {

	public VanillaFlavour(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding Vanilla Flavour");
		return 1.5 + super.cost();
	}

}
