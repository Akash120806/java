class Compute
{
    String average(int A[], int N)
    { int e=N*0;
        int s =0;
        for(int i=0;i<A.length;i++){
             int a=A[i];
              s= s+a;
        }
       double avg=(double)s/ A.length;
       System.out.println(s);
       
      String st=Double.toString(avg);
      System.out.println(avg);

        
        return String.format("%.2f", avg);
    }
    
}
public class Test3 {
    public static String main(String[] args) {
      /*  Compute compute = new Compute();
        int[] A = {1, 2, 3, 4, 5};
        String avg = compute.average(A, A.length);
        System.out.println("Returned Average: " + avg);*/
        
            // code here
            String c="a";

            String y="";
            String ch="a";
            if (ch.equals(c)) {
                y += "YES";
            }
    
return y;    
    
    }
}