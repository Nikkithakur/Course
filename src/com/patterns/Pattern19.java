package com.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		int n=5;
		for(int row = 1; row<2*n; ++row) {
			int col=row;
			if(row>n) {
				col = 2*n-row;
			}
			for(int j=0; j<col; ++j) {
				System.out.printf("*");
			}
			// inner space
			int spaceCount = Math.abs(2*n-2*row);
			for(int space=0; space<spaceCount; ++space) {
				System.out.printf(" ");
			}
			for(int j=0; j<col; ++j) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
