package com.developerhut.observer;

public class FileLogger implements LoggerObserver {

	@Override
	public void log(String message) {
		System.out.println("[File] "+message);
	}

}
