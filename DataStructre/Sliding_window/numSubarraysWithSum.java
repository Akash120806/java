package Sliding_window;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal){
        return numSubarraysWithSumAtMostK(nums, goal)-numSubarraysWithSumAtMostK(nums,goal-1);
    }
    public int numSubarraysWithSumAtMostK(int[] nums, int goal) {
        int left =0 ;
        int sum =0 ;
         int count=0;
         for(int right =0 ; right<nums.length;right++){
            sum+=nums[right];
            while(left<=right&&sum>goal){
                sum-=nums[left];
                left++;
            }
            count=count+(right -left+1);
            
         }
         return count;

    }
}