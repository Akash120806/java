
    //Write your code here
    //returns a boolean value 
    class Sol{

    public static void square(int s) {
        // Complete the code given below
        for(int i=1;i<=s;i++){
                if(i>1){
                System.out.println();}
            
            for(int j=1;j<=s;j++){
                if( i==s || i==1){
                   
                    System.out.print("");
                    System.out.print("*");
                    if(j==s){
                        System.out.println();
                    }
                 
                  
                }
               
                else if(i!= 1 ||i!=s){
                  //  System.out.printl();
                  
                    if(j==1|| j==s){
                        System.out.print("");
                        System.out.print("*");
                    }
                    // else if (j==s) {
                    //     System.out.println();
                        
                    // }
                    else{
                        System.out.print(" ");
                    }
                }
                
            }
           
            
        }
    }
}
class Test14{

public static void main(String[] args) {
  //  boolean ans= prime(121);
        Sol so= new Sol();
        so.square(4);
//     if(ans){
//     System.out.println("true");
//     }
//     else{
//         System.out.println("false");
//     }
     
}
}