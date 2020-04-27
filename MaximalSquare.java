//duynotes.blogspot.com
class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length==0 || matrix[0].length==0){
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] dp = new int[2][n+1];
        
        int unique = 0;
        int max = 0;
    
        
        for (int i=0; i<=m; i++){
            unique = i & 1;
            for (int j=0; j<=n; j++){
                if (i==0 || j==0){
                    dp[unique][j] = 0; 
                }
                else if (matrix[i-1][j-1]=='1'){
                    dp[unique][j] = min(dp[unique][j-1],dp[1-unique][j],dp[1-unique][j-1]) + 1;
                }
                else{
                    dp[unique][j]=0;
                }
                
                max = Math.max(max,dp[unique][j]);
            }
        }
        
        return max*max;
    }
    
    private int min(int a, int b, int c){
        return a<b && a<c ? a: (b<c)? b:c;
    }
}
