package com.patterns;

/*
 
 2. *
    **
    ***
    ****
    *****
 one loop for row
 one loop for column and column<=row
 */
public class Pattern02 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
