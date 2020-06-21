class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int dp[][] = new int[m+1][n+1];
        int unique = 0;
                
        for (int i=m; i>=0; i--){
            unique = i&1;
            for (int j=n; j>=0; j--){
                if (i == m || j==n){
                    if ((i==m && j==n-1) || (i==m-1 && j==n)){
                        dp[unique][j] = 1;
                    }
                    else{
                        dp[unique][j] = Integer.MAX_VALUE;
                    }
                }
                else{
                    int minHp = Math.min(dp[1-unique][j],dp[unique][j+1]) - dungeon[i][j];
                    dp[unique][j] = minHp<1?1:minHp;

                }
            }
        }
        
        return dp[0][0];
    }
}
