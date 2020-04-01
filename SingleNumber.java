// duynotes.blogspot.com
class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0, sumSet = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for (int i:nums){
            hs.add(i);
            sum+=i;
        }
        
        for (int i:hs){
            sumSet+=i;    
        }
        return sumSet*2-sum;
    }
}
