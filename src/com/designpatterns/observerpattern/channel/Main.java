package com.designpatterns.observerpattern.channel;

import com.designpatterns.observerpattern.subscribers.Alice;
import com.designpatterns.observerpattern.subscribers.Bob;

public class Main {
	public static void main(String[] args) {

		Alice alice = new Alice();
		Bob bob = new Bob();

		NarutoYTChannel narutoYTChannel = new NarutoYTChannel();
		narutoYTChannel.addSubscriber(alice);
		narutoYTChannel.addSubscriber(bob);

		GameOfThronesYTChannel gameOfThronesYTChannel = new GameOfThronesYTChannel();
		gameOfThronesYTChannel.addSubscriber(bob);

		narutoYTChannel.notifySubscriber("NarutoYTChannel: added new episode !!!");
		gameOfThronesYTChannel.notifySubscriber("GameOfThronesYTChannel: added new episode !!!");

		narutoYTChannel.displaySubscribers();
		gameOfThronesYTChannel.displaySubscribers();
	}
}
