class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> list = new ArrayList<>();
        
        dfs(root, 0, 0, list);
        
        // Sort by:
        // 1. col
        // 2. row
        // 3. value
        Collections.sort(list, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; // col
            if (a[1] != b[1]) return a[1] - b[1]; // row
            return a[2] - b[2]; // value
        });
        
        List<List<Integer>> res = new ArrayList<>();
        
        int prevCol = Integer.MIN_VALUE;
        
        for (int[] node : list) {
            int col = node[0];
            int val = node[2];
            
            if (col != prevCol) {
                res.add(new ArrayList<>());
                prevCol = col;
            }
            
            res.get(res.size() - 1).add(val);
        }
        
        return res;
    }
    
    private void dfs(TreeNode root, int row, int col, List<int[]> list) {
        if (root == null) return;
        
        list.add(new int[]{col, row, root.val});
        
        dfs(root.left, row + 1, col - 1, list);
        dfs(root.right, row + 1, col + 1, list);
    }
}