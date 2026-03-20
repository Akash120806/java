 import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Iterative_Inorder_BT {

    static void inorder(Node root) {

        Stack<Node> stack = new Stack<>(); // stack replaces recursion
        Node curr = root; // start from root

        while (curr != null || !stack.isEmpty()) {

            // STEP 1: Go to extreme left of the tree
            while (curr != null) {
                stack.push(curr);   // store node to process later
                curr = curr.left;   // move left
            }

            /*
            Now curr becomes null.
            That means we reached the leftmost node.
            So we backtrack using stack.
            */

            curr = stack.pop(); // get the last stored node

            System.out.print(curr.data + " "); 
            // Visit the node (Root in Left-Root-Right)

            // STEP 3: Move to right subtree
            curr = curr.right;
        }
    }
}  
