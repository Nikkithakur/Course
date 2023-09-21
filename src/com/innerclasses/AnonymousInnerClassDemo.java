package com.innerclasses;

import java.util.function.Function;

public class AnonymousInnerClassDemo {

	// create obj/implementation of a class without subtyping it
	// static block/initializer or members not allowed
	public static void main(String[] args) {
		// 1. ThreadDemo not required to extend Thread class for creating a thread, Obj created without className
		Thread t = new Thread() {
			private int a = 99;
			static final int  b = 88;
			void m1() {
				System.out.println("m1() -> a:" + a +" b:" +b+Thread.currentThread().getName());
			}
			@Override
			public void run() {
				m1();
				System.out.println("Hello! from " + Thread.currentThread().getName());
			}

		};
		t.start();
		
		// 2. Anonymous innerclass implementating interface
		Runnable r = new Runnable() {
			private int a = 99;
			static final int  b = 88;
			void m1() {
				System.out.println("m1() -> a:" + a +" b:" +b+Thread.currentThread().getName());
			}
			@Override
			public void run() {
				m1();
				System.out.println("Hello! from " + Thread.currentThread().getName());
			}
		};
		new Thread(r).start();
		
		// 3. Anonymous innerclass in contructor
		new Thread(new Runnable() {
			private int a = 99;
			static final int  b = 88;
			void m1() {
				System.out.println("m1() -> a:" + a +" b:" +b+Thread.currentThread().getName());
			}
			@Override
			public void run() {
				m1();
				System.out.println("Hello! from " + Thread.currentThread().getName());
			}
		}).start();
		
		// 4. Anonymous innerclass for functional interface
		double x = new Function<Integer, Double>() {
			static final double constant = 3.14;
			@Override
			public Double apply(Integer t) {
				return constant*t*t;
			}
		}.apply(3);
		
		double y = new Function<Integer, Double>() {
			@Override
			public Double apply(Integer t) {
				return (double) (t*t);
			}
		}.apply(2);
		
		System.out.println("Area of circle with 3cm radius: " + x);
		System.out.println("Area of square with 2cm side: " + y);
		
		C classC = new AnonymousInnerClassDemo().new C() {
			@Override
			public void bm1() {
			System.out.println("implemented in AnonymousInnerClassDemo" + aid + ssid);
			}
			
			void am1() {
				System.out.println("implemented in AnonymousInnerClassDemo");
			}
		};
		
		classC.am1();
		classC.bm1();
		
		
	}
	
	class A{
		int aid = 190;
		void am1() {
			System.out.println("implemented in A class directly");
		}
	}

	interface B{
		int ssid = 12345;
		void bm1();
	}

	// Nested Class
	class C extends A implements B{
		@Override
		public void bm1() {
		System.out.println("implemented in C class directly");
		}

	}
}
