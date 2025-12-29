class Solution {
    public int lastIndex(String s) {
      //  String st=Integer.toString(s);
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                return 1;
            }
        }
      return -1;

    }
}
public class AllTest {
    public static void main(String[] args) {
        Solution so=new Solution();
        int s=so.lastIndex("00001");
        System.out.println(s);
    }
}
