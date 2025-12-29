


import java.util.*;

 class Solution {
    public  ArrayList<Integer> commonelement(int v1[], int v2[])
    {
        ArrayList<Integer> start=new ArrayList<Integer>();
        for(int i=0;i<v1.length;i++){
            for(int j=0;j<v2.length;j++){
                if(v1[i]==v2[j]){
                    start.add(v1[i]);
                }
            }

        }
        return start;
        
    }
}
  class Test10{
    public static void main(String[] args) {
        
     
        Solution so=new Solution ();
        Scanner sc=new Scanner(System.in);
        System.out.println("length of first array");
        int n=sc.nextInt();
        int[] v1=new int[n];
        System.out.println("Fill the element of array v1");
        for(int i=0;i<n;i++){
            v1[i]=sc.nextInt();
            if(i==n-1){
                System.out.println("the array is filled as per yout instruction");
            }

             
        }
        System.out.println("length of Second  array");

        int m=sc.nextInt();
        int[] v2=new int[m];
        System.out.println("Fill the element of array v2");

        for(int j =0;j<m;j++){
            v2[j]=sc.nextInt();
            if(j==m-1){
                System.out.println("the array is filled as per yout instruction");
            }


        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr=so.commonelement(v1,v2);
       // so.common_element([1,2,3],);
      /*  for(int i:arr){
        System.out.println(i);

       }*/
      System.out.println(arr+"these are the commen elements in the two list");
    

      
    }
}
    

