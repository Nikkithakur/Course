package com.designpatterns.observerpattern.subscribers;

/**
Subscriber interface is equivalent of Observer interface
in observer design pattern
**/
public interface Subscriber {
	public void receiveUpdates(String message);
}
