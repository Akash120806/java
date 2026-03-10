public class Ceil_Bst {
      int findCeil(Node root, int x) {
        // code here
        int  y=-1;
     
        while(root!= null ){
            if(root.data==x){
                return root.data;
            }
            else if(x>root.data){
                root=root.right;
            }
            else{
                y=root.data;
                root=root.left;
            }
        }
            return y;
    }

}
