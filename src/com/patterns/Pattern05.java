package com.patterns;

/*
 
 	*
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 
 
 */
public class Pattern05 {

	public static void main(String[] args) {
		int n = 9;
		for (int row = 1; row < 2*n; row++) {
			int col = row;
			if(row>n) {
				col = 2*n - row;
			}
			for (int j = 0; j<col ; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
