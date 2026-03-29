class Solution {
    int maxSum = Integer.MIN_VALUE;        // (1)

    public int maxPathSum(TreeNode root) {
        solve(root);                       // (2)
        return maxSum;                     // (3)
    }

    public int solve(TreeNode root) {
        if (root == null) return 0;        // (4)

        int left = Math.max(0, solve(root.left));   // (5)
        int right = Math.max(0, solve(root.right)); // (6)

        int current = left + right + root.val;      // (7)

        maxSum = Math.max(maxSum, current);         // (8)

        return root.val + Math.max(left, right);    // (9)
    }
}