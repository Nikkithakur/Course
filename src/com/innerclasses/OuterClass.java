package com.innerclasses;

public class OuterClass {
	private int oid = 1;
	private static int osid = 001;

	private void ohi() {
		int a = 10;
		System.out.println("ohi()");
	}

	private static void ohello() {
		System.out.println("ohello()");
	}

	class NestedClass {
		private int nid = 2;
		private int nsid = 002;
		private static final int var = 189;
	//static not allowed
	// 	private static int abc = 98;

		void nhi() {
			System.out.println(String.format("nhi() -> NestedClass vars %s, %s", nid, nsid));
			System.out.println(String.format("nhi() -> OuterClass vars %s, %s", oid, osid));
			System.out.println(String.format("nhi() -> NestedClass static final vars %s", var));
			ohi();
			ohello();
		}
//		static not allowed
//		static void abc() {}
	}

}
