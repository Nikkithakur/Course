package com.sorting;

public class MergeSort {

	static void merge(int[] a, int left, int mid, int right) {
		// for a single element left=right=mid so add 1, to create an array of size 1
		int n1 = mid - left + 1; 
		int n2 = right - mid;
		int[] l = new int[n1];
		int[] r = new int[n2];

		for (int index = 0; index < n1; ++index) {
			l[index] = a[left + index];
		}
		for (int index = 0; index < n2; ++index) {
			r[index] = a[mid + 1 + index];
		}
		
		// i,j for traversing temporary arrays and k for traversing original array
		int i = 0, j = 0, k = left;
		// compare and replace in original array
		while (i < n1 && j < n2) {
			if (l[i] < r[j]) {
				a[k] = l[i];
				++i;
			} else {
				a[k] = r[j];
				++j;
			}
			++k;
		}
		
//		for(int m=0; i < n1 && j < n2 ; ++m) { // loop with random variable initialized
//			if (l[i] < r[j]) {
//				a[k] = l[i];
//				++i;
//			} else {
//				a[k] = r[j];
//				++j;
//			}
//			++k;
//		}

		// copy remaining elements from sublist into array
		while (i < n1) {
			a[k] = l[i];
			++k;
			++i;
		}

		// copy remaining elements from sublist into array
		while (j < n2) {
			a[k] = r[j];
			++k;
			++j;
		}

	}

	static void mergeSort(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(a, left, mid);
		mergeSort(a, mid + 1, right);
		merge(a, left, mid, right);
	}

	public static void main(String[] args) {
		int[] a = { 6, 1, 8, 2, 9, 5, 7, 2 };
		mergeSort(a, 0, a.length - 1);
		display(a, a.length);
	}

	static void display(int[] a, int length) {
		for (int i = 0; i < length; ++i) {
			System.out.printf("%d ", a[i]);
		}

	}
}
