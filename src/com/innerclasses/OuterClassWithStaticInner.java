package com.innerclasses;

public class OuterClassWithStaticInner {

	private int oid = 1;
	private static int osid = 001;

	private void ohi() {
		int a = 10;
		System.out.println("ohi()");
	}

	private static void ohello() {
		System.out.println("ohello()");
	}

	
	static class StaticNestedClass {
		private static int snid = 2;
		private int snsid = 002;
		private static final int snabc = 190;

		static void nhi() {
//			ohi(); //not allowed
			ohello();
		}
		
		void nhi2() {
			snid = 124;
			System.out.println(String.format("nhi2() -> NestedClass vars %s, %s", snid, snsid));
			System.out.println(String.format("nhi2() -> OuterClass vars %s, %s", null, osid));
//			ohi(); // notallowed
//			ohello(); //allowed
		}
	}
}
