class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Trie map = new Trie();
        StringBuilder res = new StringBuilder();
        
        for (String i:dict){
            map.insert(i);    
        }
        
        for (String i:sentence.split("\\s+")){
            if (res.length()>0){
                res.append(" ");    
            }
            
            res.append(map.searchNode(i));
        }
        
        return res.toString();
    }
}

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
        curr.setWord(word);
    }
    
    public String searchNode(String word){
        Node res = root;
        
        for (char i:word.toCharArray()){
            int index = i - 'a';
            if (res.getArr()[index] == null && res.getWord()!=null){
                break;
            }
            
            if (res.getWord().length()>0){
                return res.getWord();
            }
            
            res = res.getArr()[index];
        }
        
        return res.getWord().length()>0?res.getWord():word;
    }
}

class Node{
    private Node[] arr;
    private boolean endWord;
    private String word;
    
    public Node(){
        arr = new Node[26];
        endWord = false;
        word = "";
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
    
    public void setWord(String word){
        this.word = word;
    }
    
    public String getWord(){
        return word;
    }
}
