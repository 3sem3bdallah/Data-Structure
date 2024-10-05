import java.util.*;

public class Adjacency_List {
    public static void main(String[] args) {
        Graph graph = new Graph();

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

        // Uncomment to check for edge
        // System.out.println(graph.checkEdge(0, 1));
    }
}

class Graph {
    ArrayList<LinkedList<Character>> list;

    Graph() {
        list = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Character> currentList = new LinkedList<>();
        currentList.add(node.data);
        list.add(currentList);
    }

    public void addEdge(int src, int dst) {
        char dstData = list.get(dst).get(0);
        list.get(src).add(dstData);
    }

    public boolean checkEdge(int src, int dst) {
        char dstData = list.get(dst).get(0);
        return list.get(src).contains(dstData);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Node " + list.get(i).get(0) + " -> ");
            for (int j = 1; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
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
