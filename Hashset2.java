import java.util.HashSet;

public class Hashset2 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet();
        set.add(0);
        set.add(01);
        set.add(02);
        set.add(03);
        System.out.println(set.size());
           //for searching if element exists in the set
    if(set.contains(1)){
        System.out.println("yes");
    }
    else {
        System.out.println("no");
    } 
    if(set.contains(6)){
        System.out.println("yes");
    }
    else {
        System.out.println("no");
    }

 }
}
