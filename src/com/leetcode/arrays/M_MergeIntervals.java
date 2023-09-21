package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class M_MergeIntervals {

	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		print(intervals);
		ArrayList<int[]> ans = new ArrayList<>();
		for(int[] temp: intervals) {
			if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < temp[0]) {
				ans.add(temp);
			} else {
				int[] curr = new int[2];
				curr[0] = ans.get(ans.size() - 1)[0]; 
				curr[1] = temp[1];
				ans.remove(ans.size() - 1);
				ans.add(curr);
			}
		}

		return ans.toArray(new int[ans.size()][]);
	}
	
	public static void print(int[][] intervals) {
		for(int[] i: intervals) {
			for(int j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] intervals = { { 8, 10 }, { 1, 3 }, { 2, 6 }, { 15, 18 } };
		int[][] ans = merge(intervals);
		System.out.println("----------- Answer---------");
		print(ans);
	}
}
