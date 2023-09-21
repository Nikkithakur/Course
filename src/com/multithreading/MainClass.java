package com.multithreading;

import java.time.ZoneId;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread1 extends Thread {
	Thread1() {
		super("Thread-1");
	}

	public void run() {
		System.out.println("Running... " + Thread.currentThread().getName());
	}
}

class Thread2 extends Thread {
	Thread2() {
		super("Thread-2");
	}

	public void show() {
		System.out.println("Running... " + Thread.currentThread().getName());
	}
}

class Thread3 implements Runnable {
	@Override
	public void run() {
		System.out.println("Running... " + Thread.currentThread().getName());
	}
}

public class MainClass {

	public static void main(String[] args) throws Exception {
		System.out.println("Running... " + Thread.currentThread().getName());
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 thread = new Thread3();
		Thread t3 = new Thread(thread, "Thread-3");
		Thread t4 = new Thread(() 
				-> System.out.println("Running... " + Thread.currentThread().getName()), "Thread-4");

		t1.start();
		t2.start(); // will start thread, nothing will be printed since run() doesn't exist
		t3.start();
		t4.start();
		
		

		/*
		 Invoking join() pauses the caller thread(Main-thread), until the child-thread execution
		 is completed, try by commenting and uncommenting below join calls to see thread-state
		 */
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println(String.format("Thread1:%s, Thread2:%s, Thread3:%s, Thread4:%s", t1.isAlive(), t2.isAlive(),
				t3.isAlive(), t4.isAlive()));
		System.out.println(Thread.currentThread().isAlive());

	}
}
