class Solution {
    public String removeDuplicateLetters(String s) {
        int map[] = new int[26];
        boolean visited[] = new boolean[26];
        Stack<Character> stk = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for (char i:s.toCharArray()){
            map[i-'a']++;
        }
        
        for (char i:s.toCharArray()){
            map[i-'a']--;
         
            if (visited[i-'a']){
                continue;
            }
            
            while (!stk.isEmpty() && i<stk.peek() && map[stk.peek()-'a']>0){
                visited[stk.pop()-'a'] = false;
            }
                                                         
            stk.push(i);
            visited[i-'a'] = true;
        }
        
        while (!stk.isEmpty()){
            res.append(stk.pop());
        }
                                                         
        return res.reverse().toString();
    }
}
