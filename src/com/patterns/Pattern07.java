package com.patterns;

/*
 7.  *****
      ****
       ***
        **
         *
   n rows, values=n-colsize and spaces = rowsize
 
 */
public class Pattern07 {

	public static void main(String[] args) {
		int n = 5;
		for (int row = 0; row <n; row++) {
			for(int space=0; space<row; ++space) {
				System.out.print(" ");
			}
			for(int col = n-row; col>0;--col) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
	}
}
