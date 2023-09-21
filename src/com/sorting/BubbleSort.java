package com.sorting;

/**
 * Bubble sort sorts by swapping adjacent elements
 * @author nikhil
 *
 */
public class BubbleSort {
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void bubbleSort(int []a) {
		int len = a.length;
		for(int i=0 ; i<len-1;++i) {
			for(int j=i+1; j<len; ++j) {
				if(a[i]>a[j]) {
					swap(a, i, j);
				}
			}
		}
		
		for(int i=0 ; i<len;++i) {
			System.out.printf("%d ",a[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {6,1,8,2,9,5,7,2};
		bubbleSort(a);
	}
}
