package com.patterns;

/*
 6.      *
        **
       ***
      ****
     *****
 
 n rows 1 loop, col = n-row spaces and row value
 
 */
public class Pattern06 {
	
	public static void main(String[] args) {
		int n = 5;
		for (int row = 1; row <=n; row++) {
			int spaces = n-row;
			for(int space=0; space<spaces; ++ space) {
				System.out.print(" ");
			}
			for (int col = 0; col<row ; ++col) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
