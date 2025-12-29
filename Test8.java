class Solution {
     String delAlternate(String S) {
        String r="";
        for (int i=0;i<S.length();i++){
            if(i%2==0){
                r+=S.charAt(i);
                if(i>=S.length()){
                    break;
                }
              //m l l ,  m   System.out.println(r);
            }
           


        }
       
        return r;
        
    }
}

class Test8{
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       Solution so= new Solution();
       String s=so.delAlternate("Geeks");
       System.out.println(s);

    }
}