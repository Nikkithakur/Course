package com.sorting;

/**
 * select min element from unsorted subarray and add it to the beginning of the unsorted subarray
 * 
 * @author nikhil
 *
 */
public class SelectionSort {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int minIndex(int[] a, int i) {
		int minIndex = i;
		int len = a.length;
		for (int j = i; j < len; ++j) {
			if (a[j] < a[minIndex]) {
				minIndex = j;
			}
		}
		return minIndex;
	}

	public static void selectionSort(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; ++i) {
			int minIndex = minIndex(a, i);
			swap(a, i, minIndex);
		}

		for (int i = 0; i < len; ++i) {
			System.out.printf("%d ", a[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 6, 1, 8, 2, 9, 5, 7, 2 };
		selectionSort(a);
	}
}
