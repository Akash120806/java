public class Nestedloop {
    public static void main(String[] args) {
        int x=6;
        
        int y=32;
        int r=x+y;// 38
      //  System.out.println(r);
        while(x+y<40){ 
           
            int j=3;
            while(j>=0) {
                System.out.println("hello"+j);
                j=j-1;
            }
            x++;// 7
            System.out.println(x);// 7
            
        }

    }
    
}
