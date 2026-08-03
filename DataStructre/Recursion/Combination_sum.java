import java.util.ArrayList;
import java.util.List;

public class Combination_sum {
 

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(0, candidates, target, temp, ans);

        return ans;
    }

    public void helper(int index, int[] candidates, int target,
                       List<Integer> temp,
                       List<List<Integer>> ans) {

        // Found one valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Invalid path
        if (target < 0 || index == candidates.length) {
            return;
        }

        // Choose current number
        temp.add(candidates[index]);
        helper(index, candidates, target - candidates[index], temp, ans);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Skip current number
        helper(index + 1, candidates, target, temp, ans);
    }
}

