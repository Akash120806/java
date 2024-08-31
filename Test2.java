import java.util.ArrayList;
import java.util.Collections;
class Test2
{
    public static void main(String[] args) {
                int[]v1 =  {3, 4, 2, 2, 4};
                int[] v2= {3, 2, 2, 7};
                // int [] r={1};
              ArrayList<Integer> arr=new ArrayList<>();
             // System.out.print(r[0]);
            // int[] v3={};
              for(int i =0; i<v1.length;i++){
                 for(int j =0;j<v2.length;j++){
                     if(v1[i]==v2[j]){
                        arr.add(v1[i]);
                       
                       
                     }
                 }
             }
             Collections.sort(arr);
             System.out.println(arr);     

        
            
    }
}
String s=sc.nextLine();
ArrayList<Character> ar = new ArrayList<Character>();
for(int i=0;i<s.length();i++){
    char st=s.charAt(i);

 ar.add(st);
}
for(int i=0;i<ar.size();i=i+2){
    ar.remove(i);

}
//  System.out.println(ar);
String r="";
for(int i=0;i<ar.size();i++){
  r=r+ar;
}
System.out.println(r);




