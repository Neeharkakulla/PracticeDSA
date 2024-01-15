package practice.dsa.graph;

import java.util.LinkedList;

public class Graph {
	int vertices;
	LinkedList<Integer> adj[];

	Graph(int v) {
		this.vertices = v;
		adj = new LinkedList[this.vertices];
		for (int i = 0; i < this.vertices; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}
}
