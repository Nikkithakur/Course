package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Krushkal {
	
	public static void main(String[] args) {
		
	}
}

class Node<T> {
	T key;
	int weight;
}

class Graph<T> {
	Map<T, List<T>> adj = new HashMap<>();

	void print() {
		for (T key : adj.keySet()) {
			for (T val : adj.get(key)) {
				System.out.print(key + "-->" + val + " ");
			}
			System.out.println();
		}
	}

	void add_edge(T v1, T v2, boolean biDirectional) {
		push_back(v1, v2);
		if (biDirectional) {
			push_back(v2, v1);
		}
	}

	void push_back(T vertex1, T vertex2) {
		if (null == adj.get(vertex1)) {
			adj.put(vertex1, new ArrayList<>(Arrays.asList(vertex2)));
		} else {
			adj.get(vertex1).add(vertex2);
		}
	}
}
