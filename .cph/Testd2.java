 
 
 class Calculator {
    public String Calc2(int t,int f){
        int i=1;
       
         for(;i<=10;){
           
            
            int r=(t*i);
            i++;
            int g=i;
           // t++;
            System.out.println(r);
            for(;i==11;){
                t++;
                int h=g-i;

            }

            

        }
       
      

        
        return "end";
    }
}
    public 




    

class Testd2{
    public static void main(String []ARG){
        Calculator c=new Calculator();
       String e= c.Calc2(2,3); 
       System.out.println(e);

    }

}
