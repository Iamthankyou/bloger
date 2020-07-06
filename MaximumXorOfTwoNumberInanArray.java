class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie dict = new Trie();
        int max = Integer.MIN_VALUE;
        
        for (int i:nums){
            dict.insert(i);
        }
        
        for (int i:nums){
            max = Math.max(max,dict.pieceMax(i));
        }
        
        return max;
    }
}

class Trie{
    private Node root;
    
    public Trie(){
        root = new Node();
    }
    
    public void insert(int n){
        Node curr = root;
        
        // Build trie include all bit of number follow level 
        for (int i=31; i>=0; i--){
            // Split binary code
            int bit = (n&(1<<i))!=0?1:0;
            
            if (curr.getArr()[bit]==null){
                curr.getArr()[bit] = new Node();
            }
            
            curr = curr.getArr()[bit];
        }
    }
    
    public int pieceMax(int n){
        Node curr = root;
        int sum = 0;
        
        for (int i=31; i>=0; i--){
            int bit = (n&(1<<i))!=0?1:0;
            int flipBit = bit==0?1:0;
            
            // if flipBit!=null -> have 0^1 OR 1%0 -> update sum, 1<<i is convert ith binary code to number
            if (curr.getArr()[flipBit] != null){
                sum+=(1<<i);
                // move to track other
                curr = curr.getArr()[flipBit];
            }
            else{
            // else keep going on 
                curr = curr.getArr()[bit];
            }
            
        }
        
        return sum;
    }
}

class Node{
    private Node[] arr;
    
    public Node(){
        arr = new Node[2];
    }
    
    public Node[] getArr(){
        return arr;
    }
}
