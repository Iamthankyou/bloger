//duynotes.blogspot.com
class Solution {
    public int singleNonDuplicate(int[] nums) {
        return search(nums,0,nums.length-1);
    }
    
    private int search(int[] nums, int left, int right){
        int mid = (left + right)/2;
        
        if (left <right){
            if (nums[mid] == nums[mid+1]){
                if ((mid & 1) == 0){
                    return search(nums,mid + 2,right);
                }
                else{
                    return search(nums,left,mid-1);
                }
            }
            else if (nums[mid] == nums[mid-1]){
                if ((mid&1) == 0){
                    return search(nums,left,mid-2);
                }
                else{
                    return search(nums,mid+1,right);
                }
            }
            else{
                return nums[mid];
            }
        }
        
        return nums[left];
    }
}
