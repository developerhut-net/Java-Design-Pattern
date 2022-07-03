package com.developerhut.strategy;

public class Duck extends Animal {

	public Duck() {
		super("Duck");
		this.flyBehavior = new FlyWithWings();
	}
}
