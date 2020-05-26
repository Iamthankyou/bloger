class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int m= A.length;
        int n= B.length;
        
        if (m==0 || n==0){
            return 0;
        }
        
        int dp[][] = new int[2][n+1];
        int unique = 0;
        
        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                unique = i&1;
                if (i==0 || j==0){
                    dp[unique][j] = 0;
                }
                else if (A[i-1]==B[j-1]){
                    dp[unique][j] = max(dp[1-unique][j],dp[unique][j-1],dp[1-unique][j-1] + 1);
                }
                else{
                    dp[unique][j] = Math.max(dp[1-unique][j],dp[unique][j-1]);
                }
            }
        }
        
        return dp[unique][n];
    }
    
    private int max(int a, int b, int c){
        return a>b&&a>c?a:b>c?b:c;
    }
}
