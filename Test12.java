
import java.util.*;

class Jolution {
    public int uniquesubstring(String s) {
            ArrayList<String> substrings = new ArrayList<>();
           // HashSet<Integer> sethy=new HashSet<>();
        //  sethy.add(90);
        HashSet newset=new HashSet();
            // Generate all substrings of the string
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    // Add the substring s[i..j-1] to the set
                    substrings.add(s.substring(i, j));
                }
            }
          //  System.out.println(substrings);
            // Return the number of unique substrings
            return substrings.size();
        }
    }
    
    public class Test12 {
        public static void main(String[] args) {
            String s = "abd";
            Jolution sol=new Jolution();
            int so=sol.uniquesubstring(s); // Output: 6
        System.out.println(so);
    }
}

