package BinaryTree;
public class BinarySearchTree {
    public static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        } else if (root.data < val) {
            root.left = insert(root.left, val);
        } else if (root.data > val) {
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

   /* public static boolean Search(Node root, int key) {
        if (root.data > key) {
            return Search(root.left, key);
        } else if (root.data == key) {
            System.out.println(root.data + "found");
        } else if (root.data < key) {
            return Search(root.right, key);
        }
        return false;
    }*/ 

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
        inorder(root);
        // if (Search(root, 2))
        //     System.out.println("found");
        // else {
        //     System.out.println("not found");
        // }
        
    }
}
