class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        slow = nums[slow];
        fast = nums[nums[fast]];
        
        while (slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];      
        }
        
        fast = slow;
        slow = nums[0];
        
        while (fast!=slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}