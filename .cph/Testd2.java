
import java.util.Scanner;

 
 
 class Calculator {
    public String Calc2(int t,int f){
      Scanner sc= new Scanner(System.in);
       
         for(int i = 0;i<=10;){ 
            int r=(t*i);
            i++;
            int g=i;
           
            
          
           // t++;
            System.out.println(r);
            for(;i==11;){
                t++;
                int h=g-i;
               // System.out.println(h);

            }

            

        }
       
      

        
        return "end";
    }
}
    





    

class Testd2{
    public static void main(String []ARG){
        Calculator c=new Calculator();
       String e= c.Calc2(4115,0); 
       System.out.println(e);

    }

}
