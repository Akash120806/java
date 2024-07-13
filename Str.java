public class Str {
    public static void main(String []args){
        //string.toLowerCase convert all char to lowercase
        String st="     Programming in Java Progrmmng for STRING         ";
        String lower = st.toLowerCase();
        System.out.println(lower);
         //string.toUpperCase convert all char to uppercase
        String upper=st.toUpperCase();
        System.out.println(upper);
        //string.trim remove all white spaces from string
        String tr=st.trim();//bt it will not remove the spaces between the string it will remove the the spaces before the string and after the string
        System.out.println(tr);
        //string.substring is a function that will show the string from where you want to  start and where you end the string by giving index in ().
        String sst=tr.substring(1);//here indedx starts from 1 but show the full string from the index you given 
        System.out.println(sst);
        String sst2=tr.substring(1,9);//it will not print the index no. 9 it will  print upto index 8 like range
        System.out.println(sst2);
        //string.replace this fun replce any specific character like "r"is old to"a"is new to all the string whereever r is written it will converit to a.
        //it can also conver any word, letter , or anystring but that will apply to all the string until yEou there is some condition
        String rep=st.replace( " ", "r");//and you have to write it in  " " which characters you wants to change
        System.out.println(rep);
        String rep2=st.replace("pro", "Pro");//as their is nothing like pro so it return same
        System.out.println(rep2);
        String rep3=st.replace("Pro", "Java");
         System.out.println(rep3);
         //string.startsWith give boolean result (true/false)used to check  if the string starts with spedcific letters or not
         boolean sw=tr.startsWith("Pro");
         System.out.println(sw);
        //string.endsWith give boolean result (true/false)used to check  if the string end with spedcific letters or not
        boolean ew=tr.endsWith("G");
        System.out.println(ew);
        //string.charAt()used find the character at given index
        char ch=tr.charAt(3);//we should use char while using charAt ()fun
       System.out.println(ch);
        System.out.println(tr.charAt(7));//we can also write like this
        //string.indexOf() is used to find the index of specific character in string or to find theindex of some part of string from where it started
        
        System.out.println(tr.indexOf("r"));//it will give the index where it will find first r in string 
        System.out.println(tr.indexOf("ramming"));//it will give the index from where this part is starts the (index of r)
        System.out.println(tr.indexOf("ramming",13));/*heere it will search for ramming but after the index no 13 as there is mention
        to search after the given index no;*///////////
        System.out.println(rep.equals("u"));




    }
    
}
