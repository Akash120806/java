import java.util.*;

class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        int v = adj.size(); // number of vertices
        
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[v];
        
        Queue<Integer> q = new LinkedList<>();
        
        // start from node 0
        q.add(0);
        visited[0] = true;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            result.add(node);
            
            // traverse neighbors in given order
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        
        return result;
    }
}