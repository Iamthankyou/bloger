class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        find(0,new ArrayList<Integer>(),res, nums);
        
        return res;
    }
    
    private void find(int index, List<Integer> curr, List<List<Integer>> res, int nums[]){
        res.add(new ArrayList<>(curr));
        
        for (int i=index; i<nums.length; i++){
            curr.add(nums[i]);
            find(i+1,curr,res,nums);
            curr.remove(curr.size()-1);
        }
        
        return;
    }
    
    
}
