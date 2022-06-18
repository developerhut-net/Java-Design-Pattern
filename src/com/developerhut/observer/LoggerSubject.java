package com.developerhut.observer;

public interface LoggerSubject {

	public void addObserver(LoggerObserver observer);
	
	public void removeObserver(LoggerObserver observer);
	
	public void notifyObservers();
	
}
