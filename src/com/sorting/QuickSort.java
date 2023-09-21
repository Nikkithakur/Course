package com.sorting;

public class QuickSort {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

// LHS lower, RHS - greater
	static int partitionIndex(int[] a, int low, int high) {
		int pivot = a[low];
		int i = low+1, j = high;
		
		while (i < j) {
			while (i<a.length && a[i] <= pivot) {
				++i;
			}
			while (a[j] > pivot) {
				--j;
			}
			if (i < j)
				swap(a, i, j);
		}
		swap(a, low, j);
		return j;
	}

	static void display(int[] a, int length) {
		for (int i = 0; i < length; ++i) {
			System.out.printf("%d ", a[i]);
		}
	}

	static void quicksort(int[] a, int low, int high) {
		if (low < high) {
			int location = partitionIndex(a, low, high);
			quicksort(a, low, location - 1);
			quicksort(a, location + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] a = { 6, 1, 8, 2, 9, 5, 7, 2 };
		quicksort(a, 0, a.length - 1);
		display(a, a.length);

	}
}
