package com.sorting;
public class SortingAlgorithms_BS_IS_SS_MS_QS {

	public static void main(String[] args) {
		bubblesort(new int[] { 6, 1, 8, 2, 9, 5, 7, 2 });
		insertionsort(new int[] { 6, 1, 8, 2, 9, 5, 7, 2 });
		selectionsort(new int[] { 6, 1, 8, 2, 9, 5, 7, 2 });
		mergesort(new int[] { 6, 1, 8, 2, 9, 5, 7, 2 }, 0, 7);
		quicksort(new int[] { 6, 1, 8, 2, 9, 5, 7, 2 }, 0, 7);
	}

	// every outer iteration biggest element moves towards end
	static void bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (arr[i] > arr[j])
					swap(arr, i, j);
			}
		}
		printArray(arr, new Object() {}.getClass().getEnclosingMethod().getName());
	}

	// 2 subarrays-(sorted and unsorted), insert current element in sortedsubarray
	static void insertionsort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < i; ++j) {
				if (arr[j] > arr[i])
					swap(arr, i, j);
			}
		}
		printArray(arr, new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	// 2 subarrays-(sorted and unsorted), insert min element from unsortedsubarray at beginning of it
	static void selectionsort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			int minIndex = minIndex(arr, i);
			if (arr[i] > arr[minIndex])
				swap(arr, i, minIndex);
		}
		printArray(arr, new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	private static int minIndex(int[] arr, int start) {
		int min = start;
		for (int i = start + 1; i < arr.length; ++i) {
			if (arr[i] < arr[min])
				min = i;
		}
		return min;
	}
	
	// divide, sort and merge, recursive
	static void mergesort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergesort(arr, left, mid);
			mergesort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int[] c1 = new int[mid - left + 1];
		int[] c2 = new int[right - mid];

		for (int index = 0; index < c1.length; ++index) {
			c1[index] = arr[left + index];
		}

		for (int index = 0; index < c2.length; ++index) {
			c2[index] = arr[mid + 1 + index];
		}

		int i = 0, j = 0, k = left;
		while (i < c1.length && j < c2.length) {
			if (c1[i] < c2[j]) {
				arr[k++] = c1[i++];
			} else {
				arr[k++] = c2[j++];
			}
		}

		while (i < c1.length) {
			arr[k++] = c1[i++];
		}

		while (j < c2.length) {
			arr[k++] = c2[j++];
		}
		printArray(arr, new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	// sort based on pivot, LHS<Pivot and RHS>Pivot
	static void quicksort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotindex = getPivot(arr, left, right);
			quicksort(arr, left, pivotindex - 1);
			quicksort(arr, pivotindex + 1, right);
			printArray(arr, new Object() {}.getClass().getEnclosingMethod().getName());
		}
	}

	private static int getPivot(int[] arr, int left, int right) {
		int pivotelement = arr[left];
		int i = left + 1, j = right;
		while (i < j) {
			while (i < arr.length && arr[i] < pivotelement)
				++i;
			while (arr[j] > pivotelement)
				--j;
			if (i < j)
				swap(arr, i, j);
		}
		swap(arr, left, j);
		return right;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(int[] arr, String apiname) {
		System.out.print(apiname + " : ");
		for (int i = 0; i < arr.length; ++i) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

}
