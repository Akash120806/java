import java.util.HashSet;
import java.util.Iterator;

public class Itterator {
    public static void main(String [ ] args){
        HashSet newset=new HashSet();
        
        newset.add(88);
        newset.add(85);
        newset.add(87);
        newset.add(89);
        newset.add(82);
        System.out.println(newset);
       // System.out.println(newset);
    /* System.out.println( newset.size());
        if ( newset.contains(88)){
        System.err.println("yes");}
        System.out.println(" ");*/


       
        Iterator iter= newset. iterator();
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
      //  iter.remove();
        System.out.println(newset);
       
    }
    
}


