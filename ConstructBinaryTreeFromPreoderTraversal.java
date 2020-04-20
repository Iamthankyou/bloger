//duynotes.blogspot.com
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        for (int i=1; i<preorder.length; i++){
            if (stack.peek().val>preorder[i]){
                TreeNode node = new TreeNode(preorder[i]);
                stack.peek().left = node;
                stack.push(node);
            }
            else{
                TreeNode curr = new TreeNode();
                while (!stack.empty() && stack.peek().val<preorder[i]){
                    curr = stack.pop();
                }
                TreeNode node = new TreeNode(preorder[i]);
                curr.right = node;
                stack.push(curr.right);
            }
        }
        return root;
    }
}
