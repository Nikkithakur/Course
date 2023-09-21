package com.trees;

public class Node {
	Object data;
	Node left;
	Node right;

	Node(Object data) {
		this.data = data;
	}

	Node(Object data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
