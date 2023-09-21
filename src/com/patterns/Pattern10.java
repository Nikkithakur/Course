package com.patterns;

/*
 10.     *
        * *
       * * *
      * * * *
     * * * * *
   
  row = [0, n-1] times
  outerspace = n-row-1 times
  innerspace = row times
  value = [0, row] times
  
 */
public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;
		for (int row = 0; row <n; row++) {
			for(int out=(n-row-1); out>0; --out) {
				System.out.print(" ");
			}
			int innerSpace = row;
			for(int j=0;j<=row;++j) {
				System.out.printf("*");
				if(innerSpace>0) {
					System.out.printf(" ");
					--innerSpace;
				}
			}
			System.out.println();
		}
	}
}
