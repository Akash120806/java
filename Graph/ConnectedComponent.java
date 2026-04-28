package Graph;

import java.util.ArrayList;

public class ConnectedComponent {
     public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Step 2: Fill adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected graph
        }
        
        // Step 3: Visited array
        boolean[] visited = new boolean[V];
        
        // Step 4: Store result
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Step 5: Traverse all nodes
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i, adj, visited, component);
                result.add(component);
            }
        }
        
        return result;
    }
    
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> component) {
        visited[node] = true;
        component.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, component);
            }
        }
    }
}
