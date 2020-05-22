class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][]dp = new int[2][n+1];
        
        int res = 0;
        int unique = 0;
        
        for (int[] arr:matrix){
            for (int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                unique = i&1;
                
                if (i==0 || j==0){
                    dp[unique][j] = 0;
                }
                else if (matrix[i-1][j-1] == 0){
                    dp[unique][j] = 0;
                }
                else{
                    dp[unique][j] = min(dp[1-unique][j],dp[1-unique][j-1],dp[unique][j-1]) + 1;
                }
                res+=dp[unique][j];
            }
        }
        
        return res;
    }
    
    private int min(int a, int b, int c){
        return a<b && a<c ? a: b<c ? b:c;
    }
}
