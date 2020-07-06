class MapSum {
    private Node root;
    
    public MapSum() {
        root = new Node();    
    }
    
    public void insert(String key, int val) {
        Node curr = root;
        
        if (search(key) == true){
            for (char c:key.toCharArray()){
                int index = c - 'a';
            
                if (curr.getArr()[index] == null){
                    curr.getArr()[index] = new Node();
                }
            
                curr.setN(val);
                curr = curr.getArr()[index];
            }       
        
            curr.setN(val);
            curr.setEndWord();
        }
        else{
                   for (char c:key.toCharArray()){
            int index = c - 'a';
            
            if (curr.getArr()[index] == null){
                curr.getArr()[index] = new Node();
            }
            
            curr.setN(curr.getN()+val);
            curr = curr.getArr()[index];
        }
        
        curr.setN(curr.getN()+val);
        curr.setEndWord();
        // Set End Word
        }
    }
    
    public boolean search(String word){
        Node res = searchNode(word);
        
        if (res==null){
            return false;
        }
        
        return res.isEndWord() == true ? true: false;
    }
    
    public int sum(String prefix) {
        Node res = searchNode(prefix);
        
        if (res!=null){
            return res.getN();
        }
        
        return 0;
    }
    
    private Node searchNode(String s){
        Node res = root;
        
        for (char i:s.toCharArray()){
            int index = i - 'a';
            
            if (res.getArr()[index] == null){
                return null;
            }
            
            res = res.getArr()[index];
        }
        
        return res;
    }
    
}

class Node{
    private Node[] arr;
    private int n;
    private boolean isEndWord;
    
    public Node(){
        arr = new Node[26];
        n = 0;
        isEndWord = false;
    }
    
    public Node[] getArr(){
        return arr;
    }
    
    public int getN(){
        return n;
    }
    
    public void setN(int n){
        this.n = n;
    }
    
    public boolean isEndWord(){
        return isEndWord;
    }
    
    public void setEndWord(){
        isEndWord = true;
    }
}
/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
