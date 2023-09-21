package com.innerclasses;

import com.innerclasses.OuterClass.NestedClass;

/**
 * Outerclass, InnerClass(static,non-static), LocalClass
 * 
 * @author thaprasad
 *
 */
public class MainClass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		NestedClass nc = oc.new NestedClass();
		nc.nhi();
		System.out.println("-------------------");
		OuterClassWithStaticInner.StaticNestedClass.nhi();
		OuterClassWithStaticInner.StaticNestedClass sc = new OuterClassWithStaticInner.StaticNestedClass();
		sc.nhi2();

	}

}
