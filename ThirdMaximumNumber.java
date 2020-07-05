class Solution {
    public int thirdMax(int[] nums) {
        int f=Integer.MIN_VALUE+1;
        int s=Integer.MIN_VALUE+1;
        int t=Integer.MIN_VALUE+1;
        
        for (int i:nums){
            // distict number
            if (f == i || s==i || t==i){
                continue;
            }
            
            if (f==Integer.MIN_VALUE+1|| i>f){
                t=s;
                s=f;
                f=i;
            }
            else if (s==Integer.MIN_VALUE+1 || i>s){
                t=s;
                s=i;
            }
            else if (t==Integer.MIN_VALUE+1 || i>t){
                t=i;                
            }
        }
            
        return t==Integer.MIN_VALUE+1?f:t;
    }
}
