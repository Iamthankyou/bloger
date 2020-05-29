class Solution {
    public int[] countBits(int num) {
        int [] dp = new int[num+1];
        
        int res = 0;
        
        for (int i=1; i<=num; i++){
            if ((i&1)==0){
                dp[i]=dp[i>>1];
            }    
            else{
                dp[i]=dp[i>>1]+1;
            }
            res+=dp[i];
        }
        
        return dp;
    }
}
