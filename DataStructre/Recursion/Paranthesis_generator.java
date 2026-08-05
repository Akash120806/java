import java.util.ArrayList;
import java.util.List;

public class Paranthesis_generator {
   

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        // start recursion
        backtrack(ans, "", 0, 0, n);

        return ans;
    }

    // current = current string
    // open = number of '(' used
    // close = number of ')' used
    public void backtrack(List<String> ans, String current,
                          int open, int close, int n) {

        // If string length becomes 2*n,
        // one valid combination is formed.
        if (current.length() == 2 * n) {
            ans.add(current);
            return;
        }

        // We can add '(' if open brackets are still available
        if (open < n) {
            backtrack(ans, current + "(", open + 1, close, n);
        }

        // We can add ')' only if
        // closing brackets are fewer than opening brackets
        if (close < open) {
            backtrack(ans, current + ")", open, close + 1, n);
        }
    }

}
