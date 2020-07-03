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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root == null){
            return res;
        }
        
        queue.add(root);
        
        while (!queue.isEmpty()){
            List<Integer> curr = new ArrayList<>();
            int size = queue.size();
            
            for (int i=0; i<size; i++){
                TreeNode first = queue.remove();
                curr.add(first.val);
                
                if (first.left != null){
                    queue.add(first.left);
                }
                
                if (first.right != null){
                    queue.add(first.right);
                }
            }
            
            res.add(curr);
        }
        
        return res;   
    }
}
