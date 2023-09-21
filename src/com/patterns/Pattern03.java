package com.patterns;

/*
 3. *****
    ****
    ***
    **
    *
  one loop for row = i
  one loop for column = j
  values = j=n-i; j>0 ; --j
 */
public class Pattern03 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j >0; --j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
