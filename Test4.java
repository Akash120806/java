public class Test4 {
    public static String main(String[] args) {
        String a="Geeks";
        String s2="forGeeks";
        String s3=a+s2;
        System.out.println(s3);
        System.out.println(s3.indexOf("str"));
        String s="GeeksforGeeks";
      String rv="";
        for(int i=s.length()-1;i>=0;i--){
           // char ch =s.charAt(i);
           //rv.append(s.charAt(i));
          // String opv  = rv+s[i];
    }
    String s1 = "geeks";
    String final_S = "";
        // go through whole string
        for (int i = s1.length() - 1; i >= 0; i--) {
            // take S[i] for only odd position
            final_S += s1[i];
        }
        // final string
        return final_S;

     
}
}
