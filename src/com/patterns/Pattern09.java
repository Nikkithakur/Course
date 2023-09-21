package com.patterns;

/*
 9. *********
     *******
      *****
       ***
        *
   row = [n-1, 0]
   col=[2*row+1]
   spaces= n-row-1
 */
public class Pattern09 {

	public static void main(String[] args) {
		int n = 5;
		for (int row = n-1; row >=0; row--) {
			for(int space=0; space<=n-row-1; ++space ) {
				System.out.printf(" ");
			}
			for(int j=(2*row+1); j>0;j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
