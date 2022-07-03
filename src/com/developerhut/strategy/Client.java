package com.developerhut.strategy;

public class Client {

	public static void main(String[] args) {
		
		Animal animal = new Dog();
		animal.display();
		animal.letsWalk();
		animal.setWalkBehavior(new WalkWithWheels());
		animal.letsWalk();
		
		animal = new Duck();
		animal.display();
		animal.letsFly();
		animal.setFlyBehavior(new FlyWithRocket());
		animal.letsFly();
		
		animal = new Snake();
		animal.display();
		
	}

}
