package com.developerhut.decorator;

public class ChocolateFlavour extends IceCreamDecorator {

	public ChocolateFlavour(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding Chocolate Flavour");
		return 1.5 + super.cost();
	}

}
