//duynotes.blogspot.com
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor){
            dfs(image,sr,sc,newColor, image[sr][sc]);
        }
        
        return image;
    }
    
    private void dfs(int[][] image, int sr, int sc, int newColor, int color){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color){
            return;
        }
        
        image[sr][sc] = newColor;
        
        dfs(image,sr,sc-1,newColor,color);
        dfs(image,sr,sc+1,newColor,color);
        dfs(image,sr-1,sc,newColor,color);
        dfs(image,sr+1,sc,newColor,color);

        return;
    }
}
