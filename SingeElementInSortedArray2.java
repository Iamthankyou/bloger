//duynotes.blogspot.com
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for (int i=0, j=1; i<nums.length && j<nums.length; i+=2,j+=2){
            if (nums[i]!=nums[j]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    
}
