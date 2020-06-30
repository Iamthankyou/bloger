class Solution {
    public boolean exist(char[][] board, String word) {
        Trie dict = new Trie();
        boolean[][] visited = new boolean[board.length][board[0].length]; 
            
        dict.insert(word);
        
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if (dfs(i,j,dict,visited,board,word,0) == true){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(int i, int j, Trie dict, boolean[][] visited, char[][] board,String word,int k){
        if (i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }
        
        if (board[i][j] == word.charAt(k)){
            char tmp = board[i][j];
            board[i][j] = '?';
            
            if (k == word.length()-1){
                return true;
            }
            else if (dfs(i,j-1,dict,visited,board,word,k+1) == true ||dfs(i,j+1,dict,visited,board,word,k+1)== true||dfs(i-1,j,dict,visited,board,word,k+1) == true||dfs(i+1,j,dict,visited,board,word,k+1) == true){
                return true;
            }
            
            board[i][j] = tmp;
        }       

        return false;
    }
    
}

class Node{
    private Node[] arr;
    private boolean endWord;
    
    public Node(){
        arr = new Node[100];
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

class Trie{
    private Node root;
    
    public Trie(){
        root = new Node();
    }
    
    public void insert(String s){
        Node curr = root;
        
        for (char i: s.toCharArray()){
            int index = i - 'A';
            
            if (curr.getArr()[index] == null){
                curr.getArr()[index] = new Node();
            }
            
            curr = curr.getArr()[index];
        }
        
        curr.setEndWord();
    }
    
    private Node searchNode(String s){
        Node res = root;
        
        for (char i:s.toCharArray()){
            int index = i - 'A';
            
            if (res.getArr()[index] == null){
                return null;
            }
            
            res = res.getArr()[index];
        }
        
        return res;
    }
    
    public boolean search(String s){
        Node res = searchNode(s);
        
        if (res != null && res.isEndWord()){
            return true;
        }
        
        return false;
    }
    
    public boolean startWith(String s){
        Node res = searchNode(s);
        
        return res == null ? false : true;
    }
}
