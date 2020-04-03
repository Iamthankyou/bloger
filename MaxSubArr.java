// duynotes blog
class Solution {
    public int maxSubArray(int[] nums) {
        int bestSum = nums[0];
        int currSum = nums[0];
        
        for (int i=1; i<nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            if (currSum>bestSum){
                bestSum=currSum;
            }
        }
        
        return bestSum;
    }
}
