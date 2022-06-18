package com.developerhut.observer;

import java.util.ArrayList;

public class LoginActivity implements LoggerSubject {

	private String username;
	
	private ArrayList<LoggerObserver> observers = new ArrayList<>();

	
	public void userLoggedIn(String username) {
		this.username = username;
		notifyObservers();
	}

	@Override
	public void addObserver(LoggerObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(LoggerObserver observer) {
		this.observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < this.observers.size(); i++) {
			LoggerObserver loggerObserver = this.observers.get(i);
			loggerObserver.log("LoginActivity : User Logged in - "+this.username);
		}
		
	}
	
}
