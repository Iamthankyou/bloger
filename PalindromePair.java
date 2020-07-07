class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        Trie dict = new Trie();
        
        for (int i=0; i<words.length; i++){
            dict.insert(words[i],i);
        }
        
        for (int i=0; i<words.length; i++){
            if (words[i].equals("")){
                for (int k=0; k<words.length; k++){
                    if (k!=i && isPalindrome(words[k]) == true){
                        List<Integer> tmp = new ArrayList<>();
                        
                        tmp.add(k);                            
                        tmp.add(i);  
                        
                        if (!res.contains(tmp)){
                            res.add(tmp);    
                        }
                        
                        tmp = new ArrayList<>();
                        
                        tmp.add(i);                            
                        tmp.add(k);    
                        res.add(tmp);
                    }
                }    
                
                continue;
            }
            
            StringBuilder s = new StringBuilder(words[i]);
            s.reverse();

            for (int j=0; j<s.length(); j++){
                int name = dict.search(s.toString().substring(0,j+1));
                // System.out.println(s.toString().substring(0,j+1));
                
                if (name != -1){
                    if (isPalindrome(words[i]+s.toString().substring(0,j+1)) == true){
                        // System.out.println(i+","+name);
                        if (i!=name){
                            List<Integer> tmp = new ArrayList<>();
                        
                            tmp.add(i);
                            tmp.add(name);
                            
                            if (!res.contains(tmp)){
                                res.add(tmp);    
                            }
                        }
                    }
                    
                    if (isPalindrome(s.toString().substring(0,j+1)+words[i]) == true){
                        // System.out.println(i+","+name);
                        if (i!=name){
                            List<Integer> tmp = new ArrayList<>();
                        
                            tmp.add(name);
                            tmp.add(i);
                            
                            if (!res.contains(tmp)){
                                res.add(tmp);    
                            }
                        }
                    }
                }
                
                name = dict.search(s.toString().substring(j));
                // System.out.println(s.toString().substring(0,j+1));
                
                if (name != -1){
                    if (isPalindrome(words[i]+s.toString().substring(j)) == true ){
                        // System.out.println(i+","+name);
                        if (i!=name){
                            List<Integer> tmp = new ArrayList<>();
                        
                            tmp.add(i);
                            tmp.add(name);
                            
                            if (!res.contains(tmp)){
                                res.add(tmp);    
                            }
                        }
                    }
                    
                    if (isPalindrome(s.toString().substring(j)+words[i]) == true){
                        // System.out.println(i+","+name);
                        if (i!=name){
                            List<Integer> tmp = new ArrayList<>();
                        
                            tmp.add(name);
                            tmp.add(i);
                            
                            if (!res.contains(tmp)){
                                res.add(tmp);    
                            }
                        }
                    }
                }
                
              
                
                name = dict.search(words[i].substring(0,j+1));
                // System.out.println(words[i].substring(0,j+1));
                
                if (name != -1){
                    if (isPalindrome(words[i]+words[i].substring(0,j+1)) == true) {
                        // System.out.println(i+","+name);
                        if (i!=name){
                            List<Integer> tmp = new ArrayList<>();
                        
                            tmp.add(i);
                            tmp.add(name);
                            if (!res.contains(tmp)){
                                res.add(tmp);    
                            }
                        }
                    }
                    
                    if (isPalindrome(words[i].substring(0,j+1)+words[i]) == true){
                        // System.out.println(i+","+name);
                        if (i!=name){
                            List<Integer> tmp = new ArrayList<>();
                        
                            tmp.add(name);
                            tmp.add(i);
                            if (!res.contains(tmp)){
                                res.add(tmp);    
                            }
                        }
                    }
                }
                
                
            }
        }
        
        return res;
    }
    
    public boolean isPalindrome(String s){
        // System.out.println(s);
        int i=0;
        int j=s.length()-1;
        
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
}

class Trie{
    private Node root;
    
    public Trie(){
        root = new Node();
    }
    
    public void insert(String s, int name){
        Node curr = root;
        
        for (char i:s.toCharArray()){
            int index = i-'a';
            
            if (curr.getArr()[index] == null){
                curr.getArr()[index] = new Node();
            }
            
            curr = curr.getArr()[index];
        }
        
        curr.setEndWord();
        curr.setName(name);
    }
    
    public int search(String s){
        Node curr = root;
        
        for (int i=0; i<s.length(); i++){
            int index = s.charAt(i)-'a';
            
            if (curr.getArr()[index]!=null){
                curr = curr.getArr()[index];
            }
            else{
                return -1;
            }
        }
        
        return curr.isEndWord() == true ? curr.getName() : -1;
    }
}

class Node{
    private Node[] arr;
    private boolean endWord;
    private int name;
    
    public Node(){
        arr = new Node[26];
        endWord = false;
        name = -1;
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
    
    public void setName(int n){
        this.name = n;
    }
    
    public int getName(){
        return name;
    }
}
