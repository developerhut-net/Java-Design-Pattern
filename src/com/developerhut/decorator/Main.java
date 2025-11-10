package com.developerhut.decorator;

public class Main {

	public static void main(String[] args) {

		IceCream simpleIceCream = new SimpleIceCream();
		System.out.println("Cost is $" + simpleIceCream.cost());
		
		//Add vanilla flavour
		IceCream vanillaIceCream = new VanillaFlavour(simpleIceCream);
		System.out.println("Cost is $" + vanillaIceCream.cost());
		
		//Add chocolate
		IceCream chocolateIceCream = new ChocolateFlavour(vanillaIceCream);
		System.out.println("Cost is $" + chocolateIceCream.cost());
		
	}

}
