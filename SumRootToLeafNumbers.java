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
    public int sumNumbers(TreeNode root) {
        return dfs(root,0,0);
    }
    
    private int dfs(TreeNode root, int num, int sum){
        if (root == null){
            return sum;
        }
        
        num = num*10 + root.val;
        
        if (root.left == null && root.right == null){
            sum+=num;
            return sum;
        }
        
        return dfs(root.left,num,sum) + dfs(root.right,num,sum);          
    }
    
}
