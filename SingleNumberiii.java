class Solution {
    public int[] singleNumber(int[] nums) {
        int xy = 0;
        int a = 0,b=0;
        
        for (int i:nums){
            xy^=i;
        }
        
        xy&=-xy;
        
        for (int i:nums){
            if ((xy&i)==0){
                a^=i;        
            }
            else{
                b^=i;
            }
        }
        
        return new int[]{a,b};
    }
}
