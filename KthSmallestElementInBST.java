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
    public int kthSmallest(TreeNode root, int k) {
        int c = count(root.left);
        
        if (k<=c){
            return kthSmallest(root.left,k);
        }
        else if (k>c+1){
            return kthSmallest(root.right,k-1-c);
        }
        
        return root.val;
    }
    
    private int count(TreeNode node){
        if (node == null){
            return 0;
        }
        
        return 1+ count(node.left) + count(node.right);
    }
}
