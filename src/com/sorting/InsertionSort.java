package com.sorting;

/**
 * pick first element and put in in the sorted subarray in sorted order
 * @author thaprasad
 *
 */
public class InsertionSort {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void insertionSort(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; ++i) {
			for(int j=0; j<i;++j) {
				if(a[i]<a[j]) {
					swap(a, i, j);
				}
			}
		}
		
		for (int i = 0; i < len; ++i) {
			System.out.printf("%d ", a[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 6, 1, 8, 2, 9, 5, 7, 2 };
		insertionSort(a);
	}
}
