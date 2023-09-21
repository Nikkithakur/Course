package com.functionalInterfaces;

import java.util.logging.Logger;

public class FI_101 {
	static Logger log = Logger.getLogger("FI_101");

	public static void main(String[] args) {
		
		// Interface only
		Machine sewingMachine = new Machine() {
			@Override
			public void startEngine() {
				System.out.println("SewingMachine started !!!");

			}

			@Override
			public int consumePower() {
				System.out.println("Sewing machine consumes 800KWPH");
				return 800;
			}
		};
		sewingMachine.startEngine();
		sewingMachine.consumePower();
		sewingMachine.name("Usha Sewingmachine");
		Machine.color("Black");
		System.out.println("");

		// Functional Interface
		Vehicle car = new Vehicle() {
			@Override
			public void startEngine() {
				System.out.println("Car engine started !!!");
			}
		};
		car.startEngine();
		car.name("Maruti");
		Vehicle.color("red");
		Vehicle lorry = () -> System.out.println("Lorry engine started !!!");
		lorry.startEngine();
		lorry.name("Ashok leyland");
		Vehicle.color("Brown");
		System.out.println("");
		
		// Functional Interface with annotation
		Shape circle = new Shape() {
			@Override
			public void draw() {
				System.out.println("Circle drawn !!!");
			}
		};
		circle.draw();
		circle.name("Sun");
		Shape.color("Orange circle");
		Shape square = () -> System.out.println("Square drawn !!!");
		square.draw();
		square.name("TimeSquare");
		Vehicle.color("TimeSquare Brown");
		

	}
}


//interface
interface Machine {
	void startEngine();
	int consumePower();
	default void name(String name) {
		System.out.println("Vehicle name: " + name);
	}

	static void color(String color) {
		System.out.println("Vehicle color: " + color);
	}
}

// Functional interface
interface Vehicle {
	void startEngine();

	default void name(String name) {
		System.out.println("Vehicle name: " + name);
	}

	static void color(String color) {
		System.out.println("Vehicle color: " + color);
	}
}

// Functional Interface with compile time check
@FunctionalInterface
interface Shape {
	void draw();

	default void name(String name) {
		System.out.println("Shape name: " + name);
	}

	static void color(String color) {
		System.out.println("Shape color: " + color);
	}
}
