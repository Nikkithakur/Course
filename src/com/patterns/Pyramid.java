package com.patterns;

public class Pyramid {

	static void numberPyramid(int n) {
		for(int i=1; i<=n;++i) {
			for(int m=0; m<(n-i);++m) {
				System.out.printf(" ");
			}
			for(int j=1; j<=i;++j) {
				System.out.printf("%d  ", j);
			}
			for(int m=0; m<(n-i);++m) {
				System.out.printf(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		numberPyramid(5);
		//numberPyramid('a');
	}
}
