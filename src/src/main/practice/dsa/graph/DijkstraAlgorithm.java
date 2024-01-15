package src.main.practice.dsa.graph;

import java.util.*;

public class DijkstraAlgorithm {

    static class Graph {
        private int vertices;
        private List<Edge>[] adjacencyList;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new ArrayList[vertices];
            for (int i = 0; i < vertices; ++i) {
                adjacencyList[i] = new ArrayList<>();
            }
        }

        void addEdge(int source, int destination, int weight) {
            adjacencyList[source].add(new Edge(destination, weight));
            adjacencyList[destination].add(new Edge(source, weight)); // for undirected graph
        }

        int[] dijkstra(int source) {
            int[] distance = new int[vertices];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[source] = 0;

			PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
            minHeap.add(new Node(source, 0));

            while (!minHeap.isEmpty()) {
                int current = minHeap.poll().vertex;

                for (Edge neighbor : adjacencyList[current]) {
                    int newDistance = distance[current] + neighbor.weight;

                    if (newDistance < distance[neighbor.destination]) {
                        distance[neighbor.destination] = newDistance;
                        minHeap.add(new Node(neighbor.destination, newDistance));
                    }
                }
            }

            return distance;
        }
    }

    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Node {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        int source = 0;

        Graph graph = new Graph(vertices);

        // Adding edges to the graph
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 4);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 4, 1);
        graph.addEdge(3, 2, 1);
        graph.addEdge(3, 4, 5);

        int[] distance = graph.dijkstra(source);

        System.out.println("Shortest distances from source (" + source + "):");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To " + i + ": " + distance[i]);
        }
    }
}