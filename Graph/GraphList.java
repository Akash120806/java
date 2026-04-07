package Graph;

import java.util.*;

class GraphList {
    private ArrayList<ArrayList<Integer>> adj;
    private int vertices;

    public GraphList(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // for undirected graph
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphList g = new GraphList(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.printGraph();
    }
}