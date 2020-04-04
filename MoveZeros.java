class Solution {
    public void moveZeroes(int[] nums) {
        int tail=0;
        for (int i: nums){
            if (i!=0){
                nums[tail++]=i;
            }
        }
        
        while(tail<nums.length){
            nums[tail++]=0;
        }
    }
}
