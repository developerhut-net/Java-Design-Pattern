package com.developerhut.observer;

public class LoginMain {

	public static void main(String[] args) throws InterruptedException {
		ConsoleLogger consoleLogger = new ConsoleLogger();
		FileLogger fileLogger = new FileLogger();
		
		LoginActivity loginActivity = new LoginActivity();
		loginActivity.addObserver(consoleLogger);
		loginActivity.addObserver(fileLogger);
		
		loginActivity.userLoggedIn("James");
		Thread.sleep(2000);
		
		loginActivity.userLoggedIn("Harry");
		loginActivity.removeObserver(consoleLogger);
		Thread.sleep(2000);
		
		loginActivity.userLoggedIn("Tom");
	}

}
