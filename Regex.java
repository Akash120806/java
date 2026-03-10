import java.util.*;

   

class Regex{
     public static String CheckEmail(String a){
        String regex="^[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,}$";
        if(a.matches(regex)){
            return a+"its valid";
        }
        return "Invalid email";
    }
    public static void main(String []args){
        String a="akash5399@gmail.com";
       System.out.println(CheckEmail(a));
    }
 
}