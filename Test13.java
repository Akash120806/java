import java.util.*;
public class Test13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int i=2;i<10;i++){
            int prm=(n%i);
            if(prm==0){
                System.out.println("0");
                break;
            }
            else if(i==9){
                System.out.println("1");
            }

          
          
        }


        
    }
    
}
