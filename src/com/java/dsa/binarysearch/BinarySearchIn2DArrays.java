package com.java.dsa.binarysearch;

public class BinarySearchIn2DArrays {

	static int[][] arr = { 	{ 12, 19, 28 }, 
							{ 13, 20, 29 },
							{ 15, 24, 32 } 
						 };

	static String normalSearch(int a[][], int len, int target) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == target) {
					return String.format("(%s,%s)", i, j);
				}
			}
		}
		return "-1";
	}
	
	public static void main(String[] args) {
		String index = normalSearch(arr, arr.length, 11);
		System.out.println(index);
		index = normalSearch(arr, arr.length, 24);
		System.out.println(index);
	}
}
