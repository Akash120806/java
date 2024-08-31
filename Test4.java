

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      /*  int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int[] r={12,3,45,4};
       r[3]=3;
       System.out.println(r[34]);
       int in=0;*/
       //sc.next();
      
       String st="";
       String s=sc.next();
       sc.nextLine();
      char[] ar=new char[s.length()];
      for(int i=0;i<s.length();i=i+2){
       ar[i]=s.charAt(i);
       for(int j=0;j<ar.length;j++){
          st=st+ar[j];
          break;
       }

       
      }
     System.out.println(st);
     


       
       


     
   }
    
}
