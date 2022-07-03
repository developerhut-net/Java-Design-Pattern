package com.developerhut.strategy;

public abstract class Animal {

	protected String name;

	protected Walkable walkBehavior;
	protected Flyable flyBehavior;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public void display() {
		System.out.println("I'm " + this.name);
	}
	
	public void letsWalk() {
		walkBehavior.walk();
	}
	
	public void letsFly() {
		flyBehavior.fly();
	}

	public void setWalkBehavior(Walkable walkBehavior) {
		this.walkBehavior = walkBehavior;
	}

	public void setFlyBehavior(Flyable flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
