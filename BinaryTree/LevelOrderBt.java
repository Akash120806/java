import Queue;

package BinaryTree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        if(root==null)return result;
        while(!q.isEmpty()){
            int s= q.size();
            List <Integer> l = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode node = q.poll();
                l.add(node.val);
                if( node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);

            }
            result.add(l);
        }
        return result;
    }
}