class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int dp[][] = new int[2][m+1];
        int unique = 0;
        
        if (n == 0){
            return m;
        }
        
        for (int i=0; i<=n; i++){
            for (int j=0; j<=m; j++){
                unique = i&1;
                if (i==0 || j == 0){
                    dp[unique][j] = i==0?j:i;
                }
                else{
                    if (word2.charAt(i-1) == word1.charAt(j-1)){
                        dp[unique][j] = dp[1-unique][j-1];
                    }
                    else{
                        dp[unique][j] = min(dp[1-unique][j],dp[unique][j-1],dp[1-unique][j-1]) + 1;
                    }
                }
                
            }
        }
        
        return dp[unique][m];
    }
    
    private int min(int a, int b, int c){
        return a<b&&a<c?a:b<c?b:c;
    }
}
