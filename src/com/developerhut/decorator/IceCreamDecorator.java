package com.developerhut.decorator;

public class IceCreamDecorator implements IceCream {

	private IceCream iceCream;

	public IceCreamDecorator(IceCream iceCream) {
		super();
		this.iceCream = iceCream;
	}

	@Override
	public double cost() {
		return 0.5 + this.iceCream.cost();
	}
	
}
