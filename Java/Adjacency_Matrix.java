import java.util.ArrayList;

public class Adjacency_Matrix {

	// Adjacency Matrix = An array to store 1's/0's to represent edges
	// # of rows = # of unique nodes
	// # of columns = # of unique nodes

	// runtime complexity to check an Edge: O(1)
	// space complexity: O(v^2)
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));

		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);

		graph.print();
		// System.out.println(graph.checkEdge(0, 1)); // Uncomment to check for edge
	}
}

class Graph {
	ArrayList<Node> nodes;
	int[][] matrix;

	Graph(int size) {
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}

	public void addNode(Node node) {
		nodes.add(node);
	}

	public void addEdge(int src, int dst) {
		matrix[src][dst] = 1;
		// Uncomment the next line for undirected graph
		// matrix[dst][src] = 1;
	}

	public boolean checkEdge(int src, int dst) {
		return matrix[src][dst] == 1;
	}

	public void print() {
		System.out.print("  ");
		for (Node node : nodes) {
			System.out.print(node.data + " ");
		}
		System.out.println();

		for (int i = 0; i < matrix.length; i++) {
			System.out.print(nodes.get(i).data + " ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class Node {
	char data;

	Node(char data) {
		this.data = data;
	}
}
