package com.developerhut.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1);

		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2);
	}

}

class Singleton {

	private static Singleton INSTANCE = new Singleton();

	private Singleton() {
		//Heavy logic which takes more CPU Utilization
		//Expensive IO Calls or Database related operation
	}

	public static Singleton getInstance() {

		/*if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}*/

		return INSTANCE;
	}
}
