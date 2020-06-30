class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        HashSet<String> set = new HashSet<>();
        Trie dict = new Trie();
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for (String i:words){
            dict.insert(i);
        }
        
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                dfs(set,i,j,"",dict,board,visited);
            }
        }
        
        return new ArrayList<String>(set);
    }
    
    private void dfs(HashSet<String> set, int i, int j, String s, Trie dict, char[][] board, boolean[][] visited){
        if (i<0 || j<0 || i>=board.length || j>=board[0].length){
            return;
        }
        
        if (visited[i][j] == true){
            return;
        }
        
        s+=board[i][j];
        
        if (!dict.startWith(s)){
            return;
        }
        
        if (dict.search(s)){
            set.add(s);
        }
        
        
        visited[i][j] = true;
        dfs(set,i-1,j,s,dict,board,visited);
        dfs(set,i+1,j,s,dict,board,visited);
        dfs(set,i,j+1,s,dict,board,visited);
        dfs(set,i,j-1,s,dict,board,visited);
        visited[i][j] = false;        
        
        return;
    }
    
}

class Trie{
    private Node root;
    
    public Trie(){
        root = new Node();
    }
    
    public void insert(String word){
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
    
    public boolean search(String word){
        Node node = searchNode(word);
        
        if (node != null && node.isEndWord() == true){
            return true;
        }
        
        return false;
    }
    
    private Node searchNode(String word){
        Node res = root;
        
        for (char i:word.toCharArray()){
            int index = i-'a';
            
            if (res.getArr()[index] == null){
                return null;
            }
            
            res = res.getArr()[index];
        }
        
        return res;
    }
    
    public boolean startWith(String prefix){
        Node node = searchNode(prefix);
        
        return node == null ? false : true;
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
