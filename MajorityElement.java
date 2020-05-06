//duynotes.blogspot.com
class Solution {
    public int majorityElement(int[] nums) {
        int candicate = 0;
        int count = 0;
        
        for (int i:nums){
            if (count == 0){
                candicate = i;
            }
            
            count += i==candicate ? 1 : -1;
        }
        
        return candicate;
    }
}
