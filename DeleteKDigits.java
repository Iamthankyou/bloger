//duynotes.blogspot.com
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        Stack<Character> stkReverse = new Stack<>();
        String res = "";
        
        for (char c:num.toCharArray()){
            while (!stk.isEmpty() && stk.peek()>c && k>0){
                stk.pop();
                k--;
            }      
            
            stk.push(c);
        }
        
        while (k>0){
            stk.pop();
            k--;
        }
        
        
        while (!stk.isEmpty()){
            stkReverse.push(stk.pop());
        }
        
        while (!stkReverse.isEmpty()){
            res+=stkReverse.pop();
        }
        
        while (res.length()>1 && res.charAt(0) == '0'){
            res = res.substring(1);
        }
        
        
        return res.length() == 0 ? "0" : res;
    }
}

