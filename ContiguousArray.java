// duynotes.blogspot.com
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,-1);
        int max =0;
        int count = 0;
        for (int i=0; i<nums.length; i++){
            count += nums[i]==1?1:-1;
            
            if (hashMap.containsKey(count)){
                max = Math.max(max,i-hashMap.get(count));
            }
            else{
                hashMap.put(count,i);
            }
            
        }
        return max;
    }
}
