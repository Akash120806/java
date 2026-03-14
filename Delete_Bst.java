public class Delete_Bst {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
        }
    public TreeNode delete(TreeNode root, int key){
        if(root==null){
            return null;
        }
        else if(root.val>key){
            root.left=delete(root.left, key);
        }
        else if(root.val<key){
            root.left=delete(root.right, key);
        }
        else{
            if(root.left==null && root.right == null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                TreeNode successor = findsuccNode(root.right);
                root.val = successor.val;
                root.right=delete(root.right, successor.val);

            }


        }
        
        return root;

    }
    public  TreeNode findsuccNode(TreeNode root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
    }
}
}