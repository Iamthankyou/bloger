class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(0,nums.length-1,nums,target);
    }
    
    private int search(int left, int right,int[] nums, int target){
        int mid = (left+right)/2;
        
        if (nums[mid] == target){
            return mid;
        }
        
        if (left>right){
            return left;
        }
        
        if (nums[mid] > target){
            return search(left,mid-1,nums,target);
        }
        else{
            return search(mid+1,right,nums,target);
        }
    }
}
