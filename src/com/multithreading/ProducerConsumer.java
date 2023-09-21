package com.multithreading;

import java.time.LocalDateTime;

class Product {
	String stage;
	public Product(String stage) {
		this.stage = stage;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
}

class Producer implements Runnable {
	Product product;
	Producer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(3000);
			synchronized (product) {
				product.setStage(name + " work done and can be consumed");
				product.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Retailer implements Runnable {
	Product product;
	Retailer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (product) {
			try {
				System.out.println(name + " waiting to get notified at time:" + LocalDateTime.now().toString());
				product.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name+" thread got notified at time:"+LocalDateTime.now().toString());
            System.out.println(name+" processed: "+product.getStage());
		}
	}
}

public class ProducerConsumer {

	public static void main(String[] args) throws Exception {
		
		    Product product = new Product("To Be Produced");
		    Producer producer = new Producer(product);
	        Retailer retailer = new Retailer(product);
	        new Thread(retailer, "Retailer").start();// retailer waits for product until notify is called by producer
	        new Thread(producer,"Producer").start();// producers produces product and notifies
	        
	        System.out.println("All the threads are started");

	}

}
