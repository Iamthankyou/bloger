//duynotes.blogspot.com
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int unique = 0;
        
        int [][] mat = new int[2][n+1];
        
        for (int i=0; i<=m; i++){
            unique = i&1;
            for (int j=0; j<=n; j++){
                
                if (j==0 || i ==0){
                    mat[unique][j]=0;
                }
                else if (text1.charAt(i-1)==text2.charAt(j-1)){
                    mat[unique][j]=mat[1-unique][j-1]+1;
                }
                else{
                    mat[unique][j]=Math.max(mat[1-unique][j],mat[unique][j-1]);
                }
                
            }
        }
        
        return mat[unique][n];
        
    }
}
