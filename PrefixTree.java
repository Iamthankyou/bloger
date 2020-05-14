//duynotes.blogspot.com
class Trie {
    private Node root;
    
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node curr = root;
        
        for (char i:word.toCharArray()){
          
            int index = i - 'a';
            if (curr.getArr()[index] == null){
                curr.getArr()[index] = new Node();
            }
            
            curr = curr.getArr()[index];
        }
        
        curr.setEndWord();
    }
    
    public boolean search(String word) {
        Node node = searchNode(word);
        
        if (node != null && node.isEndWord() == true){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Node node = searchNode(prefix);
        
        return node == null ? false : true;
    }
    
    private Node searchNode(String word){
        Node res = root;
        for (char i:word.toCharArray()){
            int index = i - 'a';
            if (res.getArr()[index] == null){
                return null;
            }
            else{
                res = res.getArr()[index];
            }
        }
        
        return res;
    }
}

class Node{
    private Node[] arr;
    private boolean endWord;
    
    public Node(){
        arr = new Node[26];
        endWord = false;
    }

    public Node[] getArr(){
        return arr;
    }
    
    public boolean isEndWord(){
        return endWord;
    }
    
    public void setEndWord(){
        endWord = true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
