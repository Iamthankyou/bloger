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
    private Node nodeX;
    private Node nodeY;
    
    public boolean isCousins(TreeNode root,int x, int y) {
        dfs(root,root,x,y,0);
        return (nodeX.getParent() != nodeY.getParent() && nodeX.getDepth() == nodeY.getDepth());
    }
    
    private void dfs(TreeNode root,TreeNode parent, int x, int y, int depth){
        if (root == null){
            return;
        }    
        
        if (root.val == x){
            nodeX = new Node(parent.val,depth,root.val);
        }
        
        if (root.val == y){
            nodeY = new Node(parent.val,depth,root.val);
        }
        
        dfs(root.left,root,x,y,depth+1);
        dfs(root.right,root,x,y,depth+1);
    }

}

class Node{
    private int parent;
    private int depth;
    private int val;
    
    public Node(int parent, int depth, int val){
        this.parent = parent;
        this.depth = depth;
        this.val = val;
    }
    
    public int getParent(){
        return parent;
    }
    
    public int getDepth(){
        return depth;
    }
    
    public int getVal(){
        return val;
    }
}
