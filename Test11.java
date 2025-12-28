
import java.util.*;

class Solution {
    public int uniquesubstring(String s) {
            ArrayList<String> substrings = new ArrayList<>();
            HashMap<Integer,Integer> sethy=new HashMap<>();
        //  sethy.add(90);
        HashSet newset=new HashSet();
        HashSet newset1= new HashSet();
            // Generate all substrings of the string
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    // Add the substring s[i..j-1] to the set
                    substrings.add(s.substring(i, j));
                }
            }
            System.out.println(substrings);
            // Return the number of unique substrings
            return substrings.size();
        }
    }
    
    public class Test11 {
        public static void main(String[] args) {
            String s = "abd";
            Solution sol=new Solution();
            int so=sol.uniquesubstring(s); // Output: 6
        System.out.println(so);
    }
}

