package com.designpatterns.observerpattern.channel;

import com.designpatterns.observerpattern.subscribers.Subscriber;

public interface Channel {

	public void addSubscriber(Subscriber subscriber);

	public void removeSubscriber(Subscriber subscriber);

	public void notifySubscriber(String message);

}
