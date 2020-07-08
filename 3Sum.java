class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        
        Arrays.sort(nums);
        
        for (int i=0; i<nums.length; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int left = i+1;
            int right = nums.length-1;
            
            while (left<right){
                if (0-nums[i]==nums[left] + nums[right]){
                    List<Integer> tmp = new LinkedList<>();
                    
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    
                    while (left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                
                    while (left<right &&nums[right] == nums[right-1]){
                        right--;
                    }
                    
                    left++;
                    right--;
                }
                else if (0-nums[i]<nums[left]+nums[right]){
                    right--;
                }
                else{
                    left++;
                }
            }
            
        }
        
         return res;
    }
}
