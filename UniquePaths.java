class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[2][n+1];
        int unique = 1;
        
        dp[0][1] = 1;        
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                unique = i&1;                    
                dp[unique][j] = dp[unique][j-1] + dp[1-unique][j];
            }
        }
        
        return dp[unique][n];
    }
}
