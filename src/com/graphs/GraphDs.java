package com.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * why do we need graphs? 
 * 	multiple entities with some relationship between them hierarchial or network
 * 
 * Relationship in facebook and instagram A->B , B->A = facebook bidirectional A
 * follows B, B doesn't follow A = instagram unidirectional
 * 
 * Features of graph: entity -> node, relationship -> edge, weight -> edge value
 * graph can be weighted(maps) and unweighted(basic socialnetwork) graph can be
 * directed and undirected graph can be sparse(less connected) or dense(every
 * vertex is connected)
 *
 **** Pair = (node, list) Representation of graph: Adjacency matrix - wastes space
 * for sparse graph Adjacency list - array of linkedlist(Pair) Adjacency map -
 * map of list(Pair) Edgelist - store edges - array of pair - {(Vs,Vd),
 * (V1s,V1d)} - usefule for Krushkal
 */
public class GraphDs {

	public static void main(String[] args) {
		// undirected or bi-directional graphs
		Graph<Integer> graph = new Graph<>();
		graph.print();
		graph.add_edge(1, 2, true);
		graph.add_edge(1, 3, true);
		graph.add_edge(2, 3, true);
		graph.add_edge(2, 4, true);
		graph.add_edge(3, 5, true);
		graph.add_edge(4, 5, true);
		graph.print();
		
		Graph<String> graph2 = new Graph<>();
		graph2.add_edge("A", "B", true);
		graph2.add_edge("A", "C", true);
		graph2.add_edge("B", "C", true);
		graph2.add_edge("B", "D", true);
		graph2.add_edge("C", "E", true);
		graph2.add_edge("D", "E", true);
		graph2.print();
		//graph2.breadth_first_search("A");
		
		
	}

}

class Node<T>{
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
	
	
	void depth_first_search() {
		List<T> visitedNodes = new ArrayList<>();
	}
	
	void breadth_first_search(T srcNode) {
		ArrayDeque<T> queue = new ArrayDeque<>();
		queue.push(srcNode);
		while (queue.size() != 0) {
			T poppedElement = queue.pop();
			System.out.printf(poppedElement + "\t");
			queue.addAll(adj.get(poppedElement));
		}
	}
}
