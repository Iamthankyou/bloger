class WordDictionary {
    private Node root;
    
    public WordDictionary() {
        root = new Node();    
    }
    
    public void addWord(String word) {
        Node curr1 = root;
        
        for (char i:word.toCharArray()){
            int index = i - 'a';
            
            if (curr1.getArr()[index] == null){
                curr1.getArr()[index] = new Node();
            }
            
            curr1 = curr1.getArr()[index];
        }
        
        curr1.setEndWord();
    }
    
    public boolean search(String word) {
        return searchNode(root,word,0,false);
    }
    
    private boolean searchNode(Node curr, String word, int i, boolean ans){
            int index = 0;
        
            if (i==word.length()){
                if (curr.isEndWord() == true){
                    return true;
                }
                
                return false;
            }
            
            if (word.charAt(i)=='.'){
                for (int j=0; j<26; j++){
                    if (curr.getArr()[j] != null){
                        if (searchNode(curr.getArr()[j],word,i+1,ans) == true){
                           // My key
			     	return true;
                        }
                    }
                    
                }
            }
            else{
                index = word.charAt(i) -'a';
            }
            
            if (curr.getArr()[index]==null){
                return false;
            }
            
            return searchNode(curr.getArr()[index],word,i+1,ans);
        
    }
}

class Node{
    private Node[] arr;
    private boolean isEndWord;
    
    public Node(){
        arr = new Node[26];
        isEndWord = false;
    }
    
    public Node[] getArr(){
        return arr;
    }
    
    public boolean isEndWord(){
        return isEndWord;
    }
    
    public void setEndWord(){
        isEndWord = true;
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
