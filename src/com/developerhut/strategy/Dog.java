package com.developerhut.strategy;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
		this.walkBehavior = new WalkWithLegs();
	}
	
}
