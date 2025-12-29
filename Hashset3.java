import java.util.*;
import java.util.HashSet;

public class Hashset3 {
    public static void main(String[] args ) {
        HashSet <Integer> hash= new HashSet<>();
        HashSet<Double> set=new HashSet<>();
        hash.add(45);
        hash.add(89);
        hash.add(54);
        hash.add(78);
        hash.add(25);
        System.out.println(hash);
       System.out.println( hash.contains(45));
        hash.isEmpty();
        hash.remove(65);
       System.out.println(  hash.size());
        // making an clone of the hashset hash
        class Cloning{
            String clone;
            public Cloning(String clone){
                this.clone=clone;
            }
        }
        HashSet<Cloning> cloned=(HashSet<Cloning>) hash.clone();
        System.out.println(cloned);

    }
    
}


