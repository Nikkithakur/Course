package com.algorithms;

public class Permututations {

	static void permutation(String workingStr, String ans, int ptr) {
		if (workingStr.length() == 0) {
			System.out.println(ans);
			return;
		}

		// time complexity - O(n*n!)
		for (int i = 0; i < workingStr.length(); ++i) {
			char currChar = workingStr.charAt(i);
			String remStr = workingStr.substring(0, i) + workingStr.substring(i + 1);
			permutation(remStr, ans + currChar, ptr + 1);
		}
	}

	public static void main(String[] args) {
		String s = "ABCD";
		permutation(s, "", 0);
	}

}
