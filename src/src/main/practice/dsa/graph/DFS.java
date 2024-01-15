package src.main.practice.dsa.graph;

import java.util.Stack;

public class DFS {
	public static void main(String[] args) {
		Graph graph = new Graph(7);

		// Add edges to the graph
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(2, 5);
		graph.addEdge(3, 4);
		graph.addEdge(4, 6);

		System.out.println("Depth-First Traversal (starting from vertex 0):");
		dfs(graph, 0);
	}

	private static void dfs(Graph graph, int source) {
		boolean visited[] = new boolean[graph.vertices];
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		visited[source] = true;
		while (!stack.isEmpty()) {
			source = stack.pop();
			System.out.print(source + " ");
			for (Integer neighbour : graph.adj[source]) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					stack.push(neighbour);
				}
			}
		}
	}

}
