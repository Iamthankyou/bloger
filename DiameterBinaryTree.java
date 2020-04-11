// duynotes.blogspot.com
public class Solution {
    private int max = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max-1;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right+1);
        
        return Math.max(left, right) + 1;
    }
}
