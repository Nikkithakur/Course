package com.patterns;

/*
 
 *****
 *****
 *****
 *****
 *****
 
 */
public class Pattern01 {

	// one loop for going row wise, one loop for column
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= n; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
