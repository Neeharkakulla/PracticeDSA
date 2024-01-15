package practice.dsa.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void main(String[] args) {
		Graph graph = new Graph(4);

		// Add edges to the graph
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);

		System.out.println("Breadth-First Traversal (starting from vertex 2):");
		bfs(graph, 2);
	}

	private static void bfs(Graph graph, int source) {
		boolean visited[] = new boolean[graph.vertices];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		visited[source] = true;

		while (!queue.isEmpty()) {
			source = queue.poll();
			System.out.print(source+" ");
			for (Integer neighbour : graph.adj[source]) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
				}
			}
		}
	}
}
