package com.patterns;

/*
 8.     *
       ***
      *****
     *******
    *********
 rowsize=[0,n-1], values=[2*rowsize+1], spaces = n-1 to left and n-1 to right
 
 */
public class Pattern08 {

	public static void main(String[] args) {
		int n = 7;
		for (int row = 0; row <n; row++) {
			for(int space=0; space<(n-row-1); ++space) {
				System.out.print(" ");
			}
			for(int col = 0; col<=2*row;++col) {
				System.out.printf("*");
			}
			for(int space=0; space<(n-row-1); ++space) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
