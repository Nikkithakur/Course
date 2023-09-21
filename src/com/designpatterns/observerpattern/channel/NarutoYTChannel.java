package com.designpatterns.observerpattern.channel;

import java.util.ArrayList;
import java.util.List;

import com.designpatterns.observerpattern.subscribers.Subscriber;

/**
Channel interface is equivalent of Subject interface
in observer design pattern
**/
public class NarutoYTChannel implements Channel{
	
	List<Subscriber> subscriberList = new ArrayList<>();

	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscriberList.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		subscriberList.remove(subscriber);
		
	}

	@Override
	public void notifySubscriber(String message) {
		subscriberList
		.forEach(subscriber -> subscriber.receiveUpdates(message));
	
	}
	
	public void displaySubscribers() {
		subscriberList
				.forEach(subscriber -> System.out.println("NarutoYTChannel: " + subscriber.getClass().getSimpleName()));
	}

}
