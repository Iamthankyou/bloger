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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        int max = 0;
        
        queue.offer(new Pair(root,0));
        
        while (!queue.isEmpty()){
            Pair first = queue.peek();
            int size = queue.size();
            Pair curr = null;
            
            while (size-- >0){
                curr = queue.poll();
                
                if (curr.getNode().left !=null){
                    queue.offer(new Pair(curr.getNode().left,curr.getVal()*2));
                }
                
                if (curr.getNode().right !=null){
                    queue.offer(new Pair(curr.getNode().right,curr.getVal()*2+1));
                }
            }
            
            max = Math.max(max,curr.getVal()-first.getVal()+1);
        }
        
        return max;
    }
}

class Pair{
    private TreeNode node;
    private int val;
    
    public Pair(TreeNode node,int val){
        this.node = node;
        this.val = val;
    }
    
    public TreeNode getNode(){
        return node;
    }
    
    public int getVal(){
        return val;
    }
}
