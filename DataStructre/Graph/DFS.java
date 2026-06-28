package Graph;

import java.util.ArrayList;

public class DFS  {
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        
        dfsHelper(0, adj, visited, result);
        
        return result;
    }
    
    private void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, 
                           boolean[] visited, ArrayList<Integer> result) {
        
        visited[node] = true;
        result.add(node);
        
        // Traverse neighbors in given order
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, adj, visited, result);
            }
        }
    }
}
