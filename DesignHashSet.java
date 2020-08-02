class MyHashSet {
    private Node root;
    
    private boolean isRed(Node x){
        if (x == null){
            return false;
        }
        
        return x.color == true;
    }
    
    private Node rotateLeft(Node e){
        Node s = e.right;
        e.right = s.left;
        s.left = e;
        
        s.color = e.color;
        e.color = true;
        
        return s;
    }
    
    private Node rotateRight(Node s){
        
        Node e = s.left;
        s.left = e.right;
        e.right = s;
        
        e.color = s.color;
        s.color = true;
        
        return e;
    }
        
    private void flipColor(Node x){
        x.color = true;
        
        if (x.left!=null){
            x.left.color = false;    
        }
        
        if (x.right!=null){
            x.right.color = false;            
        }
    }
    
    
    
    public class Node{
        private int key;
        private Node left,right;
        private boolean color;
        
        public Node(int key, boolean color){
            this.key = key;
            this.color = color;
        }
        
    }

    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    private Node put(Node root, int key){
        if (root == null){
            return new Node(key,true);
        }
        
        if (key<root.key){
            root.left = put(root.left,key);
        }
        else if (key>root.key){
            root.right = put(root.right,key);
        }
        else{
            root.key = key;
        }
        
        if (isRed(root.right) && !isRed(root.left)){
            root = rotateLeft(root);
        }
        
        if (isRed(root.left) && isRed(root.left.left)){
            root = rotateRight(root);
        }
        
        if (isRed(root.left) && isRed(root.right)){
            flipColor(root);
        }
        
        return root;
    }
    
    public void add(int key) {
        // System.out.println(key);
        root = put(root,key);
        root.color = false;
    }
    
    private Node balance(Node x){
        if (!isRed(x.left) && isRed(x.right)){
            x = rotateLeft(x);
        }
        
        if (isRed(x.left) && isRed(x.left.left)){
            x = rotateRight(x);
        }
        
        if (isRed(x.left) && isRed(x.right)){
            flipColor(x);
        }
        
        return x;
    }
    
    private Node moveRedLeft(Node x){
        // x.left && x.left.left is black
        flipColor(x);
        
        if (isRed(x.right.left)){
            x.right = rotateRight(x.right);
            x = rotateLeft(x);
            flipColor(x);
        }
        
        return x;
    }
    
    private Node moveRedRight(Node x){
        // x.right && x.right.left is black
        flipColor(x);
        
        if (!isRed(x.left.left)){
            x = rotateRight(x);
        }
        
        return x;
    }
    
    private void deleteMin(){
        if (!isRed(root.left) && !isRed(root.right)){
            root.color = true;
        }
        
        root = deleteMin(root);
    
        if (root!=null){
            root.color= false;            
        }
    }
    
    private Node deleteMin(Node x){
        if (x.left == null){
            return null;
        }
        
        if (!isRed(x.left) && !isRed(x.left.left)){
            x = moveRedLeft(x);
        }
        
        x.left = deleteMin(x.left);
        
        return balance(x);
    }
    
    private int min(Node x){
        if (x.left == null){
            return x.key;
        }
        
        return min(x.left);
    }
    
    private Node delete(Node rooot, int key){
        if (key<rooot.key){
            if (!isRed(rooot.left) && !isRed(rooot.left.left)){
                rooot = moveRedLeft(rooot);
            }
            
            rooot.left = delete(rooot.left,key);
        }
        else{
            if (isRed(rooot.left)){
                rooot = rotateRight(rooot);
            }
            
            if (key == rooot.key && rooot.right == null){
                return null;
            }
            
            if (!isRed(rooot.right) && !isRed(rooot.right.left)){
                System.out.println(rooot.key);
                rooot = moveRedRight(rooot);
                System.out.println(rooot.key);
            }
            
            if (key == rooot.key){
                rooot.key = min(rooot.right);
                rooot.right = deleteMin(rooot.right);                
            }
            else{
                rooot.right = delete(rooot.right,key);
            }
        }
        
        return balance(rooot);
    }
    
    public void remove(int key) {
        if (contains(key)){
            root = delete(root,key);            
            // System.out.println("ok");
        }
    }
    
    public boolean search(Node x, int key){
        if (x==null){
            return false;
        }
        
        if (key<x.key){
            return search(x.left,key);
        }
        else if (key>x.key){
            return search(x.right,key);
        }
        else{
            return true;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return search(root,key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
