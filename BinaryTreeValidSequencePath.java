// duynotes.blogspot.com
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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return DFS(root,0,arr);
    }
    
    private boolean DFS(TreeNode root, int i, int[] arr){
        if (root == null || i>arr.length-1){
            return false;
        }
        
        if (root.val != arr[i]){
            return false;
        }
        
        if (root.left == null && root.right == null && i == arr.length-1 && root.val == arr[i]){
            return true;
        }
        
        return DFS(root.left,i+1,arr) || DFS(root.right,i+1,arr);
            
    }
}
