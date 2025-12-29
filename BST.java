
public class BST {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return newNode(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = { 10, 5, 15, 3, 7, 12 };
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        inorder(root);
    }
}
