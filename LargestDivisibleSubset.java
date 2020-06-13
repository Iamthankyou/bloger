class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int max = 0;
        int index = -1;
        
        if (nums.length == 0){
            List<Integer> list = new ArrayList<>();
            return list;
        }
        
        if (nums.length == 1){
            List<Integer> list =new ArrayList<>();
            list.add(nums[0]);
            return list;
        }
    
        Arrays.sort(nums);
        
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        
        int id[] = new int[nums.length];
        Arrays.fill(id,-1);
        
        for (int i=0; i<nums.length; i++){
            for (int j=i-1; j>=0; j--){
                if (nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                    id[i] = j;
                }
                
                if (max<dp[i]){
                    max = dp[i];
                    index = i;
                }
            }
        }
        
        List<Integer> res = new ArrayList<>();
        
        while (index>=0){
            res.add(nums[index]);
            index = id[index];
        }
        
        return res;
    }
}
