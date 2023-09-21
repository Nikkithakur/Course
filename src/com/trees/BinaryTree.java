package com.trees;

public class BinaryTree {

	Node createNode(Object data, Node left, Node right) {
		return new Node(data, left, right);
	}

	void assignLeftNode(Node node, Node leftNode) {
		node.left = leftNode;
	}

	void assignRightNode(Node node, Node rightNode) {
		node.right = rightNode;
	}
	
	void bfs(Node node) {
		
	}
	
	public static void main(String[] args) {
		
	}

}
