// duynotes.blogspot.com
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        int sum = 0;
        hm.put(0,1);
        
        for (int i:nums){
            sum+=i;
            res+=hm.getOrDefault(sum-k,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        
        return res;
    }
}
