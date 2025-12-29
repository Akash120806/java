class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int j = 0;
        int n = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                n++;
            } else {
                if (n > j) {
                    j = n;
                }
                n = 0;
            }
        }
    }
}