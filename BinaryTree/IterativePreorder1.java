package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreorder1 {
 class Solution {
    ArrayList<Integer> preOrder(Node root) {
        // code here
        ArrayList<Integer>  list= new ArrayList<>();
        Stack <Node> s = new Stack <>();
        s.push(root);
        while(!s.isEmpty()){
            root=s.pop();
            list.add(root.data);
            if(root.right!= null)s.push(root.right);
            if(root.left!=null)s.push(root.left);
        }
        return list;
    }
}   
}
