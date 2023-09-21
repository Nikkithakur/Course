package com.designpatterns.observerpattern.subscribers;

/**
Subscriber interface is equivalent of Observer interface
in observer design pattern
**/
public class Alice implements Subscriber{
	@Override
	public void receiveUpdates(String message) {
		System.out.println("Alice received:  " + message);
	}
}
