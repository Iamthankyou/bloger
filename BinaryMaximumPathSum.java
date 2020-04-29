//duynotes.blogspot.com
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        DFS(root);
        return max;
    }
    
    private int DFS(TreeNode root){
        if (root == null){
            return 0;
        }
        
        int left = DFS(root.left);
        int right= DFS(root.right);
        
        max = Math.max(max,left+right+root.val);
        
        int curr = root.val + Math.max(0,Math.max(left,right));
        
        max = Math.max(curr,max);
        
        return curr;
    }
}
