class Solution {
    public int change(int amount, int[] coins) {
        int unique = 0;
        int dp[][] = new int[2][amount+1];
        
        if (amount == 0){
            return 1;
        }
        
        if (coins.length == 0){
            return 0;
        }
        
        for (int i=0; i<=coins.length; i++){
            for (int j=0; j<=amount; j++){
                unique = i&1;
                if (i==0||j==0){
                    if (i==0){
                        dp[unique][j] = 1;
                    }
                    else{
                        dp[unique][j] = 1;
                    }
                }
                else{
                    int prev = i>1 ? dp[1-unique][j] : 0;
            
                    int curr = 0;
                    if (j-coins[i-1]>=0){
                        curr = dp[unique][j-coins[i-1]];
                    }                    
                    
                    dp[unique][j] = prev + curr;
                }
                
            } 
            
        }
        
        return dp[unique][amount];
        
    }

}
